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
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         List<Integer> list = new ArrayList<>();
//         ListNode temp = head;
//         while(temp!=null){
//             if(temp.val==val){
//                 temp=temp.next;
//             }else{
//                 list.add(temp.val);
//                 temp=temp.next;
//             }
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode dummy1=dummy;
//         for(int i=0;i<list.size();i++){
//             dummy1.next=new ListNode(list.get(i));
//             dummy1=dummy1.next;
//         }
//         return dummy.next;
//     }
// }


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        head.next=removeElements(head.next,val);
        if(head.val==val) return head.next;
        return head;
    }
}