package com.example;

public class TriangleExample3 {
	
	static class Show{
		
		boolean test(int i, int j) {
			return i>=j;
		}
		
	}

	static void drawShape(Show s) {
		
		for (int i=0; i<5; i++) {
			for(int j =0; j<5;j++) {
				//if(i=j||i>j) {
				if(s.test(i, j)) {
					System.out.print('*');
				}else
					System.out.print(' ');
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		Show s = new Show();
		drawShape(s);
		drawShape(s);
		drawShape(s);
		drawShape(s);
		System.out.println("5.rect");
		drawShape(s);
		
		System.out.println("6.cross");
		drawShape(s);
	}

}
