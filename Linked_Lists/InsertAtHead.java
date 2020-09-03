static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode c=new SinglyLinkedListNode(data);
        if(llist==null){
            llist=c;
            llist.data=data;
            llist.next=null;
        }
        else{
            c.next=llist;
            llist=c;
        }
        return llist;

    }

