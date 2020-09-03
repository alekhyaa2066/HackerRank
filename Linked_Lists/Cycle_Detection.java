static boolean hasCycle(SinglyLinkedListNode head) {
        if(head==null) return false;
        SinglyLinkedListNode s=head;
        SinglyLinkedListNode f=head.next;
        while(f!=null&&f.next!=null){
            if(s==f){
                return true;
            }
            s=s.next;
            f=f.next.next;
        }
        return false;

    }

