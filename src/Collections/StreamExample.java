package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String [] args) {
		
		List<Integer> salaryList = new ArrayList<>();
		salaryList.add(1500);
		salaryList.add(3000);
		salaryList.add(500);	
		salaryList.add(4000);
		salaryList.add(1000);
		
		long output = salaryList.stream().filter((Integer val)-> val>1000).count();
		
		System.out.println("people with salary above 1000:"+output) ;
			
		// Stream Intermediate Operation 
		
		//1.Filter: it iterate over collections 0r streams and it pass into  predicate which has one abstract mecthod 
		//			which accept one parameter and then check condition if predicate returns true then it add into next stream)
		
		Stream<String> stream = Stream.of("hi", "there","good","eve");
		Stream<String> filterStream = stream.filter((String name)-> name.length() <=8);
		
		List<String> output1= filterStream.collect(Collectors.toList());
		System.out.println(output1);
		
		//2.Map - used to transform each element
		
		Stream<String> stream1 = Stream.of("HI","EVERYONE","GOOD","MORNING");
		Stream<String> filterStream1 = stream1.map((String value)-> value.toLowerCase());
		
		List<String> output2 = filterStream1.collect(Collectors.toList());
		System.out.println(output2);
		
		//flat map - used to iterate complex collection
		
		List<List <String>> list = Arrays.asList(
				Arrays.asList("Hello","mister"),
				Arrays.asList("Good Morning"),
				Arrays.asList("Have","a","nice","day")
				);
		Stream<String> stream3= list.stream().flatMap((List<String> sentence)-> sentence.stream());
		
		List<String> output3 = stream3.collect(Collectors.toList());
		System.out.println(output3);
		
		//min and max terminal operation
		
		List<Integer> numbers = Arrays.asList(4,2,1,5,6);
		Optional<Integer> minValue = numbers.stream().filter((Integer val)-> val >3).min((Integer val1,Integer val2)->val1-val2);
		System.out.println(minValue.get());
		
		Optional<Integer> maxValue = numbers.stream().filter((Integer val)-> val >3).max((Integer val1,Integer val2)->val1-val2);
		System.out.println(maxValue.get());
		
		
		// sequential stream of operations
		System.out.println("Sequential..");
		List<Integer> numbers1 = Arrays.asList(3,2,4,1,7,6,5);
		
		Stream<Integer> numberStream = numbers1.stream().filter((Integer val)->val>=5)
								.peek((Integer val)->System.out.println(val))
								.map((Integer val)->(val * -1))
								.peek((Integer val) -> System.out.println(val))
								.sorted()
								.peek((Integer val)-> System.out.println(val));
								
		List<Integer> out = numberStream.collect(Collectors.toList());
		System.out.println(out);
	}
}
