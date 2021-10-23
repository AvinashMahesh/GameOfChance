import java.util.Scanner;
import java.util.Random;

		public class GameOfChance {
			
		public static void main (String[] args) {
			
			Random ran = new Random();
			Scanner s = new Scanner (System.in);
			
		
			int point; 
			int bplace;
			int d1;
			int d2;
			int num;
			int sum1 =0 ; 
			int sum2;
			String ucheck;
			num = 0;
			boolean First = false; 
			boolean secondc = false;
			
			System.out.println("Enter your intial amount of points: ");
			point = s.nextInt();
			
	while(First == false && point >= 0) {
	do {
	
		System.out.println("Enter a valid bet: ");
	
		bplace = s.nextInt();
	}
	
	while(bplace > point || bplace <= 0);
	num = 1;
	d1 = ran.nextInt(6) + 1;
	d2 = ran.nextInt(6) + 1;
	sum1 = d1 + d2;
	System.out.println ("You roll " + sum1);

	if(sum1 == 2 || sum1 == 3 || sum1 == 12) {
	point -= bplace;
	
	First = true;
	
	System.out.println("Round Lost");
	
	System.out.println("New point balance: " + point + ".");

	if (point <= 0) {
	point = 0;
	break;
		}
			}

	else if (sum1 == 7 || sum1 == 11) {
	point += bplace;
	First = true;
	System.out.println("This round has been won.");
	System.out.println("Your new point balance is " + point);

	}

	else {
	System.out.println("This round has neither been won nor lost");
	while (First != true && point > 0) {
	s = new Scanner(System.in);
	
	num++;
	
	System.out.println("Would you like to proceed to round " + num + "? ");
	ucheck = s.nextLine();

	if (ucheck.equalsIgnoreCase("Yes") || ucheck.equalsIgnoreCase("Y")) {
	d1 = ran.nextInt(6)+1;
	d2 = ran.nextInt(6)+1;
	sum2 = d1 + d2;
	
	System.out.println("Your roll " + sum2);

	if(sum1 == sum2) {
	First = true;
	point += bplace;
	
	System.out.println("This round has been won.");
	System.out.println("Your new point balance is " + point + ".");

	}

	else if(sum2 == 7) {
	First = true;
	point -= bplace;
	
	System.out.println("This round has been lost.");
	System.out.println("New point balance: " + point);

	if(point <= 0) {
	point = 0;

	break;
	}

	}

	else {
		
	System.out.println("Round neither won or lost.");
	
		}
			}

	else {
		
	First = true;
	
	System.out.println("Round forfeited.");
	
		}

		}
	}

	if (First == true && point > 0) {
		
	System.out.println("Play Again?");
	
	s = new Scanner(System.in);
	
	ucheck = s.nextLine();

	if(ucheck.equalsIgnoreCase("Yes") || ucheck.equalsIgnoreCase("Y")) {
		
	First = false;
	
			}
	else {
		
	break;
	
		}
				}
	}

	System.out.println("----------------");
	System.out.println("Final Points: " + point);

		}

		}
