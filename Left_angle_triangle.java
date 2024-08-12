import java.util.Scanner;

public class Left_angle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
  	//	int num=sc.nextInt();
		int num=5;
		int i,j;
		/*for(i=1;i<=num;i++) {                                        *
			for(j=1;j<=num-i;j++) {                               **
				System.out.print(" ");                       ***
			}                                                   ****
			for(j=1;j<=i;j++) {                                *****
				System.out.print("*");
			}
			System.out.println();
		}*/
	/*	for(i=1;i<=num;i++) {                                           1
			for(j=1;j<=num-i;j++) {                                12
				System.out.print(" ");                        123
			}                                                    1234
			for(j=1;j<=i;j++) {                                 12345 
				System.out.print(j);
			}
			System.out.println();
		} */
		for(i=1;i<=num;i++) {                                            //1
			for(j=1;j<=num-i;j++) {                                 //22
				System.out.print(" ");                         //333
			}                                                     //4444
			for(j=1;j<=i;j++) {                                  //55555
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
