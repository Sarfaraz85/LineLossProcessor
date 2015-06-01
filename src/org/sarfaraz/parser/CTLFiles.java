package org.sarfaraz.parser;

import java.util.Date;

public class CTLFiles {

	private String filename;
	private Date fileDate;
	private String fileType;
	
	
	@Override
	public String toString() {
		return "CTLFiles [filename=" + getFilename() + ", fileDate=" + getFileDate()
				+ ", fileType=" + getFileType() + "]";
	}
	
	public CTLFiles(String filename, Date fileDate, String fileType){
		this.filename=filename;
		this.fileDate=fileDate;
		this.fileType=fileType;
				
	}

	public String getFilename() {
		return filename;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public String getFileType() {
		return fileType;
	}

}
