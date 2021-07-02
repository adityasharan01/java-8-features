import java.util.StringJoiner;

//Input Hello How are you 
//Output [Hello-How-are-you]
public class Examplefeatures {
	
	public static void main(String[] args) {
		String input="Hello How are you";
		String[] inputArray =input.split(" ");
		StringJoiner joiner = new StringJoiner("-","[","]");  //arguments: delimiter,prefix,suffix
		for(String inputArr : inputArray) {
			joiner.add(inputArr);
		}
		System.out.println(joiner.toString());
		
		}
	}
