package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * FileUtil is a super class for using copy method in this class.
 * 
 * @author Patinya Yongyai
 *
 */
public class FileUtil {
	/**
	 * Copy the InputStream to the OutputStream one byte at a time. Close the
	 * InputStream and OutputStream when finished.
	 * 
	 * @param in
	 *            The InputStream that data will be read form.
	 * @param out
	 *            The OutputStream that data will be written to.
	 */
	static void copy(InputStream in, OutputStream out) {
		int data;
		try {
			while ((data = in.read()) >= 0) {
				out.write(data);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Copy the InputStream to the OutputStream using a byte array of size
	 * blocksize. Close the InputStream and OutputStream when finished.
	 * 
	 * @param in
	 *            The InputStream that data will be read form.
	 * @param out
	 *            The OutputStream that data will be written to.
	 * @param blocksize
	 *            Size of a byte array.
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] data = new byte[blocksize];
		int nRead;
		try {
			while ((nRead = in.read(data)) >= 0) {
				out.write(data, 0, nRead);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Copy the InputStream to the OutputStream using a BufferedReader to read
	 * the InputStream and PrintWriter to write the OutputStream. Read and write
	 * one line at a time.
	 * 
	 * @param in
	 *            The InputStream that data will be read form.
	 * @param out
	 *            The OutputStream that data will be written to.
	 */
	static void bcopy(InputStream in, OutputStream out) {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(in));
		PrintWriter printWriter = new PrintWriter(out);
		String line = null;
		try {
			while ((line = bufferReader.readLine()) != null) {
				printWriter.println(line);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				bufferReader.close();
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
