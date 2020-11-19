import java.io.*; 
import java.util.*; 
  
public class Path {
	public static  final int SIZE = 100;
	private int []total;
	private int n;
	private int size = 0;
	private int index = 0;
	private ArrayList<Integer> list;
	 private int A[][] ;
	public Path() {
		list = new ArrayList<>();
		
		size = 0;
		index = 0;
	}

                 

    public int minSumPath() 
    { 

        for (int i = 0;   i < A[n].length; i++)  
            total[i] = A[n][i]; 
      
        
        for (int i = A.length - 2;  i >= 0; i--) { 
            for (int j = 0;  j < A[i].length; j++)  {
            	 
            	total[j] = A[i][j] + (int)Math.min(total[j], total[j + 1]); 
            }
        }        
      

        return total[0]; 
    } 
      
    public void fillIntegerPath() {
    	int j = 0;
    	for( j = 0; j < list.size(); j++) {   
    		//System.out.println(list.get(j));
    	}
    	
       	 j = 0;
        //for(int j = 0; j < list.size(); j++) {   
         while(j != list.size()) {
    		for(int i = 0;  i < index + 1; i++) {
            	
            	A[size][i] = list.get(j);
            	j++;
            	 
            }
            	
            size++;
            index++;
        }     

        for (int i = 0;  i < A.length; i++) { 
            for ( j = 0;  j < A[i].length; j++) {
            	System.out.printf(A[i][j] +" ");
            }
            System.out.println();
        }    
        
        
        
            	
    }
   public  boolean readIntegerTerminal() {
	   Scanner s = new Scanner(System.in);
       while (s.hasNextInt()) {
    	   //System.out.printf("> ");
    	   int temp = s.nextInt();
         //  System.out.println(temp);
           
           list.add(temp);
       }
       if(list.size() % 2 == 0 ) {
    	   System.out.println("Triangle Input Error");
    	   return false;
       }
       A = new int[list.size()][list.size()];  
        total = new int[list.size()*list.size()]; 
	//	System.out.println("asdsad" + A.length);
		n = list.size() - 1; 
		for (int row = 0; row < A.length; row++)
        {
        	for (int col = 0; col < A[row].length; col++)
            {
            	A[row][col] = 0; 
            }
        }
		return true;
   }
  
} 
