package designPattern.bridge;

import java.io.File;

public class LinuxFileDownloader implements PlaformDownloader {

	@Override
	public boolean storeFileData(File f) {
		// TODO Auto-generated method stub
		System.out.println("Stored file on Linux!");
		return false;
	}

	@Override
	public File downloadFileData() {
		// TODO Auto-generated method stub
		System.out.println("Downloaded file on Linux!");
		return null;
	}

}
