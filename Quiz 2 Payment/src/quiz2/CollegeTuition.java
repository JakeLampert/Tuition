package quiz2;
import java.util.Scanner; 

public class CollegeTuition {
	
	public static void main(String[] args){
		
		System.out.println("Enter The Increase in tuition(%): ");
		Scanner scanner = new Scanner(System.in);
		double PercentIncrease = scanner.nextDouble();
		
		System.out.println("Enter starting tuition cost: ");
		Scanner scanner1 = new Scanner(System.in);
		double StartingTuition = scanner.nextDouble();
		
		double OverallTuition= 0.0;
		int totalYears = 4;
		 for (int i=1; i<= totalYears; i++){
			 OverallTuition= OverallTuition + StartingTuition;
			 StartingTuition = StartingTuition * (1 + PercentIncrease);
			 
		 }
		 System.out.println("Your total tuition for years is " + String.format("%.2f", OverallTuition));
	
		
	}
}