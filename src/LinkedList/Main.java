package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node s = new Node(10);
        Node n1 = new Node(20);
        Node n0 = new Node(15);


        s.next = n1;
        n1.prev = s;

        System.out.println(s);
        System.out.println(s.next);
        System.out.println(n1.prev);


        n0.prev = s;
        n0.next = n1;
        s.next = n0;
        n1.prev = n0;

        Node current = s;
        int sum = 0;
        for(Node i = s; i != null; i = i.next ){
            sum += i.value;
        }
        System.out.println(sum);

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }


    }
}
