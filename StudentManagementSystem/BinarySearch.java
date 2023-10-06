class BinarySearchTree{ 
	
	class Node{ 
	private Node next;
	private Node prev;
	private int data;
	public Node(){
		setnext(null);
		setprev(null);
		setData(0);
	}
	public Node(int value){
		setData(value);
		next=prev=null;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}
	public Node getprev() {
		return prev;
	}
	public void setprev(Node prev) {
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	} //class-Node
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	Node root; 
	BinarySearchTree(){ 
		root = null; 
	} 


	void deleteKey(int key){ 
		root = deleteRec(root, key); 
	} 


	Node deleteRec(Node root, int key){ 
		if(root == null) return root;
		if(key>root.getData()){
			root.setnext(deleteRec(root.getnext(), key));
		} else if(key<root.getData()){
			root.setprev(deleteRec(root.getprev(), key));
		}
		
		else{
			if(root.getprev()== null)
				return root.getnext();
		 else if(root.getnext()== null)
			return root.getprev();
		
		root.setData(minValue(root)) ;
		root.setnext(deleteRec(root.getnext(), root.getData()));
		
		}
		return root;
	} 

	int minValue(Node root){ 
		int temp = 0;
		 if(root!=null){
			 temp = root.getData();
			minValue(root.getprev());
			temp = root.getData();
		 } 
		 return temp;
	} 

	void insert(int key){ 
		root = insertRec(root, key); 
	} 


	Node insertRec(Node root, int key){ 
		Node temp = new Node(key);
		if(root==null){
			root = temp;
			return root;
		}if(root.getData()>key){
			temp.setprev(insertRec(root.getprev(), key)); 
		}else if(root.getData()<key){
			temp.setnext(insertRec(root.getnext(), key)); 
		
		}
		return root;
	} 

	void inorder(){ 
		inorderRec(root); 
	} 

	void inorderRec(Node root){ 
		if(root!=null){
			inorderRec(root.getprev());
			System.out.println(root.getData());                                                                                                                     
			inorderRec(root.getnext());
		}
	} 


	// Driver Program to test above functions 
	@SuppressWarnings("unused")
	public static void main(String[] args){ 
		BinarySearchTree tree = new BinarySearchTree(); 

		/* Let us create following BST 
			50 
	    	/	 \ 
		30	 70 
		/ \        / \ 
	  20 40  60 80 */
	           
	} //main
} 


 