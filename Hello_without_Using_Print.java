import java.io.OutputStreamWriter;

public class Hello_without_Using_Print {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStreamWriter obj=new OutputStreamWriter(System.out);
		obj.write("Hello World");
		obj.flush();
	}

}
