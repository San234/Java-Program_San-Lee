import java.util.Scanner;

public class Receipt
{
	static double price1;
	static double price2;
	static double price3;
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		String item1;
		System.out.print("Please Enter Item #1: ");
		item1 = user_input.nextLine();

		System.out.print("Please Enter Price of Item #1: ");
		price1 = user_input.nextDouble();
		user_input.nextLine();
		
		String item2;
		System.out.print("Please Enter Item #2: ");
		item2 = user_input.nextLine();
		
		System.out.print("Please Enter Price of Item #2: ");
		price2 = user_input.nextDouble();
		user_input.nextLine();
		
		String item3;
		System.out.print("Please Enter Item #3: ");
		item3 = user_input.nextLine();

		System.out.print("Please Enter Price of Item #3: ");
		price3 = user_input.nextDouble();
		user_input.nextLine();
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * 0.92;
		double total = subtotal + tax;
		
		System.out.println("<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.println("                                           ");
		format(item1, price1);
		format(item2, price2);
		format("Subtotal",subtotal);
		format(item3, price3);
		format("Tax",tax);
		format("Total",total);
		System.out.println("___________________________________________");
		System.out.println("\t   *Thank you for your Support*");
	}
	public static void format(String one, double two){
		System.out.printf("*%15S ........\t$%11.2f\n", one, two);
	}
}
