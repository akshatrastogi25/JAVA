import java.util.*;
class Node {
    int data;
    Node nextNode;
}
class LinkedList {

    private Node head;

    {
    public void insert(int data) {
       
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

       
        if (this.head == null) {
            head = node;
            return;
        }

        
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }

       
        tempNode.nextNode = node;
    }
    }

    public void insertNth(int data, int position) {
       
        Node node = new Node();
        node.data = data;
        node.nextNode = null;


        if (this.head == null) {
           
            if (position != 0) {
                return;
            } else { 
                this.head = node;
            }
        }

        if (head != null && position == 0) {
            node.nextNode = this.head;
            this.head = node;
            return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.nextNode;

            if (current == null) {
                break;
            }

            i++;
        }

        node.nextNode = current;
        previous.nextNode = node;
    }

     {
    public void print() {
        if (this.head == null) {
            return;
        }
     
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }
     }

}
public class Main {

  public static void main(String[] args) {
      LinkedList ls = new LinkedList();
      ls.insert(10);
      ls.insert(20);
      ls.insert(30);
      ls.print();
      ls.insertNth(25, 2);
      ls.print();
  }
}
