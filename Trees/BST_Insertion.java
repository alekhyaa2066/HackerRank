public static Node insert(Node root,int data) {
        if(root==null)
            return new Node(data);
        if(data>root.data){
            root.right=insert(root.right, data);
        }
        else{
            root.left=insert(root.left, data);
        }
    	return root;
    }

