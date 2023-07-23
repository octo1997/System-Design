package designPattern.bridge;

import java.io.File;

public interface PlaformDownloader {
	public boolean storeFileData(File f);
	public File downloadFileData();
}
