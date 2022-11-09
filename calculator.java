import java.util.*;
import java.util.scanner;
class Calculator {
	public static void main(String[] args){
		int n1,n2;
		double result;
		char ch;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter first number : ");
		n1=Sc.nextInt();
		System.out.println("Enter second number : ");
		n2=Sc.nextInt();
		System.out.println("Enter any operator from(+,-,* or /) :");
		ch=Sc.next().charAt(0);
		Switch(ch){
			case '+' :
			        result=n1+n2;
					System.out.println(n1+"+"+n2"="+result);
					break;
					
			case '-' :
			         result=n1-n2;
					 System.out.println(n1+"-"+n2"="+result);
					 break;
			case '*' : 
                    result=n1*n2;
                    System.out.println(n1+"*"+n2"="+result);
                    break;
            case '/' :
			        result=n1/n2;
					System.out.println(n1+"/"+n2"="+result);
					break;
			default:
			       System.out,println("Invalid operator");
				   break;
				   
			
		}        			
	}	
}	