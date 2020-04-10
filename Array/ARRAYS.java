package Array;

// Java program to illustrate creating an array of 
// objects 
  
class Student 
{ 
    public int roll_no; 
    public String name; 
    Student(int roll_no, String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
    } 
} 
  
// Elements of array are objects of a class Student. 
public class ARRAYS 
{ 
    
    // This is Driver code 
    public static void main (String[] args) 
    { 
        // declares an Array of integers. 
        Student[] arr; 
  
        // allocating memory for 5 objects of type Student. 
        arr = new Student[5]; 
  
        // initialize the first elements of the array 
        arr[0] = new Student(1,"aman"); 
  
        // initialize the second elements of the array 
        arr[1] = new Student(2,"vaibhav"); 
  
        // so on... 
        arr[2] = new Student(3,"shikar"); 
        arr[3] = new Student(4,"dharmesh"); 
        arr[4] = new Student(5,"mohit"); 
  
        // accessing the elements of the specified array 
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Element at " + i + " : " + 
                        arr[i].roll_no +" "+ arr[i].name); 






         // declaring and initializing 2D array 
         int ar[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
         // printing 2D array 

         System.out.println(" \nPrinting 2D array ");
         for (int i=0; i< 3 ; i++) 
         { 
             for (int j=0; j < 3 ; j++) 
                 System.out.print(ar[i][j] + " "); 
   
             System.out.println();                 
        }

    }

} 