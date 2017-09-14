package com.org.algorithm;


/**
 * @Description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * @author: She Xiangdong
 * @date: 2017年9月14日
 */
public class Power {
	
	public static double powerT(double base, int exponent){
		double result=1,curr=base;
		int n;
		if (exponent>0) {//指数>0，则将指数值赋给n，保留原来指数值，再最后判断是返回结果原值，还是结果倒数
			n=exponent;
		}else if (exponent<0) {//指数<0，分母是不能为0的
			if (base==0) {
				throw new RuntimeException("分母不能为0");
			}
			n=-exponent;//使其变为正数
		}else {//指数==0
			return 1;
		}
		
		while (n!=0) {
			if ((n&1)==1) //指数的二进制数最后一位与1相与，看是否在该位置有值
				result*=curr;
			curr*=curr;//加倍
			n>>=1;//右移
		}
		
		return exponent<=0?1/result:result;
		
	}

	public static void main(String[] args) {
		// 1:0001
		// 2:0010
		// 3:0011
		// 4:0100
		// 5:0101
		//6: 0110
		System.out.println(powerT(11, 13));
		System.out.println(6 >> 1);
		System.out.println(5&1);
	}

}
