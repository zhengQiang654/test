package com.zfq.classloader;

public class StaticValueTest {
	public static String  HELLOWORLD = "hello world";
	public static final String  HELLOWORLD1 = "hello world";
	static {
		System.out.println("StaticVlueTest 被初始化");
	}
	public StaticValueTest (){
		System.out.println("调用了父类的构造函数");
	}
}
