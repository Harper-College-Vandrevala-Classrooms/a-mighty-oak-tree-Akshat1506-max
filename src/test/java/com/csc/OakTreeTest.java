package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OakTreeTest {

    private OakTree<Squirrel> tree;

    @BeforeEach
    void setUp() {
        tree = new OakTree<>();
    }

    @Test
    void testSetAndGetRoot() {
        Squirrel cheeks = new Squirrel("Cheeks");
        OakTree.Node<Squirrel> rootNode = new OakTree.Node<>(cheeks);

        tree.setRoot(rootNode);

        assertEquals("Cheeks", tree.getRoot().getData().getName(), "Root node should match the Squirrel name.");
    }

    @Test
    void testSetLeftAndRightChildren() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        OakTree.Node<Squirrel> rootNode = new OakTree.Node<>(cheeks);
        OakTree.Node<Squirrel> leftNode = new OakTree.Node<>(squeaks);
        OakTree.Node<Squirrel> rightNode = new OakTree.Node<>(fluffybutt);

        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);

        assertEquals("Squeaks", rootNode.getLeft().getData().getName(), "Left child should match the Squirrel name.");
        assertEquals("Mr. Fluffy Butt", rootNode.getRight().getData().getName(), "Right child should match the Squirrel name.");
    }
}