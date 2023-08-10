package com.example;

import util.InvalidCursorException;
import util.VT100;

public class VT100ExceptionExample {

	public static void main(String[] args) {

		try {
		
		VT100.cursorMove(100, 200);
		VT100.cursorMove(0, -200);

		}catch(InvalidCursorException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("programEnd");
	}

}
