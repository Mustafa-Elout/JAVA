import java.io.File;

public class FileWrriten extends File {
	
	String fileName;
	boolean append;

	public FileWrriten(String string, boolean b) {
		super(string);
		this.fileName=string;
		this.append=b;
	}




}
