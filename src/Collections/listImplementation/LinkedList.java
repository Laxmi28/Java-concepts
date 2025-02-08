
package Collections.listImplementation;
class Node {

    public int data;
    public Node next;

    public Node(int data , Node next){
        this.data = data;
        this.next = next;
    }

}

public class LinkedList{

    /* add , remove , print */

    Node head;

    public void add(int data){

        Node newData =  new Node (data,null); 
        if(head == null){
            head = newData;
        }

        if(head !=null && head.next == null){
           head.next = newData;
        }
        if(head != null){
            Node temp = head;

            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = newData;
        }    

    }
    public void print(){
           
        if(head == null){
           System.out.println("List is empty");
        }
        if(head !=null && head.next == null){
            System.out.println(head.data);
        }
        if(head !=null && head.next != null){
            Node current = head;

            while (current.next!=null){
                System.out.println("List value is " + current.data + "->"
                );
                current = current.next;
            }
            
        }
        

    }
    public static void main (String[] args){
            LinkedList list = new LinkedList();
            list.add(2);
            list.print();
    }
}
