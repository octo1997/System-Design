package designPattern.bridge;

import java.io.File;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {
	private PlaformDownloader platform;
	
	

	public FileDownloaderAbstractionImpl(PlaformDownloader platform) {
		super();
		this.platform = platform;
	}

	@Override
	public boolean storeData(File f) {
		// TODO Auto-generated method stub
		return platform.storeFileData(f);
	}

	@Override
	public File downloadData() {
		// TODO Auto-generated method stub
		return platform.downloadFileData();
	}

	
}
