package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamsLambda {
public static void main(String[] args) {
	
	ArrayList<String> names= new ArrayList<>();
	names.add("Dentist");
	names.add("Developer");
	names.add("Judge");
	names.add("Dog");
	
	//To count names starting with D using stream
	long count=names.stream().filter(s->s.startsWith("D")).count();
	System.out.println(count);
	names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
	//change into Uppercase
	
	Stream.of("Teacher","Student","Staff").filter(s->s.contains("t")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	sumOfArray();
}
public static void evenNumber()
{
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	numbers.stream().filter(s->(s%2==0)).forEach(s->System.out.println(s));
}
public static void sumOfArray()
{
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	int sum=numbers.stream().mapToInt(Integer::intValue).sum();
	System.out.println(sum);
}
}
