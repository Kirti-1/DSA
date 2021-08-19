import java.util.*;

class LinkedList{
    public static void printLL(ListNode head){
        while(head!=null){
            System.out.format(head.data + " ");
            // head.data = 2*head.data;
            head = head.next;
        }
    }
    public static void main(String[] args){
        ListNode ll; // this will not give an error as by default it contains a null reference.
        // ListNode node1 = new ListNode(10);
        // ListNode node2 = new ListNode(20);
        // ListNode node3 = new ListNode(30);
        // ListNode node4 = new ListNode(40);
        // ListNode node5 = new ListNode(50);
        
        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // node4.next = node5;

        ListNode head = ListNode.takeInput();
        head = ListNode.insertAtIthPosition(head, 3, 100);
        printLL(head);
        System.out.println();
        head = ListNode.insertAtIthPosition(head, 0, 99);
        printLL(head);
        
        /*
        System.out.println();
        printLL(head);
        System.out.println();
        System.out.println( // ll.data +  // but accessing its variable will throw a compile time error.
            "Length of Linked List is " + ListNode.lengthOfLL(head) 
        );
        ListNode.printIthNode(head, 2);
        */
    }


}