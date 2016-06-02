package com.somnus;

public class QueryNumber {

	/*
	 * 5*4*3*2*1
	 */
	public int multiplication(int num){
		if(num==1){
			return 1;
		}else{
			return num*multiplication(num-1);
		}
	}
	
	/*
	 * 1+2+3+4+5+6+7+8+9+10
	 */
	public int sum(int num){
		if(num==1){
			return 1;
		}else{
			return num+sum(num-1);
		}
	}
	
	/*
	 * 1,1,2,3,5,8,13,21....
	 */
	public int compute(int num){
		if(num==1 || num==2){
			return 1;
		}else {
			return compute(num-1)+compute(num-2);
		}
	}
	
	/*
     * 1,1,2,3,5,8,13,21....
     */
	public int compute2(int num){
		int n1=1;
		int n2=1;
		for(int i=num;i<=num;i++){
			if(i!=1&&i!=2){
				n2=n1+n2;
				n1=n2-n1;
			}
		}
		return n2;
	}
	
	public static void main(String[] args){
		QueryNumber query = new QueryNumber();
		System.out.println(query.sum(100));
		System.out.println(query.multiplication(5));
		System.out.println(query.compute(9));
		System.out.println(query.compute2(9));
	}
	

}
