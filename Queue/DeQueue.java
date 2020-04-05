// Java program to demonstrate working of 
// Deque in Java 
package Queue;

import java.util.*; 
  
public class DeQueue 
{ 
    public static void main(String[] args) 
    { 
        Deque<String> deque = new LinkedList<String>(); 
  
        // We can add elements to the queue in various ways 
        deque.add("Element 1 (Tail)"); // add to tail 
        deque.addFirst("Element 2 (Head)"); 
        deque.addLast("Element 3 (Tail)"); 
        deque.push("Element 4 (Head)"); //add to head 
        deque.offer("Element 5 (Tail)"); 
        deque.offerFirst("Element 6 (Head)"); 
        deque.offerLast("Element 7 (Tail)"); 
  
        System.out.println(deque + "\n"); 
  
        // Iterate through the queue elements. 
        System.out.println("Standard Iterator"); 
        Iterator<String> iterator = deque.iterator(); 
        
        while (iterator.hasNext()) 
            System.out.println("\t" + iterator.next()); 
  
  
        // Reverse order iterator 
        Iterator<String> reverse = deque.descendingIterator(); 
        System.out.println("Reverse Iterator"); 
        
        while (reverse.hasNext()) 
            System.out.println("\t" + reverse.next()); 
  
        // Peek returns the head, without deleting 
        // it from the deque 
        System.out.println("Peek " + deque.peek()); 
        System.out.println("After peek: " + deque); 
  
        // Pop returns the head, and removes it from 
        // the deque 
        System.out.println("Pop " + deque.pop()); 
        System.out.println("After pop: " + deque); 
  
        // We can check if a specific element exists 
        // in the deque 
        System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)")); 
  
        // We can remove the first / last element. 
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println("Deque after removing " + "first and last: " + deque); 
  
    } 
} 

/* 
[Element 6 (Head), Element 4 (Head), Element 2 (Head), Element 1 (Tail), 
                   Element 3 (Tail), Element 5 (Tail), Element 7 (Tail)]

Standard Iterator
    Element 6 (Head)
    Element 4 (Head)
    Element 2 (Head)
    Element 1 (Tail)
    Element 3 (Tail)
    Element 5 (Tail)
    Element 7 (Tail)
Reverse Iterator
    Element 7 (Tail)
    Element 5 (Tail)
    Element 3 (Tail)
    Element 1 (Tail)
    Element 2 (Head)
    Element 4 (Head)
    Element 6 (Head)

Peek Element 6 (Head)

After peek: [Element 6 (Head), Element 4 (Head), Element 2 (Head), Element 1 (Tail), 
                               Element 3 (Tail), Element 5 (Tail), Element 7 (Tail)]

Pop Element 6 (Head)

After pop: [Element 4 (Head), Element 2 (Head), Element 1 (Tail), Element 3 (Tail), 
                                                 Element 5 (Tail), Element 7 (Tail)]

Contains element 3: true

Deque after removing first and last: [Element 2 (Head), Element 1 (Tail), 
                                                 Element 3 (Tail), Element 5 (Tail)]
*/