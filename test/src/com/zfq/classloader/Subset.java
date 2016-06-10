package com.zfq.classloader;

import org.junit.validator.PublicClassValidator;

public class Subset {
	public static void main(String args []){
		//只用直接定义这个字段的类才会被初始化
		System.out.println(SubsetClass.value);
	}
	
}
