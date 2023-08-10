package com.example;

public class AnnonymousExample {

	/*
	 * 익명자식객체 - 클래스를 상속 
	 * 익명구현객체 - 인터페이스를 구현
	 * 
	 * 
	 * 익명객체도 메소드 안에 생성되면 로컬클래스
	 * 
	 * 필드나 로컬변수로 쓰이는 익명객체는 로컬클래스 아님. 
	 * 
	 * 익명객체는 필드, 매개변수, 로컬변수의 초기값으로 주로 사용된다. 
	 * 
	 * '='대입연산자가 있는 곳에서는 익명객체를 다 사용할 수 있다. 
	 * 
	 * 값이 필요한 곳, 인스턴스가 필요한 곳이라면 다 쓸 수 있다. 
	 * 
	 */
	
	Runnable r = new Runnable() {

		@Override
		public void run() {
			
		}
	};
	
	static abstract class A{
		
		abstract void show();
	
	}
	
	static class B extends A {

		@Override
		void show() { }
		
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
			void show() { } 
			
		}; 
		
		Runnable r = new Runnable() {
			
			{ System.out.println("생성자"); } // -> 익명구현객체의 생성자임. 객체의 이름이 없으니 생성자의 이름도 없음. 기본생성자만 생성가능
			
			@Override
			public void run() {
				show();
			}
			void show() { } // -> 익명구현객체 안에 새로운 메소드를 추가할 수 있으나 익명객체 외부에서 쓸 수는 없다. 오로지 익명객체 내부에서만 사용. 
		};
	     
		r.run();
		//r.show(); (x)
	
	}
}


