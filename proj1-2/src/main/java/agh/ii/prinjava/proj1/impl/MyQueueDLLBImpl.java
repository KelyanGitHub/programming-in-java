package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    @Override
    public void enqueue(E x) {/**Add an element to the back of the Queue*/
        if(x == null){
            throw new IllegalStateException("x is null");
        }
        elems.addFirst(x);
    }

    @Override
    public E dequeue() {/**Remove and return the front element of the Queue*/
        if(elems.first == null){
            throw new IllegalStateException("Queue is empty");
        }
        E n = elems.get_last_Node_T();
        elems.removeLast();
        return n;
    }

    @Override
    public int numOfElems() {
        if(elems == null){ return 0;}
        return elems.numb_elem();
    }

    @Override
    public E peek() {/** return but not remove the front element in a queue*/
        if(elems.first == null){
            throw new IllegalStateException("Queue is empty");
        }
        E n = elems.get_last_Node_T();
        return n;
    }
}
