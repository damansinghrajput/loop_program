package test.com;

public class CalculatorPro {
     void cal(int num1,char ch,int num2) {
    	 if(ch=='+'){
    		 System.out.print("SUM OF ADD : "+" "+num1+" "+"ADD "+num2+" IS EQUALS ");
    		 System.out.println( num1 +num2);
    	 }
    	 
    	 else if(ch=='-'){
    		 System.out.print("Sum OF SUB :"+" "+num1+" "+"SUB "+num2+" IS EQUALS ");
    		 System.out.println( num1 - num2);
    	 }
    	 
    	 else if(ch=='*'){
    		 System.out.print("SUM OF MULTIPLE : "+" "+num1+" "+" MULTIPLE "+num2+" IS EQUALS ");
    		 System.out.println( num1 * num2);
    	 }
    	 
    	 else if(ch=='/'){
    		 System.out.print("SUM OF DIVIDE : "+" "+num1+" "+"DIVIDE "+num2+" IS EQUALS ");
    		 System.out.println( num1 /num2);
    	 }
    	 
    	 else {
    		 System.out.println("invalid opertor"); 
    	 }
    	 
    		 
    	 
    	 
     }
}
