class NegTest{
	public static void main(String args[])
	{
		try{
			int arr[]=new int[-2];
			System.out.println("first elemnet :"+arr[0]);
		}
		catch(NegativeArraySizeException n){
			System.out.println("generated exception is:" +n);

		}
	System.out.println("after try block");
	}
}