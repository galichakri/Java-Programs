import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sqrt=num*num;
		int rem,sum=0;
		while(sqrt>0) {
			rem=sqrt%10;
			sum=sum+rem;
			sqrt=sqrt/10;
		}
		if(sum==num) {
			System.out.println("it is a neon number");
		}
		else {
			System.out.println("not a neon number");
		}
	}

}
