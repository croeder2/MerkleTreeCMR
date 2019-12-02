//imports
import java.util.*;
/**
 * This class sets up the DataBlock object so that the DataReader can convert each line into a data block
 * @author claireroeder
 *
 */
public class DataBlock {
	
	private static ArrayList<String> dataBlocks;
	
	//Empty argument constructer
	public DataBlock() {

	}
	
	//Constructor that passes in the string of data for the data blocks array list
	public DataBlock(String dB) {
		dataBlocks.add(dB);	
	}
	
	//Method that sets up a queue so that the data blocks can be executed
	public void addData(String dB, ArrayList<String> dataBlocks) {
		dataBlocks.add(dB);
	}

	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return null;
	}
	

}//end class


