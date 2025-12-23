package com.hardy.BSTPractice;

public class BST {
    //          values in tree

    //                 50
    //               /    \
    //              30     70
    //             /  \   /  \
    //            20  40 60  80

    BSTNode current; //in first iteration this is null
    //current = [1000]
    BSTNode root; //in first iteration this is null
    //root = [1000]

    public void insertIntoBST(int data){//50
        BSTNode newNode = new BSTNode(data);//50
        if(root == null){//true
            root =  newNode;//[address of 50 =1000]
        current = root;//[address of 50 which is root =1000]
            return;
        }
        while(true){

            if(data < current.data){//data = 30 | cur.data[1000.data] = 50 | 30 < 50
                if(current.left == null){
                    current.left = newNode;//[address of 30 = 2000]
                    break;
                }
                else{
                    current = current.left;
                }
            }
            else{
                if(current.right == null){
                    current.right = newNode;
                    break;
                }
                else{
                    current = current.right;
                }
            }
        }



    }


    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(BSTNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }




    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(BSTNode root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);
    }




    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(BSTNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }


    public int findMinimum(){
        int res = findMinimum(root);
        return res;
    }
    private int findMinimum(BSTNode root){
        BSTNode myCurrent = root;
        int min = 0;
        myCurrent = root;
        while(myCurrent.left != null){
            myCurrent = myCurrent.left;
            min = myCurrent.data;
        }
        return min;
    }

    public int findMaximum(){
        int res = findMaximum(root);
        return res;
    }
    private int findMaximum(BSTNode root){
        BSTNode myCurrent = root;
        int max = 0;
        while(myCurrent.right != null){
            myCurrent = myCurrent.right;
            max = myCurrent.data;
        }
        return max;
    }

}
