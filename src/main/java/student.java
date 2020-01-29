import java.util.*;
 class student {
     // public static void main(String[] args) {
     //    Scanner sc = new Scanner(System.in);
     private int id;
     private String name;
     private double avg;

     //the constructor must have the same name of the class
     public student(int id, String name, double avg) {
         this.id = id;
         this.name = name;
         this.avg = avg;
     }

     public student(int id, String name) {
         this.id = id;
         this.name = name;
         this.avg = 0;
     }

     public student()  //the default constructor
     {
         this.id = 1;  //suppose it will be auto numbering
         this.name = null;
         this.avg = 0;
     }
     /* over loading feature: means of create multiple methods having the same name or
     create multiple constructors but either methods or constructors must have different parameters. */

     //Getter methods to get the value of attributes
     public int getID() {
         return id;
     }

     public String getName() {
         return name;
     }

     public double getAvg() {
         return avg;
     }

     //Setter methods to change the value of attributes
     public void setID(int id) {
         this.id = id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAvg(double avg) {
         this.avg = avg;
     }

     //To set the formatting of how to print the values of attributes
     public String toString() {
         return "The student id:" + id + "     The student name:" + name + "      The student average:" + avg;
     }

     //find the grade
     public String grade() {
         int m=(int)(avg/10);
         switch(m){
             case 10:return "A+";
             case 9:return "A" ;
             case 8:return "B" ;
             case 7:return "C";
             case 6:return "D";
             default:return "F";
         }
     }
 }



















