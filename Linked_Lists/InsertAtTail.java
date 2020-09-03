static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode c=new SinglyLinkedListNode(data);
        SinglyLinkedListNode th=head;
        if(head==null){
            head=c;
            return head;
        }
        else{
            SinglyLinkedListNode last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=c;
            return head;
           
        }
    }

