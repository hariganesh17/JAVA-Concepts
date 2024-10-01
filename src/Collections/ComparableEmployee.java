package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEmployee implements Comparable<ComparableEmployee>{
   private String name;
   private int age;

   public ComparableEmployee(String name,int age){
       this.name =name;
       this.age = age;
    }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }

    @Override
    public int compareTo(ComparableEmployee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name +" "+ age ;
    }

    public static void main(String[] args){
       List<ComparableEmployee> employees = new ArrayList<>();
        employees.add(new ComparableEmployee("chevv",29));
       employees.add(new ComparableEmployee("Hari",25));


        Collections.sort(employees);

        System.out.println("Employees sorted by age: ");
        for(ComparableEmployee emp : employees){
            System.out.println(emp);
        }
    }
}
