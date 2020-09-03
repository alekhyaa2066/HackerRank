static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head==null)
            return head;
        SinglyLinkedListNode t=head;
        while(t.next!=null){
            if(t.data==t.next.data){
                t.next=t.next.next;
            }
            else{
                t=t.next;
            }
            
        }
        return head;
    }

