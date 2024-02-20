package BinaryTree;

import javax.swing.*;
import java.util.Scanner;

public class TakingTreeInput {
    public static BinaryTreeNode<Integer>takingTreeInput() {
        System.out.println("enter the root:");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer>leftChild=takingTreeInput();
        BinaryTreeNode<Integer>rightChild=takingTreeInput();
        root.left=leftChild;
        root.right=rightChild;
        //System.out.println(root);
        return root;
    }
    public static BinaryTreeNode<Integer>takingInputBetter(){
        return takingInputBetter(true,0,false);
    }
    public static BinaryTreeNode<Integer>takingInputBetter(Boolean isRoot,int parent,Boolean isLeft){
        if(isRoot){
            System.out.println("enter the root");
        }else{
            if(isLeft){
                System.out.println("enter the left child of "+parent);
            }else{
                System.out.println("enter the right child of "+parent);
            }
        }
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer>leftChild=takingInputBetter(false,rootData,true);
        BinaryTreeNode<Integer>rightChild=takingInputBetter(false,rootData,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static void printTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static void printBetter(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printBetter(root.left);
        printBetter(root.right);
    }
}
