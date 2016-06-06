package com.zfq.math;

import org.junit.Test;

public class NanTest {
	public static void main(String[] args) {
		Double d = Double.NaN;
		if(!(d > 10 || d <= 10)){
			System.out.println("存在");
		}
	}
	@Test
	public  void float_Nan_Test(){
		Float f  = Float.NaN;
		if (!(f<1||f>=1)) {
			System.out.println("hahahh");
		}
	}
}
