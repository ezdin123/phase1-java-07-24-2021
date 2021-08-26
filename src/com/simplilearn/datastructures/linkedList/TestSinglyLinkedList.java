package com.simplilearn.datastructures.linkedList;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000);

		// create singly linked list instance
		Singlylinkedlist slList = new Singlylinkedlist();

		System.out.println("IsEmpty check: " + slList.isEmpty());
		System.out.println("Size check: " + slList.getSize());
		System.out.println("-----------------------------");
		slList.add(emp1);
		slList.add(emp2);
		slList.add(emp3);
		slList.add(emp4);

		System.out.println("IsEmpty check: " + slList.isEmpty());
		System.out.println("Size check: " + slList.getSize());
		System.out.println("-----------------------------");
		slList.printList();
		System.out.println("-----------------------------");
		Node removedNode = slList.remove();
		System.out.println(removedNode);
		System.out.println("-----------------------------");
		slList.printList();

	}
}
