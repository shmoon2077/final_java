package java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {
	public static void main(String[] args) {
		// ()->{} 파라미터o /리턴값 x		
//		Consumer<String> consumer = (t) ->{System.out.println("hello"+t);};
//		Consumer<String> consumer = t -> System.out.println("hello "+t);
		Consumer<String> consumer = System.out::println;
		
		consumer.accept("sally");
		consumer.accept("alpha");
		
		
		//#2. Supplier   - 제공 용도 - get
			
//		Supplier<String> supplier = ()-> { return "hello";};
		Supplier<String> supplier = ()-> "hi";
		System.out.println(supplier.get());
		
		// 파라미터 o / 리턴값 o
//		Predicate<Integer> predicate = (t)-> {return t<0;};   // ## 음수인지 양수인지 판단
		Predicate<Integer> predicate = t -> t<0;
		
		System.out.println( predicate.test(-1));
		System.out.println( predicate.test(1));
		
		
		
//		Function<String,Integer> function = (t) -> { return Integer.parseInt(t); };
//		Function<String,Integer> function = t ->  Integer.parseInt(t);
		Function<String,Integer> function = Integer::parseInt;
		
		System.out.println(function.apply("10")+3);
		
		
//		IntBinaryOperator operator = (left, right) -> { return left>=right? left:right; };
		IntBinaryOperator operator = (left, right) -> left>=right? left:right;
		
		System.out.println(operator.applyAsInt(10, 3));

		
	}

}





/* 자바 api의 함수형 인터페이스
1. Consumer   - 받는 용도 - accept
2. Supplier  - 제공 용도 - get
3. Predicate - 판단 용도 - test
4. Function - 처리용도 - apply
5. Operator - 연산용도 - apply
*/