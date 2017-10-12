package Demo;
//package is Demo
import java.util.Scanner;
class Prime implements Runnable  {

	public void run()
	//target, the run() method is invoked on that runnable
		
		/*here we create run method which will execute when thread is
		 * Called
		 */
			{
			//system is final class
			//out is a static member of system class and type printStream
			//println is method of printStream class.ln means nextline
				
				System.out.println("Enter any number:");
				//system : system is a class in java language.lang package
			  	//out : out is the static member of system class.It's type PrintStream
			  	//println: which is used to print the output.

				//here scanner creates new object to take the input values
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int number=sc.nextInt();
				boolean isPrime=true;/*here we are using boolean when isPrime is true*/
	//A we are usimg prime number it will start from 2 and it will see the prime number condition			
				for(int orderNumber=2;orderNumber<number/2;orderNumber++){
				 if(number%orderNumber==0)
	/*here using for loop checking whether the given number is prime or not is factor of one and itself
	 * if a number is divided by 2 give the output as 0 is not prime*/			 
				 {
					 isPrime=false;//then it prints the isPrime as false
					 break;//here it breaks the condition
				 }
			}
			if(isPrime)//here we are checking whether the number is prime or not with if and else
			{
				
				System.out.println(number+"is a prime number");
				//system : system is a class in java language.lang package
			  	//out : out is the static member of system class.It's type PrintStream
			  	//println: which is used to print the output.

			}
			else
			{
				
				System.out.println(number+"is not a prime number");
				//system : system is a class in java language.lang package
			  	//out : out is the static member of system class.It's type PrintStream
			  	//println: which is used to print the output.

			}
		}
		}
	
public class Threaddemo {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Prime prime=new Prime();//creation of an object
		Thread t=new Thread(prime);//creates the thread which starts runnable method
		
		t.start();//thread get started

	}

}
