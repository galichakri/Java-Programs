import java.io.*;
public class String_Triangle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		String str=Br.readLine();
		try {
		int i,j,k;
		int length=str.length();
		for(i=1;i<=length;i++) {
			for(j=0;j<length-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
		}catch(Exception e) {
			System.out.println();
		}
	}

}
