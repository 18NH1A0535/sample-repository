package com.capg;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(8989789,"xyz",30000,10000,false);
		Bank b1=new Bank(898342,"hgd",30000,10000,true);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b1.getBalance());
		System.out.println(b.getBalance());
	}

}
