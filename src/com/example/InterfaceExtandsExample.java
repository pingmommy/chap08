package com.example;

public class InterfaceExtandsExample {
	
	interface Showable{
		void show();
		void hide();
	}
	
	interface Moveable{
		void right();
		void left();
		void up();
		void down();
	}
	
	interface Shapable extends Showable, Moveable {
		
		void move();
	}
	
	static class B implements Shapable {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void right() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class A implements Showable, Moveable{

		@Override
		public void right() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
