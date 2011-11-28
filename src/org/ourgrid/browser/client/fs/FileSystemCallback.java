package org.ourgrid.browser.client.fs;

public class FileSystemCallback {

	private int i;
	
	public void operationDone() {
		i++;
	}
	
	public int getDoneOperations() {
		return i;
	}
}
