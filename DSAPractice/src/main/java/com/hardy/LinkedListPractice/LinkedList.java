package com.hardy.LinkedListPractice;

public class LinkedList {

    Node head;

    //function to add item in the linked list
    public void insertItemInList(int data){
        Node newNodeToBeAdded = new Node(data);

        if(head==null){
            //here now head will have the reference of new node that's being added in the list
            head = newNodeToBeAdded;
            return;
        }
        Node tempNodeAsHead = head;
//        while(tempNodeAsHead.next!=null){
//            tempNodeAsHead = tempNodeAsHead.next;
//        }
        tempNodeAsHead.next = newNodeToBeAdded;


    }

    public void printList(){
        System.out.println("List");
        Node tempNodeAsHead = head;

        while(tempNodeAsHead!=null){
            System.out.print(tempNodeAsHead.data + " -> ");
            tempNodeAsHead = tempNodeAsHead.next;//if we dont use this line then it will make the loop infinite  since it will never be null
        }
    }


}
