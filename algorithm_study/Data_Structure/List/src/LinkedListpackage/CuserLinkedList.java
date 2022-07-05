package LinkedListpackage;

import java.util.Comparator;

public class CuserLinkedList<E> {

	class Node<E>{
		private E data;
		private int next;
		private int dnext;
		void set(E data ,int next) {
			this.data=data;
			this.next=next;
		}
	}
		private Node<E>[] n;
		private int size;
		private int max;
		private int head;
		private int crnt;
		private int deleted;
		private static final int NULL=-1;
		public CuserLinkedList(int capacity) {
			head =crnt =max=deleted=NULL;
			try {
				n =new Node[capacity];
				for(int i= 0; i<capacity;i++) {
					n[i] =new Node<E>();}
					size =capacity;
			}
			catch (OutOfMemoryError e) {
				size =0;
			}
		}
		private int getInsertIndex() {
			if(deleted== NULL) {
				if(max<size)
					return ++max;
				else
					return NULL;
			}else {
				int rec =deleted;
				deleted =n[rec].dnext;
				return rec;
			}
		}
		private void dleteIndex(int idx) {
			if(deleted ==NULL) {
				deleted =idx;
				n[idx].dnext=NULL;}
			else {
				int rec =deleted;
				deleted =idx;
				n[idx].dnext=rec;
			}
		}
		public E search(E obj,Comparator<? super E>c) {
			int ptr =head;
			while(ptr !=NULL){
				if(c.compare(obj,n[ptr].data)==0) {
					crnt =ptr;
					return n[ptr].data;
				}
				ptr=n[ptr].next;
			}
			return null;
		}
		
	}

