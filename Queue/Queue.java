// Java program for array implementation of queue 

// A class to represent a queue 
class Queue
{
    int front,rear,capacity,size;
    int array[];


    Queue(int capacity)
    {
        front = this.size = 0;
        rear = capacity-1;

        this.capacity=capacity;
        array = new int [capacity];
    }



    // Method to add an item to the queue.  
    // It changes rear and size 
    void enqueue( int item)
    {
        if( isFull(this) ) //this refer to the current class obj
        {
            System.out.println("queue is full");
            return;
        }
        else
        {
            this.rear = (this.rear + 1)%this.capacity; // assinging rear with 0 ad increasing it every time
            this.array[this.rear]=item; //this refer to the class variable
            this.size = this.size + 1; 
            System.out.println(item + " enqueued to queue");

        }
    }



    // Method to remove an item from queue.   
    // It changes front and size 
    int dequeue() 
    {
       if(isEmpty(this))
       {
           System.out.println( " queue is empty " );
           return Integer.MIN_VALUE;
       }
       else
       {
           int item = array[this.front];
           array[this.front]=0;
           this.front = (this.front + 1)% this.capacity; 
           this.size = this.size-1;
           return item;
       }
    }



    // Queue is full when size becomes equal to the capacity  
    boolean isFull(Queue queue) 
    { 
         return (queue.size == queue.capacity); 
    } 



    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    {
        return (this.size == 0);

    }



    // Method to get front of queue 
    int front() 
    {
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.front]; 
    }



    // Method to get rear of queue 
    int rear()
    {
        if (isFull(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.rear]; 

    } 




    void PrintQueue()
    {
        System.out.println("\nFinal Queue looks like this");

        for(int i=0; i<array.length;i++)
            System.out.print( array[i] + " " );
    }



    // Driver class 
    public static void main(String[] args) 
    {
        Queue queue = new Queue(100); 
            
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        queue.enqueue(50); 
        queue.enqueue(60); 
        queue.enqueue(70); 
        queue.enqueue(80); 
        
        System.out.println("\n" + queue.dequeue() + " dequeued from queue\n"); 
        
        System.out.println("Front item is " + queue.front()); 
           
        System.out.println("Rear item is " + queue.rear());

        queue.PrintQueue();
        
    }
}