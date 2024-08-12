public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int i,j,k;
		/*for(i=1;i<=num;i++) {
			for(j=1;j<=num-i;j++) {                         *
				System.out.print("  ");                     * * *
			}                                           * * * * *
			for(j=1;j<=i;j++) {                       * * * * * * *
				System.out.print("* ");               * * * * * * * * *
				
			}
			for(k=2;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*for(i=0;i<=num;i++) {
			for(j=1;j<=i;j++) {                        * * * * *  
				System.out.print(" ");                    * * * *
			}                                            * * *
			for(j=1;j<=num-i;j++) {                       * *
				System.out.print("* ");                      *
			}
			System.out.println();
		}*/
		/*for(i=1;i<=num;i++) {                          *
			for(j=1;j<=num-i;j++) {                       * *
				System.out.print(" ");                     * * *
			}                                           * * * *
			for(j=1;j<=i;j++) {                        * * * * *
				System.out.print("* ");
			}
			System.out.println();
		}*/
		/*for(i=1;i<=num;i++) {                                 1
			for(j=1;j<=num-i;j++) {                              2 2
				System.out.print(" ");	                          3 3 3
			}                                                  4 4 4 4
			for(j=1;j<=i;j++) {                               5 5 5 5 5
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		/*for(i=1;i<=num;i++) {
			for(j=1;j<=num-i;j++) {                          1
				System.out.print(" ");                        1 2
			}                                              1 2 3
			for(j=1;j<=i;j++) {                           1 2 3 4
				System.out.print(j+" ");                   1 2 3 4 5
			}
			System.out.println();
		}*/
		/*for(i=1;i<=num;i++) {
			for(j=1;j<=num-i;j++) {                         1
				System.out.print(" ");                       121
			}                                             12321
			for(j=1;j<=i;j++) {                          1234321
				System.out.print(j);                      123454321
			}
			for(k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		*/
		//double pyramid
		
		/*for(i=1;i<=num;i++){                          *         *
			for(j=1;j<=num-i;j++) {                      * *       * *
				System.out.print(" ");                    * * *     * * *
			}                                          * * * *   * * * *
			for(j=1;j<=i;j++) {                       * * * * * * * * * *
				System.out.print("* ");
			}
			for(k=1;k<=(num-i)*2;k++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}*/
		for(i=1;i<=num;i++) {
			for(j=2;j<=i;j++) {
				System.out.print(" ");
			}                                             //* * * * *
			for(j=0;j<=num-i;j++) {                       // * * * *
				System.out.print("* ");                     //  * * *
			}                                             //   * *
			System.out.println();                         //    *
		}                                               //   * *
		for(i=1;i<num;i++) {                            //  * * *
			for(j=1;j<num-i;j++) {                        // * * * *
				System.out.print(" ");                      //* * * * *
			}
			for(k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
