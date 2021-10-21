package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {
    void enqueue(E x);

    E dequeue();

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
    /**get access to the private attribute of the class*/
}
