
public class DepthFirstSearch {
	Node root;
	
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}
	
	public void DFS(Node node) { //perform DepthFirstSearch
		
		if(node==null) {
			return;
		}
		System.out.println(node.getData());
		DFS(node.getlChild());
		DFS(node.getrChild());
	}//end DFS method
	
	public int Height(Node node) { //find the height of the tree given its root
		if(node==null) {
			return 0;
		}
		int left=Height(node.getlChild()); //height of left tree
		int right=Height(node.getrChild()); //height of right tree
		return 1+ Math.max(left,right); //return height of the current subtree with root as node
	}//end height method
	
	public int numberOfNodes(Node node) { //find total number of nodes given root of tree
		if(node==null) {
			return 0;
		}
		int left=numberOfNodes(node.getlChild()); //number of nodes in left tree
		int right=numberOfNodes(node.getrChild()); //number of nodes in right tree
		return 1+left+right; //return total = root + left subtree + right subtree
	}//end numberOfNodes method

}//end class
