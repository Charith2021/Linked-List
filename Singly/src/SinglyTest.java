import ds.LinkedLis;
import ds.Node;

import java.util.LinkedList;

public class SinglyTest {
    public static void main(String[] args) {
        Node node=new Node(10);
        LinkedLis linkedLis=new LinkedLis();

        linkedLis.append(20);
        System.out.println(linkedLis.toString());
        System.out.println(linkedLis.toString());
        linkedLis.prepend(20);
        System.out.println(linkedLis.toString());
        //node.deleteWithValue();
    }
}
