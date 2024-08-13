import java.util.Scanner;

public class String_VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		String a=sc.nextLine();
		String choice=a.toLowerCase();
		switch(choice){
		case "a":
		{
			flag=true;
			System.out.println("it is a vowel");
			break;
		}
		case "e":
		{
			flag=true;
			System.out.println("it is a vowel");
			break;
		}
		case "i":
		{
			flag=true;
			System.out.println("it is a vowel");
			break;
		}
		case "o":
		{
			flag=true;
			System.out.println("it is a vowel");
			break;
		}
		case "u":
		{
			flag=true;
			System.out.println("it is a vowel");
			break;
		}
		}
		if(flag==true) {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("Not a vowel");
		}
	}

}
