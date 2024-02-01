package test.com;

public class PyramidLoop {
	void pym(int n) {
	

for (int i = 1; i <= n; i++) {
        
        for (int j = 1; j <=n- i ; j++) {
            System.out.print(" ");
        }
      
        for (int j = 1; j <= i ; j++){
            System.out.print("*"+" ");
        }
        
       // if (i == 3){
            //System.out.print("");
      //  }
        
        System.out.println();
 
}
	}}
