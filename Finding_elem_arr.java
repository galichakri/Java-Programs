import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class Finding_elem_arr{
	 public static void FindElement(int[] arr,int num) {
		 boolean flag=false;
		 for( int element:arr) {
			 if(element==num) {
				 flag=true;
			 }
		 }
		 if(flag==true) {
			 System.out.println("element found");
		 }
		 else {
			 System.out.println("not found");
		 }
	 }
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		String str=br.readLine();
		int num=Integer.parseInt(str);
		FindElement(arr,num);
	}
}
