public static int height(Node root) {
      	// Write your code here.
        if(root==null)
            return -1;
        return Math.max(height(root.left), height(root.right))+1;
    }

