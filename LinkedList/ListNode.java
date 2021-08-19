import java.util.*;

public class ListNode{
    public int data;
    ListNode next;
    ListNode(){
        data = 0;
        next = null;
    }
    ListNode(int data){
        this.data = data;
        next = null;
    }
    
    // Take input from user inside the Linked List till -1 is encountered

    public static ListNode takeInput(){
        // assuming -1 as a terminator
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        ListNode head = null;
        ListNode tail = null;
        while(data!=-1){ // O(n)
            ListNode newNode = new ListNode(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode; // O(1)
                tail = tail.next;
                // OR
                // tail = newNode;
            }
            data = scn.nextInt();
        }
        return head;
    }
    
    // Length of Linked List 

    public static int lengthOfLL(ListNode head){
        // Iteratively 

        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;

        // Recursively
        /*
        if(head == null){
            return 0;
        }
        int length = 0;
        length = lengthOfLL(head.next);
        return 1 + length;
        */
    }

    
    // Print the ith Node

    public static void printIthNode(ListNode head, int i){
        int t = 0;
        // could be a posibility that (i>lengthOfLL) - i out of range (edge case)
        while(t!=i && head!=null){
            head = head.next;
            t+=1;
        }
        // check whether head != null or not
        if(head != null){ // then only answer is possible
            System.out.println(head.data);
        }else{
            System.out.println("Index out of range, enter valid Index number");
            return;
        }
    }

    // Insert a node at ith position
    public static ListNode insertAtIthPosition(ListNode head, int i, int data){
        int count = 0;
        ListNode newNode = new ListNode(data); 
        // what if the node need to be inserted is at the 0th position only, then the changes made to head won't get reflected thus return type ListNode and not void 
        if(i == 0){
            newNode.next = head; // This will not get reflected as head is passed by value
            return newNode; 
        }
        ListNode temp = head;
        while(count < i-1 && temp!=null){
            temp = temp.next;
            count++;
        }
        if(temp!=null){
            newNode.next = temp.next;
            temp.next = newNode;
        }   
        return head;
    }

}















// javac ListNode.java
// java Node - as node contains the main method
/*
class Node{
    public static void main(String[] args){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode head = node1;

        while(head!=null){
            System.out.format(head.data + " ");
            head = head.next;
        }
    }

}
*/