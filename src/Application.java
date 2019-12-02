//imports
import java.util.*;
import java.io.*;
/**
 * This class runs the application itself
 * @author claireroeder
 * December 2nd, 2019
 *
 */
public class Application {

	//Instance variables
	private static Scanner scan = new Scanner(System.in);
	private static String answer;
	//Instance variables for Data Blocks
	private static String dB;
	private static DataBlock x;
	
	private static MerkleTree merkleTree;
	static DataReader dataReader = new DataReader();

	//creates file that can be read by the data reader
	static File file = new File(answer);
	
	//Main method
	public static void main(String args[]) throws IOException {
		//sets up a data block to enter info into
		DataBlock x = new DataBlock();
	System.out.println("Please enter a file to hash: ");
	answer = scan.nextLine();
	dataReader.readData(file, dB, x, dataBlocks);
	merkleTree.addNode(ArrayList<String> dataBlocks);
	merkleTree.computeHash(LinkedQueue<String> hash);
	
	
	
	}
}
