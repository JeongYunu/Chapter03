package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		Object obj01 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj01.getClass());
		System.out.println(obj01.toString());
		System.out.println(obj01.equals(obj01));
		
		//getClass --> Class 정보
		System.out.println("=obj01.getClass()=============");
		System.out.println(obj01.getClass());
		System.out.println("==============================");
		
		//hashCode() --> 주소값 --> 주소에 대응되는 중복되지 않는 값
		System.out.println("=obj01.hashCode()=============");
		System.out.println(obj01.hashCode());
		
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		
		System.out.println("==============================");
		
		//toString() --> 객체의 값 정보
		System.out.println("=obj01.toString()=============");
		System.out.println(obj01.toString());
		System.out.println("==============================");
		
		//equals() --> 객체의 값 정보
		System.out.println("=obj01.equals(obj)=============");
		System.out.println(obj01.equals(obj01));
		System.out.println("==============================");
		
		
		
		
		
		
		
		//Point p01 = new Point();
		//System.out.println(p01.toString());
		
		
		
		
		
		
	}

}
