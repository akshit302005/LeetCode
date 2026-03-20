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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        reverse(list,k);
        System.out.print(list);
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        for(int i : list){
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        return temp.next;
    }
    public void reverse(List<Integer> list , int k){
        for(int i=0;i+k<=list.size();i+=k){
        int left=i;
        int right=left+k-1;
        if((i+k-1)>list.size()){
            right=list.size()-1;
        }
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            right--;
            left++;
        }
    }
    }
}