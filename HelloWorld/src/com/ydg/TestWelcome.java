package com.ydg;
import com.ydg.Welcome;

public class TestWelcome {
	public static void main(String args[]){
		Welcome welcome=new Welcome();
		welcome.setMsg("Hello World");
		
		System.out.println(welcome.getMsg());
	}
	
}
