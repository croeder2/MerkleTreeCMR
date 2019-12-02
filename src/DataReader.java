//imports
import java.io.*;
import java.util.*;
/**
 * This class represents a DataReader that takes the input data and converts it to data blocks
 * @author claireroeder
 * December 2nd, 2019
 *
 */
public class DataReader {
	
	//Creates a data block that the reader can put a string into
	private static DataBlock x = new DataBlock();
	
//Empty argument constructor
	public DataReader() {
		
	}
//Constructor
	public DataReader(String answer, LinkedQueue<DataBlock> dB) throws IOException {
		
	}

	/**
	 * Method that reads the data with a buffered reader and puts each line into a data block
	 * @param file
	 * @param dB
	 * @param x
	 * @param dataBlocks
	 * @throws IOException
	 */
	public void readData(File file, String dB, DataBlock x, ArrayList<String> dataBlocks) throws IOException{
		
				BufferedReader fileRead = null;
		    fileRead = new BufferedReader(new FileReader(file));
		    String read = null;
		    try {
		    	
		   StringBuffer sb = new StringBuffer("");
		   
		   //This loop splits each line and adds it to a datablock
		    while ((read = fileRead.readLine()) != null) {
		    	sb.append(read + "x");
		        String[] splitted = read.split("x");
		        for (String part : splitted) {
		        	part = dB;
		        	x.addData(dB, dataBlocks);
		        }
		    }
//catch statement for exceptions
		} catch (java.io.IOException e) {
		
			//finally statement
		} finally {
			//try statement that closes the data reader
		    try {
		        fileRead.close();
		    //catch statement for exceptions
		    } catch (java.io.IOException e) {
		    }
		}
}
}//end class
