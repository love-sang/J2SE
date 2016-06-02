package com.somnus.accessModifier;

public class PassByValueDemo2 {
    
	/**
	 * java按值传递，不是按引用传递
	 */
	    int num = 9;
	    String str = "love";
		char[] ch = {'h','e','l','l','o'};
		void change(int num,char[] ch,String str){
			num = 10;
			ch[0] = 'm';
			ch = new char[]{'w','o','r','l','d'};
			ch[0] = 'n';
			str = "you";
		}
		public static void main(String[] args) {
			PassByValueDemo2 t = new PassByValueDemo2();
			t.change(t.num,t.ch,t.str);
			System.out.print("num:"+t.num+" str:"+t.str+" ch:");
			System.out.println(t.ch);
		
			//num:9 str:love ch:hello mello
		}
}
