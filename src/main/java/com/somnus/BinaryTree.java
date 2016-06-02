package com.somnus;

public class BinaryTree {

	/**
	 * @see先序遍历
	 * 1.访问根节点 
     * 2.前序遍历左子树 
     * 3.前序遍历右子树 
	 */
	/*
	 * 										 12
	 * 									  /		  \
	 * 								    9		   76
	 * 								   / \        /  \
	 *								 6	  10    35    90
	 *									       /       \
	 *									     22        48
	 *									    /         /  \
	 *									  16        46    58
	 *										       /
	 *										     40
	 */
	public static void preOrder(Node root){
		if(root!=null){
			System.out.print(root.data+"-");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	/**
	 * @see中序遍历
	 * 1.中序遍历左子树 
     * 2.访问根节点 
     * 3.中序遍历右子树 
	 */
	/*
     *                                       12
     *                                    /       \
     *                                  9          76
     *                                 / \        /  \
     *                               6    10    35    90
     *                                         /       \
     *                                       22        48
     *                                      /         /  \
     *                                    16        46    58
     *                                             /
     *                                           40
     */
	public static void inOrder(Node root){
		if (root != null){
			inOrder(root.left);
			System.out.print(root.data + "-");
			inOrder(root.right);
		}
	}
	
	/**
	 * @see后序遍历
	 * 1.后序遍历左子树 
     * 2.后序遍历右子树 
     * 3.访问根节点
	 */
	/*
     *                                       12
     *                                    /       \
     *                                  9          76
     *                                 / \        /  \
     *                               6    10    35    90
     *                                         /       \
     *                                       22        48
     *                                      /         /  \
     *                                    16        46    58
     *                                             /
     *                                           40
     */
	public static void postOrder(Node root){
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "-");
		}
	}
	
	/**
	 * 测试二叉树遍历
	 */
	/*
     *                                       12
     *                                    /       \
     *                                  9          76
     *                                 / \        /  \
     *                               6    10    35    90
     *                                         /       \
     *                                       22        48
     *                                      /         /  \
     *                                    16        46    58
     *                                             /
     *                                           40
     */
	public static void main(String[] args) {
		int[] array = { 12, 76, 35, 22, 16, 48, 90, 46, 9, 40,58,6,10 };
		Node root = new Node(array[0]); // 创建二叉树
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]); // 向二叉树中插入数据
		}
		System.out.println("先序遍历：");
		preOrder(root);
		System.out.println();
		System.out.println("中序遍历：");
		inOrder(root);
		System.out.println();
		System.out.println("后序遍历：");
		postOrder(root);
	}
	
	
}

class Node{
	int data;//根节点数据
	Node left;//左数
	Node right;//右数
	
	public Node(int data) {//实例化二叉树类
		this.data=data;
		left=null;
		right=null;
	} 
	//{ 12, 76, 35, 22, 16, 48, 90, 46, 9, 40,58,6,10 };
	public void insert(Node root ,int data){// 向二叉树中插入子节点
		if(data>root.data){// 二叉树的左节点都比根节点小
			if(root.right==null){
				root.right=new Node(data);
			}else{
				this.insert(root.right, data);
			}
				
		}else{// 二叉树的右节点都比根节点大
			if(root.left==null){
				root.left=new Node(data);
			}else{
				this.insert(root.left, data);
			}
		}
	}
}