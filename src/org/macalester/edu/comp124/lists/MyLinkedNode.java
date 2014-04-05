package org.macalester.edu.comp124.lists;

public class MyLinkedNode<E> {
	public MyLinkedNode<E> next;
	public MyLinkedNode<E> prev;
	public E value;
	
	public MyLinkedNode(E data) {
		this.value = data;
	}
	public MyLinkedNode<E> getNext() {
		return next;
	}
	public void setNext(MyLinkedNode<E> next) {
		this.next = next;
	}
	public MyLinkedNode<E> getPrev() {
		return prev;
	}
	public void setPrev(MyLinkedNode<E> prev) {
		this.prev = prev;
	}
	public E getValue() {
		return value;
	}
}
