static void reversePrint(SinglyLinkedListNode head) {
        if(head==null) 
            return;
        Stack<SinglyLinkedListNode> s=new Stack();
        while(head!=null){
            s.add(head);
            head=head.next;
        }
        while(!s.isEmpty()){
            SinglyLinkedListNode r=s.pop();
            System.out.println(r.data);
        }
        



    }

