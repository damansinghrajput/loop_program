package test.com;

public class MaxMergre {
	void run1( int n) {
		  
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*"+ " ");
			}

			System.out.println();

	  }
		  
		  
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			  
			  
		  
			  
		  
		  System.out.println();
		  
	  }
}
}
