package com.zfq.classloader;

public class StaticVlaueTest2 {
	//static final 修饰的字符常量， 在编译时经过了常量传播优化， 已经将StatcValueTest的final常量存到staticvaluetest的常量池中，
	//编译后这两个类就不存在关系了
	public static void main(String[] args) {
		System.out.println(StaticValueTest.HELLOWORLD1);
	}

}
