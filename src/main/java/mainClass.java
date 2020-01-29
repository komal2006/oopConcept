import java.util.*;
public class mainClass {
     public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
         student s1=new student();
         student s2=new student(123456, "Komal");
         student s3=new student(123456, "Komal",88.5);

         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);

         s2.setAvg(75);
         s1.setName("Deep");
         s1.setAvg(65);
         System.out.println("******************************");
         System.out.println(s1);
         System.out.println(s2);

         System.out.println("******************************");
         System.out.println("The grade of  " + s3.getName() + "   is  " + s3.grade());
}
}
