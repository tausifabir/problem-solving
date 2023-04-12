import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class PracticeLinkedList {

    Node head;
    int size;


    public PracticeLinkedList() {
        this.size = 0;
    }

    // Inner  Node Class
    public class Node {
        String data;
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            // For Creating every new node , next address will null
            this.next = null;
            size++;
        }
    }


    public void addFirst(String data){
        // Creating new Node with given data.
        Node newNode = new Node(data,null);
        if(head == null){
            head = newNode;
            return;
        }
        // If head exists, then make newNode as head
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        // Creating new Node with given data.
        Node newNode = new Node(data,null);
        if(head == null){
            head = newNode;
            return;
        }
        // Assign Head to a tempNode for traversing to last node
        Node currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void  printList(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        // Assign Head to a tempNode for traversing to last node
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void  deleteFirst(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        size--;
        head = head.next;
    }

    public void  deleteLast(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        size--;
        // if list has only one node
        if (head.next == null){
            head = null;
            return;
        }
        while(lastNode.next != null){
           lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    
    public void getLinkedListSize(){
        System.out.println("List size is "+size);
    }
}
