package com.example;

public class AnnonymousExample {

	/*
	 * 익명자식객체
	 * 익명구현객체
	 * */
	
	static abstract class A{
		abstract void show();
	}
	
	static class B extends A {

		@Override
		void show() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {

		A a = new B();
		
		
		// A를 new한 게 아니다. A를 상속한 자식객체를 만드는 문법. 
		// A의 자식객체를 만들었는데, 이름이 없다. 그래서 a2에 값을 대입해야 한다. 
		// 익명자식객체
		// 선언과 동시에 new까지 한 번에 하기때문에 아주 간편하다. 
		// 딱 한 번만 만들 수 있는 일회성 객체
		A a2 = new A() {

			@Override
			void show() {
				// TODO Auto-generated method stub
				
			} 
		
		}; }}


