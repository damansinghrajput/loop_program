package test.com;

public class IfElseLoop {
	
void print1(int n) {
		
		
		for ( int i = 0; i <= n; i++) {
		        
		        for ( int j = 0; j <= n; j++) {
		            
		            if (   j==3 && i==0 || j==2 && i==1 || j==4 && i==1 || j==1 && i== 2 ||  j==3 && i== 2 || j==5 && i== 2  ) {
		                System.out.print("*");
		            }
		            
		            else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }

		}

	
	
}
