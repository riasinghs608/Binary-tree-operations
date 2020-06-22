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
public class Tree {
    
    private TreeNode root;
    
    public void insert(int value)
    {
        if(root==null)
            root=new TreeNode(value);
        else
        {
            root.insert(value);
        }
    }
    
    public void inorder()
    {
        if(root!=null)
            root.inorder();
    }
    
    public void preorder()
    {
        if(root!=null)
            root.preorder();
    }
    
    public void postorder()
    {
        if (root != null) 
        {
            root.postorder();
        }
    }
    
    public TreeNode get(int value)
    {
        if(root!=null)
            return root.get(value);
        else
            return null;
    }
    
    public int min()
    {
        if(root==null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }
    
    public int max()
    {
        if(root==null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }
     
    private TreeNode remove(TreeNode subroot,int value)
    {
        if(subroot==null)
            return subroot;
        if(value<subroot.getData())
        {
            subroot.setLeft(remove(subroot.getLeft(),value));
        }
        else if(value>subroot.getData())
        {
             subroot.setRight(remove(subroot.getRight(),value));
        }
        else
        {
            if(subroot.getLeft()==null)
                return subroot.getRight();
            
            else if(subroot.getRight()==null)
                return subroot.getLeft();
            
            subroot.setData(subroot.getRight().min());
            
            subroot.setRight(remove(subroot.getRight(),subroot.getData()));
        }
        return subroot; 
    }
     
    public void remove(int value)
    {
        root=remove(root,value);
        
    }
      

    
}
