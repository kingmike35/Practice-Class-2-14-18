
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2;
int b=3;
int c= addNumbers(a,b);
System.out.println("The sum is " +c);
int r= addNumbers(3,18);
System.out.println("The sum is"+r);
System.out.println("The sum is"+ addNumbers(6,21));

	}
	
	public static int addNumbers (int num1, int num2){
		int sum= num1+num2;
		return sum;
		
		
	}

}
