package com.yoelee.algorithms.t3_LinkedList;

import java.sql.SQLSyntaxErrorException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的四种遍历方法
 *        1
 *     2     3
 *   4  5   6  7
 *  8            9
 */
public class BinaryTreeTraversal {
    public static class BNode {
        public int value;
        public BNode leftChild;
        public BNode rightChild;

        public BNode(int v){
            this.value = v;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    private static BNode createTree(){
        BNode tree = new BNode(1);
        tree.leftChild = new BNode(2);
        tree.rightChild = new BNode(3);
        tree.leftChild.leftChild = new BNode(4);
        tree.leftChild.rightChild = new BNode(5);
        tree.leftChild.leftChild.leftChild = new BNode(8);
        tree.rightChild.leftChild = new BNode(6);
        tree.rightChild.rightChild = new BNode(7);
        tree.rightChild.rightChild.rightChild = new BNode(9);
        return tree;
    }

    //先序遍历
    private static void preOrder(BNode node){
        if (node != null){
            System.out.println(node.value);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    //中序遍历
    private static void inOrder(BNode node){
        if (node != null){
            inOrder(node.leftChild);
            System.out.println(node.value);
            inOrder(node.rightChild);
        }
    }

    //后序遍历
    private static void postOrder(BNode node){
        if (node != null){
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(node.value);
        }
    }

    //按层遍历
    private static void levelOrder(BNode node){
        if (node == null)
            return;
        Queue<BNode> q = new LinkedList<BNode>();
        q.add(node);

        while (!q.isEmpty()){
            BNode tmp = q.poll();
            System.out.println(tmp.value);
            if (tmp.leftChild != null){
                q.add(tmp.leftChild);
            }
            if (tmp.rightChild != null){
                q.add(tmp.rightChild);
            }
        }
    }

    public static void main(String [] args){
        BNode tree = createTree();

        //先序遍历
        System.out.println("pre order:");
        preOrder(tree);

        //中序遍历
        System.out.println("\nin order:");
        inOrder(tree);

        //后序遍历
        System.out.println("\npost order:");
        postOrder(tree);

        //按层遍历
        System.out.println("\nlevel order:");
        levelOrder(tree);

    }
}
