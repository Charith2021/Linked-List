package ds;

  public class Node {
      Node next;
      int data;

      public Node(int data) {
          this.data = data;
      }
  }










      /*  public void prepend(int data) {
            Node newHead = new Node(data);
            head = newHead;
        }

        public void deleteWithValue(int data) {
            if (head == null) return;
            if (head.data == data) {
                head = head.next;
                return;
                ;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }
    }*/







