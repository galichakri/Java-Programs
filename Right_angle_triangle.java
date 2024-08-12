import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Right_angle_triangle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int num=Integer.parseInt(str);
	int i,j,a=0;
	/*for(i=0;i<num;i++) {
		for(j=0;j<=i;j++){                     Star program
			System.out.print("*");
		}
		System.out.println();
	}
	*/                                                    
	/*for(i=1;i<num;i++) {                                1
		for(j=1;j<=i;j++) {                               12
			System.out.print(j);                          123
		}                                                 1234
		System.out.println();                             12345
	}
	*/

	/*for(i=1;i<=num;i++) {                               1
			for(j=1;j<=i;j++) {                           22
				System.out.print(i);                      333
			}                                             4444
			System.out.println();                         55555
		}
		*/
	/*for(i=num;i>=1;i--) {                               *****
		for(j=1;j<=i;j++) {                               ****
			System.out.print("*");                        ***
		}                                                 **
		System.out.println();                             *
	}
	*/
	for(i=num;i>=1;i--) {                 //12345
		for(j=1;j<=i;j++) {               //1234
			System.out.print(j);          //123
		}                                 //12
		System.out.println();             //1
	}
	}

}
