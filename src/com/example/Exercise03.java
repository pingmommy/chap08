package com.example;

public class Exercise03 {
	
	public interface Soundable{
		String sound();
	}
	
	static class Cat implements Soundable{

		@Override
		public String sound() {
			String cat = "야옹";
			return cat;
		}
		
	}
	
	static class Dog implements Soundable{

		@Override
		public String sound() {
			String dog = "멍멍";
			return dog;
		}
		
	}
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
