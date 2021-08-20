import java.util.*;

class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data){
        this.data = data;
    }
  
    // Take input from user inside the Linked List till -1 is encountered

    public static LinkedListNode<Integer> takeInput(){
        // assuming -1 as a terminator
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> head = null;
        while(data!=-1){ // O(n)
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
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

    public static int lengthOfLL(LinkedListNode<Integer> head){
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

    public static void printIthNode(LinkedListNode<Integer> head, int i){
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

    public static LinkedListNode<Integer> insertAtIthPosition(LinkedListNode<Integer> head, int i, int data){
        int count = 0;
        LinkedListNode<Integer> newNode = new LinkedListNode(data); 
        // what if the node need to be inserted is at the 0th position only, then the changes made to head won't get reflected thus return type ListNode and not void 
        if(i == 0){
            newNode.next = head; // This will not get reflected as head is passed by value
            head = newNode;
            return head; 
        }
        LinkedListNode<Integer> temp = head;
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

    
    // Insert a node at ith Position recursively
 
    public static LinkedListNode<Integer> insertAtIthPositionRec(LinkedListNode<Integer> head, int i, int data){
        if(i == 0){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            head = newNode;
            return head;
        }        
        if(head == null){
            return null;
        }
        LinkedListNode<Integer> newList = insertAtIthPositionRec(head.next, i-1, data);
        head.next = newList;
        return head;

    }

    
    // Delete the ith node from LinkedList 
    
    public static  LinkedListNode<Integer> deleteNodeAtIthPosition(LinkedListNode<Integer> head, int i){
        int count = 0;
        if(i == 0){
            LinkedListNode<Integer> temp = head;
            head = head.next;
            temp = null;
            return head;
        }
        LinkedListNode<Integer> temp = head;
        while(count<i-1 && temp!=null){
            temp = temp.next;
            count++;
        }
        if(temp!=null && temp.next!=null){
            LinkedListNode<Integer> ntd = temp.next; // node to be deleted
            temp.next = ntd.next;
            ntd = null;
        }
        return head;
    }


    // Delete the ith node from LinkedList Recursively
 
    public static  LinkedListNode<Integer> deleteNodeAtIthPositionRec(LinkedListNode<Integer> head, int i){
        if(head == null){
            return null;
        }
        if(i == 0){
            LinkedListNode<Integer> ntd = head;
            head = head.next;
            ntd = null;
            return head;
        }
        LinkedListNode<Integer> newList = deleteNodeAtIthPositionRec(head.next, i-1);
        head.next = newList;
        return head;
    }

    // Find a Node in Linked List

    /*
    Sample Input 1 :
    2
    3 4 5 2 6 1 9 -1
    5
    10 20 30 40 50 60 70 -1
    6
    Sample Output 1 :
    2
    -1
    */

    public static int findNode(LinkedListNode<Integer> head, int val){
        int idx = 0;
        while(head!=null && head.data!=val){
            head = head.next;
            idx++;
        }
        if(head!=null){
            return idx;
        }else{
            return -1;
        }
    }

    // Append Last N nodes to First
    /*
    Sample Input 1 :
    2
    1 2 3 4 5 -1
    3
    10 20 30 40 50 60 -1
    5
    Sample Output 1 :
    3 4 5 1 2
    20 30 40 50 60 10
    */
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        int len = lengthOfLL(head);
        int nfb = len-n;
        int i = 0;
        LinkedListNode<Integer> start = head;
        while(start!=null && i<nfb-1){
            start = start.next;
            i++;
        }
        LinkedListNode<Integer> end = start;
        while(end!=null && end.next!=null){
            end = end.next;
        }
        if(start!=null){
        end.next = head;
        head = start.next;
        start.next = null;
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