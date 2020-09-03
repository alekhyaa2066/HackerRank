static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode c=new SinglyLinkedListNode(data);
        SinglyLinkedListNode t=head;
        for(int i=0;i<position-1;i++){
            t=t.next;
        }
        c.next=t.next;
        t.next=c;
        return head;
    }

