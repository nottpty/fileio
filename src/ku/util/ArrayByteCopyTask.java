package ku.util;

/**
 * Copy the InputStream to the OutputStream using a byte array of size
 * blocksize. Close the InputStream and OutputStream when finished.
 * 
 * @author Patinya Yongyai
 *
 */
public class ArrayByteCopyTask extends FileCopyTask {
	/** Size of a byte array. */
	private int blocksize;

	/**
	 * Initialize a ArrayByteCopyTask with names of the input, output
	 * files and block size to use.
	 * 
	 * @param infilename
	 *            name of the file to use as input
	 * @param outfilename
	 *            name of the file to use as output
	 * @param blocksize
	 *            Size of a byte array.
	 */
	public ArrayByteCopyTask(String infilename, String outfilename, int blocksize) {
		super(infilename, outfilename);
		this.blocksize = blocksize;
	}

	/** Perform the copy */
	public void run() {
		FileUtil.copy(in, out, blocksize);
	}

	/** Describe the task. */
	public String toString() {
		return "Copy a file using a byte array of size " + this.blocksize + " Bytes";
	}
}
