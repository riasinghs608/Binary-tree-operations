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
public class TreeNode {
    
    
    private int data;
    private TreeNode left,right;
    
    public TreeNode(int data)
    {
        this.data=data;
    }

    public void insert(int value)
    {
        if(value==data)
            return;
        
        if(value<data)
        {
            if(left==null)
            {
                left=new TreeNode(value);
            }
            else{
                left.insert(value);
            }
        }
        
        if(value>data)
        {
            if(right==null)
            {
                right=new TreeNode(value);
            }
            else
            {
                right.insert(value);
            }
        }
    }
    
    public void inorder()
    {
        if (left != null) 
        {
            left.inorder();
        }

        System.out.print(data + " ,");

        if (right != null) {
            right.inorder();
        }
    }
    
    public void preorder()
    {
        System.out.print(data +" ,");
        if(left!=null)
            left.preorder();
        
        if(right!=null)
            right.preorder();
    }
    
    public void postorder()
    {
        if(left!=null)
            left.preorder();
        
        if(right!=null)
            right.preorder();
        
        System.out.print(data +" ,");
    }
    
    public TreeNode get(int value)
    {
        if(value==data)
            return this;
        if(value<data)
        {
            if(left!=null)
                return left.get(value);
        }
        else
        {
            if(right!=null)
                return right.get(value);
        }
        return null;
    }
    
    public int min()
    {
        if(left==null)
            return data;
        
        else
        {
            return left.min();
        }
    }
    
    public int max()
    {
        if(right==null)
            return data;
        else
            return right.max();
    }
    
 
    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "data=" + data ;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
    
    
}
