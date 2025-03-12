package java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {
public static void main(String[] args) {
	// 데이타 종류 상관없이 같은 방식으로 처리
	Integer[] arr = {3,6,87,9,1,23,6};
	List<Integer> list= Arrays.asList(arr);
	
	
	//#1. stream
	Stream<Integer> stream_arr = Arrays.stream(arr);
	Stream<Integer> stream_list = list.stream();
		
	//#2. 중간 연산
	
//	System.out.println(stream_arr.count()+stream_list.count());
	
//	stream_arr.filter( (t)->{return t%2!=0; }); // 홀수 필터링
	stream_arr.filter( t -> t%2!=0 ); // 홀수 필터링
	stream_arr.distinct(); // 중복제거
	stream_arr.sorted(); // 정렬 
	stream_arr.skip(1); // 1 제거 
	stream_arr.forEach( (t) -> { System.out.println(t); }); 	//#3. 최종 연산
	
	
	//#3. collect
	System.out.println( Arrays.stream(arr).collect(Collectors.toList()));
	
	
	

	
	
	
}
}
