package Linkedlist;

public class main {
    public static void main(String args[]) throws Exception {
        implemented_linkedlist ll = new implemented_linkedlist();
        ll.addlast(10);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);
        ll.addfirst(100);
        ll.addlast(40);
        ll.addfirst(20);
        ll.display();
        System.out.println("***************");
        System.out.println(ll.getfirst());
        System.out.println(ll.getlast());
        System.out.println("at index");
        implemented_linkedlist.Node temp1 = ll.getNodeAt(3);
        System.out.println(temp1.data);
        System.out.println(ll.getAt(2));
        ll.removefirst();
        ll.removelast();
        ll.removeat(2);
        System.out.println("display");
        ll.display();

    }
}
