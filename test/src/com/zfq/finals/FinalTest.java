package com.zfq.finals;

public class FinalTest {
	 static final String str = "hello";
	 private final String str1 = "hello1";
	 private final int a = 1;

	 static String b = "hahah";
	 
	public static void main(String[] args) {
		new FinalTest().b = "hahhahha";
		System.out.println(b);
		new FinalTest().test();
	}
	private void test() {
		//final 变量不可以改变值；
		//静态变量的引用不可以改变  ， 但是值可以改变
	}

}
