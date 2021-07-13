Sorting Weekdays Using Java Comparator | Tricky Java Interview Questions

public enum Weekdays {
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	
	private Integer weekDayVal;
	
	Weekdays(Integer weekDayVal) {
		this.weekDayVal = weekDayVal;
	}

	public Integer getWeekDayVal() {
		return this.weekDayVal;
	}
}
Arrays.asList(Weekdays.MONDAY,Weekdays.SATURDAY,Weekdays.THURSDAY,Weekdays.SUNDAY).stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

//METHOD 2

List<String> input3 = Arrays.asList("MONDAY",'THURSDAY',"TUESDAY");

Collections.sort(input3, new WeekdaysComparator());


public class WeekdaysComparator implements Comparator<String> {
private Map<String,Integer> weekMap;
  
  WeekdaysComparator(){
    weekMap= new HashMap<>();
    weekMap.put("SUNDAY",0);
    weekMap.put("MONDAY",1);
    weekMap.put("TUESDAY",2);
    weekMap.put("WEDNESDAY",3);
    weekMap.put("THURSDAY",4);
    weekMap.put("FRIDAY",5);
    weekMap.put("SATURDAY",6);
 
  }
  
  public int compare(String o1,String o2){
  return weekMap.get(o1).compareTo(weekMap.get(o2));
  
  }

}

