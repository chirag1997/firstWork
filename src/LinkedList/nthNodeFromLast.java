package LinkedList;

import java.util.Scanner;

import inkedList.LinkedlistNode;

public class nthNodeFromLast {
	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}

	public static LinkedlistNode<Integer> takeInput()
	{
		Scanner s = new Scanner(System.in);
		LinkedlistNode<Integer> head = null;
		LinkedlistNode<Integer> tail = null;
		int data = s.nextInt();
		while(data!= -1)
		{
			LinkedlistNode<Integer> newNode = new LinkedlistNode<Integer>(data);
		if(head == null)
		{
			head = newNode;	
			tail = newNode;
		} 
		else
		{    
			tail.next = newNode;
			tail = newNode;
			//LinkedlistNode<Integer> temp = head;
			/*while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;*/
		}
		data = s.nextInt();
		}
		return head;
	}
	public static LinkedlistNode<Integer> nthNodeFromLastIter(LinkedlistNode<Integer> head, int n){

    LinkedlistNode<Integer> t1 = head;
    LinkedlistNode<Integer> t2 = head;
    int c=0;
    if(head!=null)
    {
       while(c<n)
       { 
          if(t1==null)
          {
           return null;
          }
         t1=t1.next;
         c++;
       }
    
       while(t1!=null)
       {
        t1=t1.next;
        t2=t2.next;
       }
      return t2;
    }
      return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedlistNode<Integer> head = takeInput();
		nthNodeFromLastIter(head, 0);
		
	}

}
