public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode result=new ListNode();
        ListNode curr=head;
        ArrayList l=new ArrayList();
        int check=0;
        while(curr!=null)
        {
            if(l.contains(curr))
            {
                result=curr;
                check=1;
                break;
            }
            l.add(curr);
            curr=curr.next;
        }
        if(l.size()==0||check==0)
        {
            return null;
        }
        return result;
    }
}