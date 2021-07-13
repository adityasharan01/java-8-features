// Find the vowels count in the String and find the duplicates in the String USING STREAMS

public class StreamOnString {
    public static void main(Stirng[] args){
    String input ="Hello Hello";
      
      Long count = input.chars().filter( x -> {
      return (x=='a' || ....e i o u)
      }).count()
    
        
    Map<String,Long> output = input.chars().mapToObj(x -> (char)x).collect(Object::toString, Collector.counting());
      
      output.forEach( e -> Sysout( e.key() + "  " + e.value() )
    }

}
