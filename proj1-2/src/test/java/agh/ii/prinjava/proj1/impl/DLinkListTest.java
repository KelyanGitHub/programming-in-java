package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(1);
        dLinkList.addLast(2);
        /** 1 2*/
        System.out.printf(dLinkList.toString());
        dLinkList.removeFirst();
        /** 1 is removed*/
        System.out.printf(dLinkList.toString());
        dLinkList.removeLast();
        /** 2 is removed*/
        System.out.printf(dLinkList.toString());
        /**the list is null now*/
    }

    @AfterEach
    void tearDown() {
    }
}