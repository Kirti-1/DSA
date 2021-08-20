import java.util.*;

class LinkedList{
    public static void printLL(LinkedListNode<Integer> head){
        while(head!=null){
            System.out.format(head.data + " ");
            // head.data = 2*head.data;
            head = head.next;
        }
    }
    public static void main(String[] args){
        LinkedListNode<Integer> ll; // this will not give an error as by default it contains a null reference.
        // LinkedListNode node1 = new LinkedListNode(10);
        // LinkedListNode node2 = new LinkedListNode(20);
        // LinkedListNode node3 = new LinkedListNode(30);
        // LinkedListNode node4 = new LinkedListNode(40);
        // LinkedListNode node5 = new LinkedListNode(50);
        
        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // node4.next = node5;
        Scanner scn = new Scanner(System.in);

        LinkedListNode<Integer> head = LinkedListNode.takeInput();
        // head = Solution.insertAtIthPosition(head, 3, 100);
        // printLL(head);
        // System.out.println();
        // head = Solution.insertAtIthPosition(head, 0, 99);
        // printLL(head);
        // System.out.println();
        int pos = scn.nextInt();
        head = LinkedListNode.appendLastNToFirst(head, pos);
        
        printLL(head);
        /*
        System.out.println();
        head = LinkedListNode.deleteNodeAtIthPosition(head, 4);
        printLL(head);
        System.out.println();
        head = LinkedListNode.deleteNodeAtIthPosition(head, 0);
        printLL(head);
        System.out.println();
        head = LinkedListNode.deleteNodeAtIthPosition(head, 5);
        printLL(head);
        System.out.println();
        head = LinkedListNode.insertAtIthPosition(head, 5, 10000);
        printLL(head);
        */
        
        /*
        System.out.println();
        printLL(head);
        System.out.println();
        System.out.println( // ll.data +  // but accessing its variable will throw a compile time error.
        // error: variable ll might not have been initialized
            "Length of Linked List is " + LinkedListNode.lengthOfLL(head) 
        );
        ListNode.printIthNode(head, 2);
        */
    }


}