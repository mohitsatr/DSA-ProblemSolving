/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode add_to_list(ListNode tail,int val){
        ListNode n = new ListNode(val);
        tail.next = n ;
        return n ;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode newhead = res; 
        int carryoverVal = 0;

        while(l1!= null && l2 != null){
            int a = l1.val;
            int b = l2.val;
            int sum = a+b+carryoverVal;

            
            carryoverVal = sum/10;
            sum = sum%10;
            
            res = add_to_list(res,sum);
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l2==null && l1!=null){
            int sum = l1.val + carryoverVal;
           
            carryoverVal = sum/10;
            sum = sum%10;
            
            System.out.println(carryoverVal+" "+sum);
            res = add_to_list(res,sum);
            l1 = l1.next;
        }
        while(l2!=null && l1 == null){
            int sum = l2.val + carryoverVal;
            
            carryoverVal = sum/10;
            sum = sum%10;
            
            res = add_to_list(res,sum);
            l2 = l2.next;
        }   
        if(carryoverVal > 0){
            res.next = new ListNode(carryoverVal);
        }
        return newhead.next ;

    }
}
