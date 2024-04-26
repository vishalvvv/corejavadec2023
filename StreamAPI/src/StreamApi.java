import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameStrings = Arrays.asList("Michelle","Meg","Christina","Jennifer","Salma");
		List<String> filteredNames = nameStrings.stream().filter(name->name.startsWith("M")).collect(Collectors.toList());
						                        
			System.out.println("Filtered Names: " + filteredNames);
			
			List<String> formattedNames = nameStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
			System.out.println("Formatted Names: " + formattedNames);
			
			List<Integer> ranks = Arrays.asList(1,1,2,4,2,4,3);
			List<Integer> uniqueRanks = ranks.stream().distinct().collect(Collectors.toList());
			System.out.println("Unique Ranks:" + uniqueRanks);
			
			List<String> sortedNames = nameStrings.stream().sorted().collect(Collectors.toList());
			System.out.println("Sorted Names: " + sortedNames);
			
			List<String> limitNames = nameStrings.stream().limit(4).collect(Collectors.toList());
			System.out.println("Limited Names: " + limitNames);
			
			nameStrings.stream().forEach(name -> System.out.println(name));
			
			int sum=ranks.stream().reduce(0,(accumulator,currentValue) -> accumulator + currentValue);
			System.out.println(sum);
			
			long count = ranks.stream().count();
			System.out.println(sum+" "+count);
			

	}

}
