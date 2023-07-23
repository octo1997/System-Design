package designPattern.bridge;

public class Executor {
	private static OS os = OS.LINUX;
	public static void main(String[] args) {
		FileDownloaderAbstraction fda = null;
		
		switch (os) {
			case REDHAT:
				fda = new FileDownloaderAbstractionImpl(new RedHatFileDownloader());
				break;
			case LINUX:
				fda = new FileDownloaderAbstractionImpl(new LinuxFileDownloader());
				break;
			default:
				break;
		}
		
		
		fda.downloadData();
		fda.storeData(null);

	}

}
