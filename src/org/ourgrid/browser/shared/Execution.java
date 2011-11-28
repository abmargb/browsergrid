package org.ourgrid.browser.shared;

import java.io.Serializable;
import java.util.List;

public class Execution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> inputFiles;
	private String execFile;
	private List<String> outputFiles;
	private String id;
	private String jobName;
	
	public List<String> getInputFiles() {
		return inputFiles;
	}
	
	public void setInputFiles(List<String> inputFiles) {
		this.inputFiles = inputFiles;
	}
	
	public String getExecFile() {
		return execFile;
	}
	
	public void setExecFile(String execFile) {
		this.execFile = execFile;
	}
	
	public List<String> getOutputFiles() {
		return outputFiles;
	}
	
	public void setOutputFiles(List<String> outputFiles) {
		this.outputFiles = outputFiles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
}
