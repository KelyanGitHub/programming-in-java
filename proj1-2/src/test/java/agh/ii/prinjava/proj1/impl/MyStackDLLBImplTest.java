package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        stackOfInts.push(3);
        stackOfInts.push(4);
        /**4 3*/
        stackOfInts.pop();
        /**4 is removed*/
        stackOfInts.numOfElems();
        /**only 1 element now*/
        stackOfInts.push(6);
        /**6 3*/
        stackOfInts.peek();
        /**return 6*/
    }

    @AfterEach
    void tearDown() {
    }
}