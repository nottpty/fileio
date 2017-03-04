package ku.util;

/**
 * Copy the InputStream to the OutputStream using a BufferedReader to read
 * the InputStream and PrintWriter to write the OutputStream. Read and write
 * one line at a time.
 * 
 * @author Patinya Yongyai
 *
 */
public class BufferReaderCopyTask extends FileCopyTask {

	/**
	 * Initialize a BufferReaderCopyTask with names of the input and output
	 * files to use.
	 * 
	 * @param infile
	 *            name of the file to use as input
	 * @param outfile
	 *            name of the file to use as output
	 */
	public BufferReaderCopyTask(String infilename, String outfilename) {
		super(infilename, outfilename);
	}

	/** Perform the copy */
	public void run() {
		FileUtil.bcopy(in, out);
	}

	/** Describe the task. */
	public String toString() {
		return "Copy a file using BufferedReader and PrintWriter";
	}
}
