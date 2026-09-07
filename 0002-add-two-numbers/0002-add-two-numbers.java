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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode l3=temp;
        int carry=0;
        while(l1 !=null || l2!=null){
            int val1=0;
            if(l1!=null){
                val1=l1.val;
            }
            int val2=0;
            if(l2!=null){
                val2=l2.val;
            }
            int sum=val1 +val2 +carry;
            int ld=sum%10;
            ListNode newNode= new ListNode(ld);
            
            l3.next = newNode;
            carry=sum/10;

            if(l1!=null){
                l1=l1.next;

            }
            if(l2!=null){
                l2=l2.next;
            }
            l3 = l3.next;
        }
        
    if(carry>0){
            ListNode carrry=new ListNode(carry);
            l3.next=carrry;
        
        }
        return temp.next;


        
        
    }
}