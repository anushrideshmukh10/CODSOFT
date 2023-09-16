import java.util.Scanner;

public class Calculator {
public static void main(String args[]) {
// This program assumes that the student has 6 subjects
int marks[] = new int[6];
int i;
float total=0, avg_percentage;
Scanner scan = new Scanner(System.in);
        
for(i=0; i<6; i++) { 
System.out.print("Enter Marks of Subject "+(i+1)+":");
marks[i] = scan.nextInt();
//Total marks of student
total = total + marks[i];  
}
System.out.println("Total Marks out off 600 is : "+total);
scan.close();

//Calculating average here
avg_percentage = total/6;
System.out.println("The Average Percentage is: "+avg_percentage);
System.out.print("The student Grade is: ");

if(avg_percentage>=80) {
System.out.print("A");
}
else if(avg_percentage>=60 && avg_percentage<80) {
System.out.print("B");
} 
else if(avg_percentage>=40 && avg_percentage<60) {
System.out.print("C");
}
else {
System.out.print("D");
}
}
}