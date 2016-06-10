package com.zfq.classloader;

public class SupperClass {
	public  static String value = "hahhahah";
	static {
		System.out.println("父类被初始化");
	}
	public SupperClass (){
		System.out.println("调用了父类的构造函数");
	}
}
