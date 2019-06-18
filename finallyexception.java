import java.io.*;
class FinallyException {
	public static void main(String args[]){
		try{
			InputStream f1=null;
			int size=f1.available();
			for(int i=0;i<size;i++)
		{
			System.out.print((char)f1.read());
					}
		}catch (IOException e) {}
		catch (NullPointerException n){
			System.out.println("exceptionn generated:"+n);

		}
		finally{
			System.out.println("========");
			System.out.println("inside finally");
			System.out.println("i always have the final");
			System.out.println("========");

		}
	}
}