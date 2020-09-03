public static void levelOrder(Node root) {
        
        LinkedList<Node> q=new LinkedList();
        q.add(root);
        if(root==null)
            return;
        while(!q.isEmpty()){
            Node c=q.poll();
            System.out.print(c.data+" ");
            if(c.left!=null)
                q.add(c.left);
            if(c.right!=null)
                q.add(c.right);
        }

      
    }

