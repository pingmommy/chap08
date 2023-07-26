package com.example;


// 클래스면 익명자식객체 부모가 클래스 
//인터페이스를 구현했는데, 이름이 없는 클래스면 익명구현객체 부모가 인터페이스 

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	
	static class A extends TimerTask{  // 추상클래스여서 TimerTask를 new할 수 없다. 구현 클래스가 꼭 필요. 

		@Override
		public void run() {
			System.out.println((char)(Math.random()*26+'A'));
		}
		
	}

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		A a = new A();
		timer.schedule(a,0, 100);
		
		
		//익명자식객체 (자바에만 있다.)
		TimerTask n = new TimerTask() { // TimerTask를 상속받은 자식객체인데, 이름이 없기 때문에 익명자식 객체 
			
			@Override
			public void run() {
				System.out.println(Math.random()*10);
			}
		};
		timer.schedule(n, 0, 1000);

		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println((char)(Math.random()*26+'a'));
	
			}
		}, 0, 5000);
		
		
		
	}

}
