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

   public  void  addToIndex(int position,int value){
       ListNode node=new ListNode(value);

       if(position==1){
           node.next=head;
           head=node;
       }else {
           ListNode previous=head;
           int count=1;//position-1

           while (count < position-1){
               previous=previous.next;
               count++;
           }
           ListNode current=previous.next;
           previous.next=node;
           node.next=current;
       }


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

   public  ListNode deleteFirst(){
       if(head==null){
           return null;
       }
       ListNode temp=head;
       head=head.next;
       temp.next=null;
       return  temp;
   }

   public  ListNode deleteLast(){
       if(head == null || head.next == null){
           return  head;
       }
       ListNode current =head;
       ListNode previous=null;

       while (current.next != null){
           previous=current;
           current=current.next;
       }
       previous.next=null;//to break the chain
       return  current;
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
        ls.addToIndex(2,1000);
        ls.print();
        System.out.println(ls.deleteFirst().data);//printing the removed element
        ls.print();
        System.out.println(ls.deleteLast().data);
        ls.print();

    }

}