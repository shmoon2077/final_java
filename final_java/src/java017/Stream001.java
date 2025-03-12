package java017;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Stream001 {
public static void main(String[] args) {
	//- 데이터종류에 상관없이 ( Stream ) 같은 방식으로 처리 ( lambda )
	
	Integer[] arr = {1,2,3,4,5};
	List<Integer> list = Arrays.asList(arr);
	
//	Arrays.stream(arr).forEach( (t)->{ System.out.print(t); });
//	Arrays.stream(arr).forEach(  t-> System.out.print(t)   );	
	Arrays.stream(arr).forEach(  System.out::print   );	
	
	
	
	//Consumer <Integer> action  // super Integer > Integer 포함 부모  > Object -> number -> integer
	//Consumer <Number> action  //
	//Consumer <Object> action  // 

	System.out.println();
	System.out.println();
	
	list.stream().forEach( System.out::print );
	
	
	
	
	
	
	
}
}
