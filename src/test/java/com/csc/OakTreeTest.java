package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OakTreeTest {

    private OakTree tree;

    @BeforeEach
    void setUp() {
        tree = new OakTree();
    }

    @Test
    void testSetAndGetRoot() {
        Squirrel cheeks = new Squirrel("Cheeks");
        OakTree.Node rootNode = new OakTree.Node(cheeks);

        tree.setRoot(rootNode);

        assertEquals("Cheeks", tree.getRoot().getSquirrel().getName(), "Root node should match the Squirrel name.");
    }

    @Test
    void testSetLeftAndRightChildren() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        OakTree.Node rootNode = new OakTree.Node(cheeks);
        OakTree.Node leftNode = new OakTree.Node(squeaks);
        OakTree.Node rightNode = new OakTree.Node(fluffybutt);

        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);

        assertEquals("Squeaks", rootNode.getLeft().getSquirrel().getName(), "Left child should match the Squirrel name.");
        assertEquals("Mr. Fluffy Butt", rootNode.getRight().getSquirrel().getName(), "Right child should match the Squirrel name.");
    }
}