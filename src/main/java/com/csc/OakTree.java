package com.csc;

// Generic Binary Tree class
public class OakTree<T> {

    // Inner Node class
    public static class Node<T> {
        private T data; // Data stored in the node
        private Node<T> left; // Reference to the left child
        private Node<T> right; // Reference to the right child

        // Constructor to initialize the node with data
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // Getter for the node's data
        public T getData() {
            return this.data;
        }

        // Setter for the left child
        public void setLeft(Node<T> left) {
            this.left = left;
        }

        // Getter for the left child
        public Node<T> getLeft() {
            return this.left;
        }

        // Setter for the right child
        public void setRight(Node<T> right) {
            this.right = right;
        }

        // Getter for the right child
        public Node<T> getRight() {
            return this.right;
        }
    }

    private Node<T> root; // Root of the binary tree

    // Constructor for an empty tree
    public OakTree() {
        this.root = null;
    }

    // Getter for the root node
    public Node<T> getRoot() {
        return this.root;
    }

    // Setter for the root node
    public void setRoot(Node<T> root) {
        this.root = root;
    }

    // Pre-order traversal: Root -> Left -> Right
    public void preOrderTraversal(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }
}
