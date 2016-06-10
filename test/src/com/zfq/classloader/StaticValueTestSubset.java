package com.zfq.classloader;

public class StaticValueTestSubset {
 public static void  main(String args []){
	 //在字符常量没有添加finali时，会初始化引用类
	System.out.println(StaticValueTest.HELLOWORLD); 
 }
}
