/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        
        ListNode n1 = head;
        int countInit = 0;
        int count = 0;
        
        while(n1 != null){
            n1 = n1.next;
            countInit++;
        }
        n1 = head;
        ListNode n2 = null;
        int rot = k % (countInit);
        
        if(rot == 0){
            return head;
        }
    
        while(count < countInit - rot){
            if(n2 == null){
                n2 = n1;
            }
            else{
                n2 = n2.next;
            }
            n1 = n1.next;
            
            count++;
        }
        
        n2.next = null;
        n2 = n1;
        while(n1.next != null){
            n1 = n1.next;
        }
        n1.next = head;
        return n2;
    }
}