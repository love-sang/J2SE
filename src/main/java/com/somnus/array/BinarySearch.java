package com.somnus.array;
/**
 * 
 *@Project:J2SE
 *@class:BinarySearch
 *@descript:二叉树查找
 *@date:2016年6月8日 下午1:59:22
 *@author San
 *@version:V1.0
 */
public class BinarySearch {

	public static int binarySearch(int[] array, int value){
		int low = 0;
		int high = array.length-1;
		int middle = 0;
		while(low <= high){
			middle = (low+high)/2;//0 6    4 6    6 6
			for(int i = 0;i < array.length;i++){
				System.out.print(array[i]+" ");
				if(i == middle){//3 5 6 紧随最中间的指向 后面 打印分隔符
					System.out.print("$$  ");
				}
			}
			System.out.println();
			if(array[middle] == value){
				return middle;
			}
			if(value < array[middle]){
				high = middle - 1;
			}
			if(value > array[middle]){
				low = middle + 1;
			}
			
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args){
		int[] array = {7,3,9,5,6,8,1};
		int[] array1 = BubbleSort.bubbleSort(array);
		int index = binarySearch(array1,1);
		System.out.println("所在的位置:"+index);
	}
}
