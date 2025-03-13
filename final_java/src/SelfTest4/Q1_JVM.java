package SelfTest4;

public class Q1_JVM {

	/*
	---------------------------------------------------------------------
	[JAVA파일 ]    A.java    (1)
	      |  [JAVA 컴파일러(javac.exe) ] javac A.java      (2)
	[CLASS파일]   A.class  (3)
	---------------------------------------------------------------------
	(4) [ Class Loader]    (5)[Execution Engine]  (6) [Garbage Collector]
		↕	↕		         ↕
	    ==========================================================================
	     (7) [ Runtime Data Area]
	     [  Method (8) | Heap(9)      | Stack (10) | PC register(11)| Native Method Stack(12)] 
	    ==========================================================================
	---------------------------------------------------------------------	   
	Q1) JVM의 영역을 구분하시오.  [ Class Loader , Execution Engine , Garbage Collector , Runtime Data Area]
	Q2) [Class Loader]  JVM이 운영체제로부터 할당받은 메모리영역인 Runtime Data Area로 적재하는 역할 
	Q3) [Execution Engine]  Class Loader에 의해 메모리에 적재된 클래스(바이트 코드)들을 기계어로 변경해 명령어 단위로 실행하는 역할
	Q4) [Garbage Collector]   Heap 메모리 영역에 생성(적재)된 객체들 중에 참조되지 않는 객체들을 탐색 후 제거하는 역할 
  	Q5) [Runtime Data Area]   JVM의 메모리 영역으로 자바 애플리케이션을 실행할 때 사용되는 데이터들을 적재하는 영역 

	Q6) Runtime Data Area을 구분하시오.
		[ method , heap  , stack  ]
	Q7) Runtime Data Area 영역중 클래스데이터가    저장되는 영역  [ method ]  ###
	Q8) Runtime Data Area 영역중 인스턴스데이터가 저장되는 영역  [ heap ]  ### 
	Q9) Runtime Data Area 영역중 지역변수데이터가 저장되는 영역  [ stack ]  ### 
	
	
	
	*/
	
	
	
	
	
}
