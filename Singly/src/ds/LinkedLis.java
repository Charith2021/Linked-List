package ds;

public class  LinkedLis {
   private ListNode head;

   private static  class ListNode{
       private  int data;
       private ListNode next;

       public ListNode(int data) {
           this.data = data;
           this.next = null;
       }
   }

    public static void main(String[] args) {
        LinkedLis ls=new LinkedLis();
        ls.head=new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);



    }

}