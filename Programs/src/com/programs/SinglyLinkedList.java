package com.programs;

import java.util.Scanner;

// create node of list - data & next pointer

class SinglyLinkedListNode{
	
	int data;
	SinglyLinkedListNode next;
	public SinglyLinkedListNode(int data) {
		super();
		this.data = data;
		this.next = null;
	} 
	
	static class SinglyLinkedListPointer{
		
		SinglyLinkedListNode head;
		SinglyLinkedListNode tail;
		
		
		public SinglyLinkedListPointer() {
			this.head = null;
			this.tail = null;
		}
		
		// inserting data and next pointer in Node
		public void insertNode(int node) {
			SinglyLinkedListNode n = new SinglyLinkedListNode(node);
			if(head == null) {
			   this.head = n;
			}else {
				this.tail.next = n;
			}
			this.tail = n;
		}
		
	}
}



public class SinglyLinkedList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinglyLinkedListNode.SinglyLinkedListPointer s = new SinglyLinkedListNode.SinglyLinkedListPointer();

        int llistCount = scanner.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            s.insertNode(llistItem);
        }

        printLinkedList(s.head);

		
	}

	private static void printLinkedList(SinglyLinkedListNode head) {
		  int f = head.data;
	      SinglyLinkedListNode fn = head.next;
	     
	      System.out.print(f + " -> ");
	      while (fn != null) {
	          System.out.print(fn.data + " ->" );
	          fn = fn.next;
	      }
	      if(fn == null) {
	      System.out.print("NULL");
	      }
	}
}
