package org.ourgrid.browser.client.fs;

public class FileSystem {

	public native void getAndMountFile(String filePath, String fileName, FileSystemCallback fsc) /*-{
		
		var clientArgs = new XMLHttpRequest();
		
		clientArgs.onreadystatechange = function handlerArgs() {
 	  		if(this.readyState == 4 && this.status == 200) {
	 	  		$wnd.FS.createDataFile(".", fileName, this.response, true, true);
	 	  		fsc.@org.ourgrid.browser.client.fs.FileSystemCallback::operationDone()(); 	  		
 			}
 	  	};
 	  	
		clientArgs.open("GET", filePath);
		clientArgs.send();
		
	}-*/;
	
	public native Uint8Array readFile(String filePath) /*-{
		var fileObj = $wnd.FS.findObject(filePath);
		return fileObj.contents;
	}-*/;
	
	public native void clearSandbox() /*-{
		var sandbox = $wnd.FS.findObject(".");
		sandbox.contents = {};
	}-*/;
	
}
