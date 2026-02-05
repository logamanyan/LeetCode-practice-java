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
    public ListNode partition(ListNode head, int x) {
    ListNode smallhead= null;
    ListNode smalltail=null;
    ListNode largehead=null;
    ListNode largetail=null;
    ListNode temp=head;
   
    while(temp!=null)
    {
         ListNode next =temp.next;
         temp.next=null;

        if(temp.val<x)
        {
             if(smallhead==null)
             {
                smallhead=smalltail=temp;
                temp=next;
             }
             else
             {
                smalltail.next=temp;
                smalltail=smalltail.next;
                  temp=next;

             }
             
            
              
            
            


        }
        else
        {
               if(largehead==null)
             {
                largehead=largetail=temp;
                 temp=next;
             }
             else
             { 
            largetail.next=temp;
             largetail=largetail.next;
               temp=next;

             }
          
            
           
          
        }
}
if(smalltail!=null)
{
smalltail.next=largehead;

return smallhead;
}




    
    return largehead;
        
    }
}