import java.util.Scanner;
class P3
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a : ");
		a=scan.nextInt();
		
		System.out.print("Enter b : ");
		b=scan.nextInt();
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("");
		System.out.println("a+b ="+(a+b));
		System.out.println("a-b ="+(a-b));
		System.out.println("a*b ="+(a*b));
		System.out.println("a/b ="+(a/b));
		System.out.println("a%b ="+(a%b));
		System.out.println("");
		
		System.out.println("a==b is "+(a==b));
		System.out.println("a!=b is "+(a!=b));		
		System.out.println("a>b is "+(a>b));
		System.out.println("a>=b is "+(a>=b));
		System.out.println("a<b is "+(a<b));
		System.out.println("a<=b is "+(a<=b));
		System.out.println("");

		
	}

}