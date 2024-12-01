package com.csc;

public class OakTree {

    // Inner Node class
    public static class Node {
        private Squirrel squirrel; // Data stored in the node
        private Node left;         // Reference to the left child
        private Node right;        // Reference to the right child

        // Constructor to initialize the node with a Squirrel object
        public Node(Squirrel squirrel) {
            this.squirrel = squirrel;
            this.left = null;
            this.right = null;
        }

        // Getter for the Squirrel object
        public Squirrel getSquirrel() {
            return this.squirrel;
        }

        // Setter for the left child
        public void setLeft(Node left) {
            this.left = left;
        }

        // Getter for the left child
        public Node getLeft() {
            return this.left;
        }

        // Setter for the right child
        public void setRight(Node right) {
            this.right = right;
        }

        // Getter for the right child
        public Node getRight() {
            return this.right;
        }
    }

    private Node root; // Root of the binary tree

    // Constructor for an empty tree
    public OakTree() {
        this.root = null;
    }

    // Getter for the root node
    public Node getRoot() {
        return this.root;
    }

    // Setter for the root node
    public void setRoot(Node root) {
        this.root = root;
    }

    // Pre-order traversal: Root -> Left -> Right
    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getSquirrel().getName());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }
}