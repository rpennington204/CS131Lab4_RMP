import java.util.Scanner;
import java.util.ArrayList;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList <String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();
		
	}//end getArrayListSize
	
	public void processFile() {
		
		
	}//end processFile

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getStringLength() {
		return stringLength;
	}

	public void setStringLength(int stringLength) {
		if (stringLength < 5) {
			this.stringLength = 5;
		}
		else {
			this.stringLength = stringLength;
		}
	}
	

	
	
}//end class
