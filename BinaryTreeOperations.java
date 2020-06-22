/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreeoperations;

/**
 *
 * @author pc
 */
public class BinaryTreeOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Tree t=new Tree();
        t.insert(25);
        t.insert(20);
        t.insert(15);
        t.insert(27);
        t.insert(30);
        t.insert(29);
        t.insert(26);
        t.insert(22);
        t.insert(32);
        
        
        t.inorder();
        t.preorder();
        t.postorder();
        
        System.out.println(t.get(17));          //returns null
        System.out.println(t.get(29));          //returns the data
        
        System.out.println("\n"+t.min());        //returns 15
        System.out.println(t.max());             //returns 32
        
        t.remove(15);
        System.out.println("");
        t.preorder();
        
        t.remove(32);
        System.out.println("");
        t.preorder();
        
        t.remove(26);
        System.out.println("");
        t.preorder();
    }
    
}
