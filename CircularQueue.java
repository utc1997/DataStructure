// Program for insertion and deletion in Circular Queue 
public class CircularQueue 
{   
    // Initialize front and rear 
     int rear, front; 
    // Circular Queue 
     int size; 
     int arr[]; 
   
    CircularQueue(int s) 
    { 
        front = rear = -1; 
        size = s; 
        arr = new int[s]; 
    } 
   


    int enQueue(int value)
    {
        if ((front == 0 && rear == size-1) || rear== front-1)//(rear == (front-1)%(size-1) )) 
        {
            System.out.println("\nQueue is full cannot enter the element");
            return value;
        }
        else if(front == -1)                   ///* Insert First Element */
        {
            front = rear = 0; 
            arr[rear] = value; 
            return arr[rear];
        }
        else if (rear == size-1 && front != 0) //if we deque & ++front then rear has to rotate
        {                                      //by ++ahead and thats what make it circular queue
            rear = 0; 
            arr[rear] = value;
            return arr[rear]; 
        }
        else                                   //front-> a[0], rear-> a[0] Rear++ putting value in rear
        { 
            rear++; 
            arr[rear] = value;
            return arr[rear]; 
        } 

    }
    
    

    int deQueue()
    {
        if (front == -1) 
        { 
            System.out.println("\nQueue is Empty"); 
            return Integer.MIN_VALUE; 
        } 
  
        int data = arr[front]; 
        arr[front] = -1; 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (front == size-1) 
            front = 0; 
        else
            front++; 
  
    return data; 


    } 
    
    
    
    void displayQueue()
    {
        if (front == -1) 
        { 
        System.out.println("\nQueue is Empty"); 
        return; 
        } 

        System.out.println("\nElements in Circular Queue are: "); 

        if (rear >= front) 
        { 
            for (int i = front; i <= rear; i++) 
                System.out.println( arr[i] ); 
        } 
        else
        { 
            for (int i = front; i < size; i++) 
                System.out.println( arr[i] ); 
  
            for (int i = 0; i <= rear; i++) 
                System.out.println( arr[i] ); 
        } 
    } 



    public static void main(String[] args)
    {
        CircularQueue q = new CircularQueue(6); 
  
        // Inserting elements in Circular Queue 
        System.out.println("\nEntered value = " + q.enQueue(14) ); 
        System.out.println("\nEntered value = " + q.enQueue(22)); 
        System.out.println("\nEntered value = " + q.enQueue(13)); 
        System.out.println("\nEntered value = " + q.enQueue(-6)); 
  
        // Display elements present in Circular Queue 
        q.displayQueue(); 
  
        // Deleting elements from Circular Queue 
        System.out.println("\nDeleted value = " + q.deQueue()); 
        System.out.println("\nDeleted value = " + q.deQueue()); 
  
        q.displayQueue(); 
  
        System.out.println("\nEntered value = " + q.enQueue(9)); 
        q.displayQueue();

        System.out.println("\nEntered value = " + q.enQueue(20)); 
        q.displayQueue();

        System.out.println("\nEntered value = " + q.enQueue(555)); 
        q.displayQueue(); 
  
        System.out.println("\nEntered value = " + q.enQueue(456));
        q.displayQueue();

        System.out.println("\nEntered value = " + q.enQueue(666)); 
        q.displayQueue(); 
      
    }

}