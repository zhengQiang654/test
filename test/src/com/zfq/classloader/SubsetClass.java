package com.zfq.classloader;

public class SubsetClass extends SupperClass {
	static {
		System.out.println("子类被初始化");
	}
	public static void main(String args []){
		SupperClass supper [] = new SupperClass[10];
	}
}
