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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        boolean isPalindrome = true;
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode current = head;
          while(current != null) {    
            //Prints each node by incrementing pointer  
            al.add(current.val);
            current = current.next;
        }  
        int n = al.size();
        for(int i=0;i<n/2;i++){
            if(al.get(i) != al.get(n-i-1)){
                isPalindrome = false;
                break;
            }
            
        }
        return isPalindrome;
    }
}
