import java.util.*;

public class linked_list {
    public static void main(String[] args){
        /*
================= LINKED LIST =================

A Linked List stores elements in separate nodes.

Each node contains:
1. Data
2. Reference to the next node

Example:

[10 | next] -> [20 | next] -> [30 | null]


Unlike an array, elements are NOT stored contiguously.


MAIN IDEA

Array        → Fast random access
Linked List  → Easy insertion/deletion when node is known


ACCESS

get(index) → O(n)

Must traverse from the head.


SEARCH

O(n)


INSERTION

At head        → O(1)
At known node  → O(1)
At arbitrary index → O(n)


DELETION

At head        → O(1)
At known node  → O(1)
At arbitrary index → O(n)


NODE

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


HEAD

The head points to the FIRST node.

head
 ↓
[10] → [20] → [30] → null

If head == null:
The linked list is empty.


TRAVERSAL

Node current = head;

while (current != null) {
    System.out.println(current.data);
    current = current.next;
}

current moves through the list one node at a time.


INSERT AT HEAD

Node newNode = new Node(5);
newNode.next = head;
head = newNode;

Before:

head → [10] → [20] → null

After:

head → [5] → [10] → [20] → null

O(1)


ARRAY VS LINKED LIST

Array:
arr[5] → directly jump to index 5 → O(1)

Linked List:
To reach index 5:

head → 1 → 2 → 3 → 4 → 5

Therefore:

Random access → BAD
Sequential traversal → GOOD


JAVA'S LINKEDLIST

import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();

list.add(10);
list.add(20);
list.addFirst(5);
list.addLast(30);

list.removeFirst();
list.removeLast();


KEY IDEA

Linked List trades RANDOM ACCESS for
efficient structural modifications.

Array        → Access king 👑
Linked List  → Link manipulation king 🔗

==================================================
*/












        /*LinkedList<String> linkedlist= new LinkedList<String>();
        linkedlist.push("A");
        linkedlist.push("b");
        linkedlist.push("p");
        linkedlist.push("e");
        linkedlist.push("h");
        linkedlist.offer("A");
        linkedlist.offer("b");
        linkedlist.offer("p");
        linkedlist.offer("e");
        linkedlist.offer("h");
        //linkedlist.poll();
        linkedlist.add(4,"f");
        linkedlist.remove("b");
        linkedlist.addFirst("0");
        System.out.println(linkedlist.peekLast());
        System.out.println(linkedlist);*/

    }
}
