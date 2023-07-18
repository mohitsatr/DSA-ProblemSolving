
import java.lang.Math; 

public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizea = 0 ;
        int sizeb= 0;
        ListNode a = headA;
        ListNode b = headB;

        while(a!=null){
            a = a.next ;
            sizea++;
        }
        while(b!=null){
            b = b.next;
            sizeb++;
        }

        ListNode large = null;
        ListNode small = null;
        int diff = Math.abs(sizea-sizeb);

        if(sizea>sizeb){
            large = headA;
            small = headB;
        }else{
            large = headB;
            small = headA;
        }

        while(diff>0){
            large = large.next;
            diff --;
        }

        while(large!=null && small!=null){
            if(large==small){
                return large;
            }else{
                large = large.next;
                small = small.next ;
            }
            
        }
        return null;
    }
}
