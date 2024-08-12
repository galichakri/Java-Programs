import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Twisted_Prime {
	public static void twistedPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
		System.out.println("it is a prime");
		}
		if(count>2) {
			System.out.println("not a prime");
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int r,sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num=Integer.parseInt(str);
		twistedPrime(num);
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		System.out.println(sum);
		twistedPrime(sum);
		
	}

}
