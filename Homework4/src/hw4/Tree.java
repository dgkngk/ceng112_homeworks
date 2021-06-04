package hw4;
//new package or stack class import

public class Tree<T> 
{
	private BinaryNode<T> root;
	
	public Tree(){
		root = null;
	}
	
	public Tree(T rootData) {
		root = new BinaryNode<>(rootData);
	}
	
	public Tree(T rootData, Tree<T> leftTree, Tree<T> rightTree)
	{
		privateSetTree(rootData,leftTree,rightTree);
	}
	
	private void privateSetTree(T rootData, Tree<T> leftTree,
										   Tree<T> rightTree)
	{
		root = new BinaryNode<>(rootData);
		
		if ((leftTree != null) && !leftTree.isEmpty())
			root.setLeft(leftTree.root.copy());
		
		if ((rightTree != null) && !rightTree.isEmpty())
			root.setRight(rightTree.root.copy());
	}
	
	public void setTree(T rootData) {
		root = new BinaryNode<>(rootData);
	}
	
	public void setTree(T rootData, Tree<T> leftTree,
									Tree<T> rightTree)
	{
		privateSetTree(rootData, leftTree, rightTree);
	}
	
	public T add(T newEntry) {
		
	}
	
	public T remove(T entry) {
		
	}
	
	public T getRootData() {
		T rootData = null;
		
		if (root != null)
			rootData = root.getData();
		
		return rootData;
	}
	
	protected BinaryNode<T> getRootNode() {
		return root;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void clear( ) {
		root = null;
	}
	
	public T getEntry(T entry) {
		return findEntry(getRootNode(), entry);
	}
	
	private T findEntry(BinaryNode<T> rootNode, T entry)
	{
		T result = null;
		
		if (rootNode != null)
		{
			T rootEntry = rootNode.getData();
			
			//to-do:needs comparators here
		}
		return result;
	}
}
