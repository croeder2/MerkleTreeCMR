//imports
import java.security.*;
import java.util.*;

/**
 * This class represents the merkle tree itself and computes hashes for each of the data blocks
 * @author claireroeder
 *
 */
public class MerkleTree {
	
	/**
	 * Trees set up for the root, left, right, and whole tree
	 */
	static BinaryTree<DataBlock> merkleTree = new BinaryTree<DataBlock>();
	static BinaryTree<DataBlock> left = new BinaryTree<DataBlock>();
	static BinaryTree<DataBlock> right = new BinaryTree<DataBlock>();
	static BinaryTree<DataBlock> root = new BinaryTree<DataBlock>();
	/**
	 * Queue in which the hashes are computed
	 */
	static LinkedQueue<DataBlock> hash = new LinkedQueue<DataBlock>();

	
	public MerkleTree() {
		
	}
	
	public MerkleTree(ArrayList<String> dataBlocks) throws NoSuchAlgorithmException{
		
	}
	
	/**
	 * This method adds nodes to a tree by using a queue
	 * @param dataBlocks
	 */
	public void addNode(ArrayList<String> dataBlocks) {
		
		while(dataBlocks.isEmpty() != true) {
			for(int i = 0; i<dataBlocks.size(); i++) {
		hash.enqueue(dataBlocks.get(i));
		}
	}
	}
	
	/**
	 * Method to compute hash for a data block using MessageDigest from java.security
	 * @param dataBlocks
	 * @throws NoSuchAlgorithmException
	 */
	public void computeHash(LinkedQueue<String> hash) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(hash.dequeue().getBytes());
		byte[] digest = md.digest();
		
		   StringBuffer hexString = new StringBuffer();
		      
		      for (int i = 0;i<digest.length;i++) {
		         hexString.append(Integer.toHexString(0xFF & digest[i]));
		      }
	}
	
	
}
