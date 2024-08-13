import java.util.Scanner;

public class Bubble_Sort_1D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements do you want to insert:");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the elements into the array:");
		for(int k=0;k<num;k++) {
			arr[k]=sc.nextInt();
		}
		int i,j,curr;
		for(i=1;i<num;i++) {
			 curr=arr[i];
			 j=i-1;
			 while(j>=0 && arr[j]>curr) {
				 arr[j+1]=arr[j];
				 j--;
			 }
			 arr[j+1]=curr;
		}
		for(i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
