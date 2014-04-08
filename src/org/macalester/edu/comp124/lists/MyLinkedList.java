package org.macalester.edu.comp124.lists;

/**
 * An unfinished implementation of a basic doubly-linked list.
 *
 * Note that the head and the tail contain "sentinel" nodes without values.
 * This makes the edge cases of the algorithm easier because the list always has a discrete head and tail.
 *
 * @author shilad
 * @param <E>
 */
public class MyLinkedList<E> {
	private MyLinkedNode<E> head;
	private MyLinkedNode<E> tail;
	private int numElements = 0;

    /**
     * Creates a new empty linked list.
     */
	public MyLinkedList() {
		head = new MyLinkedNode<E>(null);
		tail = new MyLinkedNode<E>(null);
		clear();
	}

    /**
     * Returns the element at position index.
     * @param index
     * @return
     */
	public E get(int index) {
        MyLinkedNode<E> currentNode = head.getNext();
        for(int i = 0; i < index; i++)
        {
            currentNode = currentNode.getNext();
        }
        return(currentNode.getValue());
	}



    /**
     * Adds a new element to the end of the list:
     *
     * @param elem
     */
	public void add(E elem) {
        MyLinkedNode<E> newNode = new MyLinkedNode<>(elem);
        MyLinkedNode<E> oldNode = tail.getPrev();
        oldNode.setNext(newNode);
        tail.setPrev(newNode);
        numElements++;
	}

    /**
     * Inserts a new element at the specified index.
     *
     * @param elem
     */
	public void add(int i, E elem) {
        MyLinkedNode<E> newNode = new MyLinkedNode<>(elem);
        MyLinkedNode<E> current = head.getNext();
        for (int j = 0; j < i-1; j++)
        {
            current = current.getNext();
        }
        newNode.setPrev(current);
        newNode.setNext(current.getNext());
        current.getNext().setPrev(newNode);
        current.setNext(newNode);
        numElements++;
	}

    /**
     * Returns the current size of the list.
     * @return
     */
	public int size() {
		return numElements;
	}

    /**
     * Clears the contents of the list.
     */
	public void clear() {
		// set head's next to the tail
		head.setNext(tail);
		head.setPrev(null);
		
		// set tails prev to the head
		tail.setPrev(head);
		tail.setNext(null);
		numElements = 0;
	}


    /**
     * These methods are only used by the unit tests.
     * They are intentionally not public.
     * @return
     */
    MyLinkedNode getHead() { return head; }
    MyLinkedNode getTail() { return tail; }
}
