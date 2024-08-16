import java.util.Scanner;

public class Addition_without_operator {
	public static int add(int a,int b) {
		if(b==0) {
			return a;
		}
		int sum = a^b;
		int carry =(a&b)<<1;
		return add(sum,carry);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num 1:");
		int num1=sc.nextInt();
		System.out.println("Enter the value of num 2:");
		int num2=sc.nextInt();
		System.out.println("The resultant value is");
		int sum=add(num1,num2);
		System.out.println(sum);
	}
}
