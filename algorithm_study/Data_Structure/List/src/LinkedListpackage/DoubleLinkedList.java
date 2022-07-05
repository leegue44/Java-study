package LinkedListpackage;

import java.util.Comparator;

public class DoubleLinkedList<E> {
	class Node<E>{
private E data;// ������
private Node<E> prev;//���� ������(���� ��忡 ���� ����)
private Node<E> next;//���� ������ (���� ��忡 ���� ����)
	
	Node(){
		data =null;
		prev=next=this;
	}
	Node (E obj,Node<E> prev,Node<E> next){
		data = obj;
		this.prev=prev;
		this.next=next;
	}
	}
	private Node<E> head;//�Ӹ� ������(�����ϴ� ���� ���̳�Ʈ)
	private Node<E> crnt;// ���� ������
	public DoubleLinkedList() {
		head=crnt =new Node<E>();//���� ��带 ����
	}
	public boolean isEmpty() {
		return head.next ==head;
	}
	public E search(E obj,Comparator<? super E> c) {
		Node<E> ptr = head.next;//���� ��ĵ ���� ���
		while(ptr !=head) {
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;
				return ptr.data;//�� �� ����
			}
			ptr =ptr.next;//���� ��带 ����
		}
		return null;//�˻� ���� 
	}
	
}
