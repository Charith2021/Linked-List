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

   public  void  print(){
       ListNode current=head;
       while(current != null){
           System.out.print(current.data+"-->");
           current=current.next;
       }
       System.out.print("null");
   }

    public static void main(String[] args) {
        LinkedLis ls=new LinkedLis();
        ls.head=new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        ls.head.next = second;//10 -->20
        second.next=third;//10 --> 20-->30
        third.next=fourth;//10-->20-->30-->40-->null

        ls.print();

    }

}