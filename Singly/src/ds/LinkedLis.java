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
       System.out.println("null");
   }

   public void insertFront(int value){
       ListNode newNode=new ListNode(value);
       newNode.next = head;
       head=newNode;
   }

   public  void  insertRear(int value){
       ListNode newNode = new ListNode(value);
       if(head==null){
           head=newNode;
           return;
       }
       ListNode current=head;
       while(null != current.next){
           current=current.next;
       }
       current.next=newNode;
   }



   public  int length(){
       if(head==null){
           return 0;
       }
       int count=0;
       ListNode current=head;
       while (current !=null){
           count++;
           current=current.next;
       }
       return count;
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
        System.out.println("The length is: "+ls.length());
        ls.insertFront(1);
        ls.print();
        ls.insertRear(100);
        ls.print();

    }

}