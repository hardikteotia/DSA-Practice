package com.hardy.BSTPractice;

public class Main {

    public static void main(String[] args) {

        BST tree = new BST();

        tree.insertIntoBST(50);
        tree.insertIntoBST(30);
        tree.insertIntoBST(70);
        tree.insertIntoBST(20);

        tree.inOrder();
        System.out.println("\n---------------------");
        tree.preOrder();
        System.out.println("\n---------------------");
        tree.postOrder();
        System.out.println("\n---------------------");
        System.out.print(tree.findMinimum());
        System.out.println("\n---------------------");
        System.out.print(tree.findMaximum());



    }

}
