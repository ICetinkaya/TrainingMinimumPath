import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

	 Path path = new Path() ;
	 

    
    if(!path.readIntegerTerminal())	
    	System.exit(1);
    else {
    	 path.fillIntegerPath();
    }
    System.out.printf("Minimal sum path total : ");
    System.out.println(path.minSumPath());
    // System.out.println(path.minSumPath());
     
		    
	}

}
