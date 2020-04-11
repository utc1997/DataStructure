package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// java program to delete element in binary tree 
public class BinaryTreeDeletion 
{
    /* A binary tree node has key, pointer to left  
    child and a pointer to right child */
    static class Node 
    { 
        int key; 
        Node left, right; 

    /* function to create a new node of tree and  
    return pointer */
        Node(int key)
        { 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    }

    static Node root; 

    
    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 

        inorder(temp.left); 
        System.out.print( temp.key + " "); 
        inorder(temp.right); 
    } 
    


    /* function to delete the given deepest node  
    (d_node) in binary tree 
    static void deletDeepest(Node temp, Node d_node) 
    { 
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp); 
    
        // Do level order traversal until last node  
        while (!q.isEmpty()) 
        { 
            temp = q.peek();  
            q.remove(); 
            if (temp == d_node) 
            { 
                temp = null; 
                delete(d_node); 
                return; 
            } 

            if (temp.right) 
            { 
                if (temp.right == d_node) { 
                    temp.right = null; 
                    delete (d_node); 
                    return; 
                } 
                else
                    q.add(temp.right); 
            } 
    
            if (temp.left) { 
                if (temp.left == d_node) { 
                    temp.left = null; 
                    delete (d_node); 
                    return; 
                } 
                else
                    q.add(temp.left); 
            } 
        } 
    } 
    */


    /* function to delete element in binary tree */
    static Node deletion(Node root, int key) 
    { 
        if (root == null) 
            return null; 
    
        if (root.left == null && root.right == null) { 
            if (root.key == key) 
                return null; 
            else
                return root; 
        } 
    
        Queue<Node> q = new LinkedList<Node>();
        q.add(root); 
    
         Node temp = null; //idhar problem hai code mai
         Node  key_node = null; 
    
        // Do level order traversal to find deepest 
        // node(temp) and node to be deleted (key_node) 
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
    
            if (temp.key == key) 
                key_node = temp; 
    
            if (temp.left == null) 
                q.add(temp.left); 
    
            if (temp.right == null) 
                q.add(temp.right); 
        } 
    
        if (key_node != null) 
        { 
            int x = temp.key;  // and uper jo comment hai uska problem yaha se samjh aaega
            //deletDeepest(root, temp); 
            key_node.key = x; 
            temp=null;
        } 
        return root; 
    } 
    

    
    // Driver code 
    public static void main(String args[]) 
    { 
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.left.right = new Node(12); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
    
        System.out.print( "Inorder traversal before deletion : "); 
        inorder(root); 
    
        int key = 11; 
        root = deletion(root, key); 

        System.out.print( "\nInorder traversal after deletion : "); 
        inorder(root); 
    
    }

    
}





 
