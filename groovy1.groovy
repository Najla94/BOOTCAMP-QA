package week6
import java.util.*;

class Demo {
	static void main(args) { // TODO Auto-generated method stub 
		
	int v;
	int f;
	int t;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter first number");
	v = scan.nextInt();
	
	System.out.println("Enter sconde number");
	f = scan.nextInt();
	
	System.out.println("Enter third number");
	t = scan.nextInt();
	
	int comb =   v + f + t ;
	int comb2 =   v - f - t ;
	int comb3 =   v * f* t ;
	int comb4 =  v / f / t ;
	System.out.println( " sum : " +comb);
	System.out.println(" sub : "+comb2);
	System.out.println(" multi : " +comb3);
	System.out.println("dives " +comb4);
//      
	
	}}