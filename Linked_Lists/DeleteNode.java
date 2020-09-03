static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp=head;
        if(head==null)
            return head;
        if(position==0)
            return head.next;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

