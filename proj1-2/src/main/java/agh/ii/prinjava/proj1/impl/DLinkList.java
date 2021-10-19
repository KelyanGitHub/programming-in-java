package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {/**Node first and last have been created to use them later for the methods*/
    Node<E> first;
    Node<E> last;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    public E get_first_Node_T(){
        return this.first.elem;
    }

    public E get_last_Node_T(){
        return this.last.elem;
    }

    public void addFirst(E elem) {
        Node<E> n = new Node<E>();
        n.elem = elem;
        n.next = this.first;
        n.prev = null;/** we had a first element, and the first element has no predecessor so n.prev = null*/
        if(this.first != null){this.first.prev = n;}/** affect the old first one element AND ONLY if first != null*/
        this.first = n;
        if (this.last == null) {
            this.last = n;
        } /**if the list is empty, first and last can both point to null*/
    }

    public void addLast(E elem){
        Node<E> m = new Node<E>();
        m.elem = elem;
        m.next = null;
        m.prev = this.last;
        if(this.last != null) {this.last.next = m;}/**link the last element to the new last element which is m*/
        if(this.first == null){this.first = m;}/**list is null*/
        this.last = m;
    }

    public void removeFirst(){
        if(this.first != null) {this.first = this.first.next;}/**the first element changed
         --> the element after the first one becomes the first element*/
        if (this.first != null){this.first.prev = null;}/** reaffect this.first bcz it has been changed up, and as it's now the first element
         --> no first.prev can't exist*/
    }
    public void removeLast(){
        if(this.last != null){this.last = this.last.prev;}
        if(this.last != null){this.last.next = null;}
    }

    public String toString(){
        String s = "";
        Node<E> p = this.first;
        while(p != null){
            s = s + " " + p.elem;
            p = p.next;
        }
        return s;
    }

    public int numb_elem(){
        Node<E> p = this.first;
        int c = 0;
        while(p != null){
            c++;
            p = p.next;
        }
        return c;
    }

    public E position(int pos){
        Node<E> p = this.first;
        int c = 0;
        while(p!=null)
        {
            if(c == pos) {break;}
            c++;
            p = p.next;
        }
        if(p == null) {return null;}
        return p.elem;
    }

}
