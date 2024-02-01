package test.com;

public class EPint {
	void print(int n) {
		
		
		for ( int i = 0; i < n; i++) {
		        
		        for ( int j = 0; j < n; j++) {
		            
		            if ( j==0||i==0 ||i==4|| i==2 ) {
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
