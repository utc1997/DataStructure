// A complete working Java program to demonstrate all insertion methods 
// on linked list 
package LinkedList;

class SinglyLinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d)
         { 
             data = d;
             next = null;
         } 
    } 



    /* Adds a new node at the end.  This method is  
       defined inside LinkedList class shown above */
    public void Add(int new_data) 
    { 
        /* 1. Allocate the Node & 
           2. Put in the data 
           3. Set next as null */
        Node new_node = new Node(new_data); 
  
        /* 4. If the Linked List is empty, then make the 
              new node as head */
        if (head == null) 
        { 
            head = new Node(new_data); 
            return; 
        } 
  
        /* 4. This new node is going to be the last node, so 
              make next of it as null */
        new_node.next = null; 
  
        /* 5. Else traverse till the last node */
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
  
        /* 6. Change the next of last node */
        last.next = new_node; 
        return; 
    } 
  

  
    /* Inserts a new Node at front of the list. */
    public void AddFront(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
  
  
	/* Inserts a new node in between the given node. */
	void addBtw (int searchData, int d)
    {
		// make a copy of head for traveling
        Node travel=head;
		
		// search the element after which u have to add
        while(travel.data!=searchData)
        {
            travel=travel.next;
        }
		 
		/*Allocate the Node & 
          Put in the data*/
        Node Newnode = new Node(d);
		
        /* Make next of new Node as next of prev_node */
		Newnode.next=travel.next;
		
		/* make next of prev_node as new_node */
        travel.next=Newnode;
        
    }
 
 
 
    /* This function prints contents of linked list starting from 
        the given node */
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"-> "); 
            tnode = tnode.next; 
        } 
    } 
	
  
    /* Driver program to test above functions. Ideally this function 
       should be in a separate user class.  It is kept here to keep 
       code compact */
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        SinglyLinkedList llist = new SinglyLinkedList(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
        llist.Add(6); 
  
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.AddFront(7); 
  
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.AddFront(1); 
  
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        llist.Add(4); 
  
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        llist.addBtw(7, 8); 
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
    } 
} 