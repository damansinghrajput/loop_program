package test.com;

public class FlagRam {
  void flag(int numRows , int numCols) {

	        // Outer loop for the number of rows
	        for (int i = 1; i <= numRows; i++) {
	            // Inner loop for each character in a row
	            for (int j = 1; j <= numCols; j++) {
	                // Check the position to determine the character
	                if (i <= numRows / 3) {
	                    // First stripe (top)
	                    System.out.print("* ");
	                } else if (i <= 2 * numRows / 3) {
	                    // Second stripe (middle)
	                    System.out.print("# ");
	                } else {
	                    // Third stripe (bottom)
	                    System.out.print("@ ");
	                }
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}


