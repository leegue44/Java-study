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
		this.data = data; // 데이터
		this.next =next;//뒤쪽 포인터(다음 노드 참조)
	}
}

private Node<E> head;//머리 포인터 (머리 노드 참조)	
private Node<E> crnt;//선택 포인터(선택노드 참조)


public E serch(E obj,Comparator<? super E> c) {
	Node<E> ptr =head;// 현재 스캔 중인 노드
	
	while(ptr!=null) {
		if(c.compare(obj, ptr.data)==0) {//검색 성공
			crnt =ptr;
			return ptr.data;
		}
		ptr =ptr.next;//다음 노드를 선택
	}
	return null;//검색 실패
}
public void addFirst(E obj) {
	Node<E> ptr = head;// 삽입 전의 머리 노드
	head =crnt = new Node<E>(obj,ptr);
}
public void addLast(E obj) {
	if(head ==null)//리스트가 비어있으면 머리에 삽입
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
	if(head!=null) {//노드가 하나만 있으면
		if(head.next==null)//머리 노드 삭제
			removeFirst();
		else {
			Node<E> ptr =head;//스캔중인 노드
			Node<E> pre =head;//스캔중인 노드의 앞쪽 노드
			while (ptr.next!=null) {
				pre=ptr;
				ptr=ptr.next;
			}
			pre.next=null;//pre는 삭제후의 꼬리 노드
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
public void printCurrentNode() {//선택 노드 출력
	if(crnt == null)
		System.out.println("you choose node nothing");
	else 
		System.out.println(crnt.data);
}

public void dump() {//모든 노드 출력
	Node<E> ptr = head;
	while(ptr !=null) {
		System.out.println(ptr.data);
		ptr = ptr.next;}
	}

}