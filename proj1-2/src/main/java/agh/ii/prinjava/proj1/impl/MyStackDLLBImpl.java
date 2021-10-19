package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    @Override
    public E pop() {/**Remove an element from the top of the stack*/
        if (elems.first == null) {
            throw new IllegalStateException("list is empty");
        }
        E n = elems.get_first_Node_T();
        elems.removeFirst();
        return n;
    }


    @Override
    public void push(E x) {/**Add an element at the top of the Stack*/
        if(x == null){
            throw new IllegalStateException("x is null");
        }
        elems.addFirst(x);
    }

    @Override
    public int numOfElems() {

        if(elems == null){ throw new IllegalStateException("List is null");}
        return elems.numb_elem();
    }

    @Override
    public E peek() { /**return but not remove the front element in a stack*/
        if(elems == null){ throw new IllegalStateException("list is null");}
        E n = elems.get_first_Node_T();
        return n;
    }
}
