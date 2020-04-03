
public class StackWithArray {

    public static int MAX = 100;
    int top;
    int a[] =new int[MAX];

    //basic code
    
    StackWithArray() 
    { 
        top = -1; //inialize top with -1
    } 
  
    //method to check if stack is empty
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    

    int pop()
    {
        if (isEmpty())
        {
            System.out.println("stack is empty cannot pop any item");
            return 0;
        }
        else
        {
            int temp = a[top];
            a[top]=0;
            --top;
            return temp;
        }
    }

    void push(int data)
    {
        if ( top > MAX )
        {
            System.out.println("Stack overflow");
        }
        else
        {
            a[++top]=data;
            System.out.println(data + " pushed into stack"); 
        }

    }


    void PrintStack()
    {
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
            if (a[i]==0)
            break;
        }
    }


    // Driver code 
    public static void main(String[] args)
    {
        StackWithArray s = new StackWithArray(); 
            s.push(10); 
            s.push(20); 
            s.push(30); 
            System.out.println(s.pop() + " Popped from stack"); 
            s.push(40); 
            s.push(50); 
            s.PrintStack();
    }

}