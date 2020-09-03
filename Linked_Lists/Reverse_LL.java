static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null) return head;
        SinglyLinkedListNode p=null;
        SinglyLinkedListNode t=head;
        while(t!=null){
            SinglyLinkedListNode n=t.next;
            t.next=p;
            p=t;
            t=n;
        }
        return p;

    }

