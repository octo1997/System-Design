package designPattern.bridge;

import java.io.File;

public interface FileDownloaderAbstraction {
	public boolean storeData(File f);
	public File downloadData();
}
