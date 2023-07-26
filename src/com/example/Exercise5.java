package com.example;

import com.example.Exercise6.DataAccessObject;

public class Exercise5 {
	
//	interface DataAccessObject{
//		void select();
//		void insert();
//		void update();
//		void delete();
//	}
	
	static class DaoExample{
		public static void dbWork(DataAccessObject dao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}
	}
	
//	static class OracleDao implements DataAccessObject{
//
//		@Override
//		public void select() {
//			System.out.println("Oracle DB에서 검색");
//		}
//
//		@Override
//		public void insert() {
//			System.out.println("Oracle DB에 삽입");
//		}
//
//		@Override
//		public void update() {
//			System.out.println("Oracle DB를 수정");
//		}
//
//		@Override
//		public void delete() {
//			System.out.println("Oracle DB에서 삭제");
//		}
//		
//	}
//	
//	static class MySqlDao implements DataAccessObject{
//
//		@Override
//		public void select() {
//			System.out.println("MySqlDao DB에서 검색");
//		}
//
//		@Override
//		public void insert() {
//			System.out.println("MySqlDao DB에 삽입");
//		}
//
//		@Override
//		public void update() {
//			System.out.println("MySqlDao DB를 수정");
//		}
//
//		@Override
//		public void delete() {
//			System.out.println("MySqlDao DB에서 삭제");
//		}
//		
//	}
//	
//	/* 
//	 이클립스가 main에서  DaoExample 클래스는 인스턴스를 만들기 보다 
//	정적인 방식으로 접근하라고 경고했다. 
//	그래서 
//	DaoExample의 인스턴스 d를 삭제하고 
//	바로 DaoExample의 메소드를 호출했더니 warning이 사라졌다. 
//	
//	호기심에 OracleDao 역시 인스턴스를 생성하지 않고
//	바로 메소드를 호출했는데(OracleDao.delete();) 오류메세지가 떴다. 
//	
//	왜일까? 
//	
//	공통점
//	DaoExample, OracleDao 모두 Exercise04에 있는 static 클래스이다. 
//	
//	
//	
//	 차이점
//	                     DaoExample    OracleDao    
//	 부모 인터페이스            x                o
//	매개변수 인터페이스           o                x
//	DaoExample는 main에서 매개변수로 또다른 인스턴스를 갖는다.  
//	OracleDao는 매개변수없이 생성된다. 	 
//	
//	 
//	 Exercise04라는 같은 클래스에 있으니 객체생성하지 말고 그냥 쓰라는 건가....
//	 
//	 그럼  DaoExample를 다른 곳으로 옮기면?
//	
//	 */
//	
//	
//
//	public static void main(String[] args) {
//
//		
//		DaoExample.dbWork(new OracleDao());
//		DaoExample.dbWork(new MySqlDao());
////		OracleDao s = new OracleDao();
////		s.delete();
//	}

}
