Frequently asked interview programs on java 8 streams



1. Write a program to print employee details working in each department.
  
  public class JavaProg{

    public static void main(String[] args){
        List<Employee> emplist = new ArrayList<>();
        empList.add(new Employee(101,"Aditya ",101,"active",2000));
        empList.add(new Employee(102,"SHyam ",102,"active",5000));
        empList.add(new Employee(102,"Siva ",102,"active",6000));
        empList.add(new Employee(102,"Reddy",102,"active",4000));
        empList.add(new Employee(102,"alice",102,"active",3500));
      
      
      Map<Integer,List<Employee>> empLostBased = empList.stream().collect(Collectors.groupingBy(Employee:: getDeptId, Collectors.toList()));
      empListBased.entrySet().forEach( entry -> {
      System.out.println(entry.getKey() + "-----" +entry.getValue());
      })
      
    }


}
  
  
2. Write a program to print employees count working in each department.
  Map<Integer,Long> empCountDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
  
   empCountDept.entrySet().forEach( entry -> {
      System.out.println(entry.getKey() + "-----" +entry.getValue());
      })
  
3.Write a program to print active and inactive employees in the given collection.
     
     Long activeEmpcount = empList.stream().filter(e -> "active".equals(e.getStatus())).count();

    Long inactiveEmpcount = empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
     
     
4. Write a program to print Max/min employee salary from the given collection. 
  
  Optional<Employee> emp1 = empList.stream().max(Comparator.comparing(Employee::getSalary));

  Optional<Employee> emp2 = empList.stream().min(Comparator.comparing(Employee::getSalary));
  
  
5.Write a program to print the max salary of an employee from each department. 

  Map<Integer, Optional<Employee>> topSalaryEmpDept = empList.stream().collect(Collectors.groupingBy(Employee:: getDeptId, 
                                                   Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))
                                                   ));
  
  topSalaryEmpDept.forEach( e-> {
  System.out.println(e.getKey()+ "-------" +e.getValue())
  })
