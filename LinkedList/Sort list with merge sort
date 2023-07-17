//some fixes need
class Solution {
    public ListNode merge(ListNode right ,ListNode left){
        ListNode temp = new ListNode(0);
        ListNode new_head = temp ; 

        while(left!= null && right != null){
            if(left.val > right.val){
                //temp.val = right.val;
                //temp.next = null;
                //right = right.next; 
               // temp= temp.next;

               temp.next = right;
               right = right.next ;
               
            }else{
                // temp.val = left.val;
                // temp.next = null;
                // temp = temp.next;
                // left = left.next;
                temp.next = left ;
                left = left.next ;
            }

        }

        // while(left!=null){
        //     temp.val = left.val ;
        //     left = left.next ;
        //     temp.next = null ;
        //     temp = temp.next ;
        // }
        // while(right != null){
        //     temp.val = right.val ;
        //     right = right.next ;
        //     temp.next = null ;
        //     temp = temp.next ;
        // }
        if(left!=null){
            temp.next = left ;
        }
        if(right!=null)
            temp.next = right ;

        return new_head;
    }


    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //size 
        ListNode slow = head; 
        ListNode fast = head; 
        ListNode prev = null ;

        while(fast!= null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next;
            if(prev == null){
                prev = head;
            }else{
                prev = prev.next ;
            }
        }

        
        ListNode left = head ;
        ListNode right = slow ;
        prev.next = null ;
        
        
        left = sortList(left);
        right = sortList(right);
     
        return merge(left,right);

    }
}
