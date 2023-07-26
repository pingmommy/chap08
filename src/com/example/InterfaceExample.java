package com.example;

import java.util.TimerTask;

import com.example.InterfaceExample.Task.Showable;

public class InterfaceExample {
	
	// 일반클래스 : 인스턴스를 생성해서 동작시키는 게 목적
	static class A{
		
		class AA{
			
		}
		static int count;
		int num;
		
		static {
			
		}
		
		public A() {
			// TODO Auto-generated constructor stub
		}
		
		void show() {
			
		}
		
		static int getCount() {
			return count;
		}
	}
	
	//추상클래스 : 상속이 목적 ( 부모로써 기능함.) 불완전해서 객체생성할 수 없고 상속이 목적. 상속은 중복코드를 줄이기 위해 
	static abstract class B {
		static int count = 0;
		int num;
		
		public B() {

		}
		
		void show() {
			
		}
		
		static int getCount() {
			return count;
		}
		
		abstract void hide(); //추상메소드 : 바디가 없으므로 불완전한 메소드
	}
	
	static class AA extends A{
		
	}
	
	
	static class BB extends B{   // B는 추상클래스이므로 상속받은 자식 클래스 BB는 오버라이드하여 추상메소드를 완성시켜야 한다.

		@Override
		void hide() {
			// TODO Auto-generated method stub
			
		} 
		
	}
	
	
	//TimerTask가 추상클래스여서 반드시 오버라이드 하여 run()메소드를 완성시켜야 한다. 
	static class Task extends TimerTask{

		@Override
		public void run() {
			
		}
		
	
		// 추상메소드만 있다.(=>순수추상클래스) D를 상속받는 클래스는 반드시 메소드 show() hide()를 오버라이드 해야 한다.  
		static abstract class D {
		
		abstract void show();
		abstract void hide();
		
	    }
		static class DD extends D{

			@Override
			void show() {
				// TODO Auto-generated method stub
				
			}

			@Override
			void hide() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		static interface Showable{  // 바디가 없다. 어떤 클래스의 규격과 같은 역할 (강제하는 역할 : 질서유지) =>인터페이스
			void show();
			void hide();
		}
		
		
		static interface Moveable{
			
			void left();
			void right();
			void up();
			void down();
			
		}
		
		static class E implements Showable, Moveable{
// 인터페이스는 여러 개의 인터페이스를 implement할 수 있다. 
// class E를 구현클래스라고 한다. 
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void hide() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void left() {
				
			}

			@Override
			public void right() {
				
			}

			@Override
			public void up() {
				
			}

			@Override
			public void down() {
				
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {

		A a = new A();
	//	B b = new B(); (X)
		
	//	Showable s = new Showable();  
 //     인터페이스는 변수의 타입으로는 올 수 없다. 레퍼런스 타입이고 클래스이기 때문에. 그러나 new연산자로 생성할 수는 없다.  	
		
		
		B b= null;
		
		Showable s = null;
		
		A a1 = new AA(); // 업케이스팅 가능
		
		B b1 = new BB(); // B b1는 추상클래스 타입의 변수인데, 여기에 new BB()이래도 아무런 문제가 없다. 
		
		//Showable s1 = new E();
		
		//Moveable m1 = new E();
		
	}

}
