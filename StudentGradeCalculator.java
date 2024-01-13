import java.util.Scanner;

public class StudentGradeCalculator {
    private static Scanner sc;
	public static void main(String[] args) 
	{
		int s1, s2, s3, s4,s5; 
	    float total, percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks out of 100 : ");
		System.out.println("\nEnter subject1 marks:");
		 s1= sc.nextInt();	
		 System.out.println("Enter subject2 marks:");
		s2 = sc.nextInt();
		System.out.println("Enter subject3 marks:");
		s3 = sc.nextInt();	
		System.out.println("Enter subject4 marks:");
		s4= sc.nextInt();	
		System.out.println("Enter subject5 marks:");
		s5= sc.nextInt();	
		
		total = s1+ s2 + s3 + s4 + s5;
	    percentage = (total / 5) ;
	 
	    System.out.println(" Total Marks obtained =  " + total);
	    System.out.println(" Average Percentage =  " + percentage);
		
		if(percentage >=90 && percentage <= 100)
	    {
			System.out.println("\nYour Grade is A");
		}
		else if(percentage>=80 && percentage <= 90)
	    {
			System.out.println("\nYour Grade is B");
		}
		else if(percentage >=70 && percentage<= 80)
	    {
			System.out.println("\nYour Grade is C");
		}
		else if(percentage >= 60 && percentage<=70)
	    {
			System.out.println("\nYour Grade is D");
		}
		else if(percentage >= 40 && percentage<=60)
	    {
			System.out.println("\nYour Grade is E");
		}
		else 
	    {
			System.out.println("\nYou Failed!!!");
		} 
	}
}