package com.example;

public class AnnonymousExample2 {

	/*
	 * 익명자식객체
	 * 익명구현객체
	 * */
	
  interface S{
	  void show();
	  void hide();
  }
  
  static class A implements S{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	
	void move() {
		
	}
	  
  }
	
	
	public static void main(String[] args) {
		S a1= new A();
		
		//a1.move();(X) 
		
		S b = new S() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void hide() {
				// TODO Auto-generated method stub
				
			}
			
			void left() {
				
			}
			
		};
		
		b.show();
		b.hide();
		
		//b.left();(X)
		
		
		}
}


