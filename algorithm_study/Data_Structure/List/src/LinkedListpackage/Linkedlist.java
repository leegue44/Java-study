package LinkedListpackage;

import java.util.Comparator;

public class Linkedlist <E>{
	public Linkedlist() {
		head =crnt=null;
	}
	class Node<E>{
	private E data;
	private Node<E> next;
	
	Node(E data,Node<E> next){
		this.data = data; // ������
		this.next =next;//���� ������(���� ��� ����)
	}
}

private Node<E> head;//�Ӹ� ������ (�Ӹ� ��� ����)	
private Node<E> crnt;//���� ������(���ó�� ����)


public E serch(E obj,Comparator<? super E> c) {
	Node<E> ptr =head;// ���� ��ĵ ���� ���
	
	while(ptr!=null) {
		if(c.compare(obj, ptr.data)==0) {//�˻� ����
			crnt =ptr;
			return ptr.data;
		}
		ptr =ptr.next;//���� ��带 ����
	}
	return null;//�˻� ����
}
public void addFirst(E obj) {
	Node<E> ptr = head;// ���� ���� �Ӹ� ���
	head =crnt = new Node<E>(obj,ptr);
}
public void addLast(E obj) {
	if(head ==null)//����Ʈ�� ��������� �Ӹ��� ����
		addFirst(obj);
	else {
		Node<E> ptr = head;
		while(ptr.next != null)
			ptr=ptr.next;
		ptr.next =crnt =new Node<E>(obj,null);
	}
}
public void removeFirst() {
	if(head!=null)
		head =crnt =head.next;
}
public void removeLast() {
	if(head!=null) {//��尡 �ϳ��� ������
		if(head.next==null)//�Ӹ� ��� ����
			removeFirst();
		else {
			Node<E> ptr =head;//��ĵ���� ���
			Node<E> pre =head;//��ĵ���� ����� ���� ���
			while (ptr.next!=null) {
				pre=ptr;
				ptr=ptr.next;
			}
			pre.next=null;//pre�� �������� ���� ���
			crnt=pre;
		}
	}
}
public void remove(Node p) {
	if(head !=null) {
		if(p==head)
			removeFirst();
		else {
			Node<E> ptr =head;
			while (ptr.next !=p) {
				ptr=ptr.next;
				if(ptr == null) return;}
			ptr.next =p.next;
			crnt = ptr;
			}
		}
	}
public void removeCurrentNode() {remove(crnt);}
public void clear() {while (head!=null)removeFirst();crnt=null;}
public boolean next() {
	if(crnt ==null || crnt.next==null)
		return false;
	crnt = crnt.next;
	return true;
}
public void printCurrentNode() {//���� ��� ���
	if(crnt == null)
		System.out.println("you choose node nothing");
	else 
		System.out.println(crnt.data);
}

public void dump() {//��� ��� ���
	Node<E> ptr = head;
	while(ptr !=null) {
		System.out.println(ptr.data);
		ptr = ptr.next;}
	}

}