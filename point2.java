import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examplefeatures {
	int length;
	int breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numlist=Arrays.asList(5,4,3,2,1,3,3,3,4,5,6);
		Map<Integer,Long> output =numlist.stream().collect
				(
				Collectors.groupingBy(Function.identity(),Collectors.counting())
				);
		output.forEach((k,v) -> {
			System.out.println(k +" -" + v);
		});
	}
}
