package ku.util;

/**
 * Copy the InputStream to the OutputStream one byte at a time. Close the
 * InputStream and OutputStream when finished.
 * 
 * @author Patinya Yongyai
 *
 */
public class ByteCopyTask extends FileCopyTask{
	
	/**
	 * Initialize a ByteCopyTask with names of the input and output
	 * files to use.
	 * 
	 * @param infile
	 *            name of the file to use as input
	 * @param outfile
	 *            name of the file to use as output
	 */
	public ByteCopyTask(String infilename, String outfilename){
		super(infilename, outfilename);
	}
	
	/** Perform the copy */
	public void run() {
		FileUtil.copy(in, out);
	}
	/** Describe the task. */
	public String toString() {
		return "Copy file one byte at a time.";
	}
}
