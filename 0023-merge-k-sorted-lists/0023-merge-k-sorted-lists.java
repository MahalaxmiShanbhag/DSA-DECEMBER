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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for(ListNode l : lists)
            res = merge(res, l);
        return res;
    }
    ListNode merge(ListNode a, ListNode b) {
        ListNode d = new ListNode(0), c = d;
        while(a!=null && b!=null){
            if(a.val < b.val){ c.next = a; a = a.next; }
            else{ c.next = b; b = b.next; }
            c = c.next;
        }
        c.next = (a!=null)? a : b;
        return d.next;
    }
}
