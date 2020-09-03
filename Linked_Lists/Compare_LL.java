static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null&&head2!=null)
            return false;
        if(head1!=null&&head2==null)
            return false;
        if(head1==null&&head2==null)
            return true;
        /*
        int f=0;
        int l1=0;
        int l2=0;
        while(head1.next!=null){
            l1++;
            head1=head2.next;
        }
        while(head2.next!=null){
            l2++;
            head2=head2.next;
        }
        if(l1==l2){
            while(head1.next!=null&&head2.next!=null){
                if(head1.data!=head2.data){
                    f=1;
                    break;
                }
                else{
                    head1=head1.next;
                    head2=head2.next;
                }
            }
            if(f==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        */
        if(head1.data!=head2.data)
            return false;
        return compareLists(head1.next, head2.next);
    }
