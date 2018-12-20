package the3profe.jse8.algorithms;

public class PlusOne {
	
	
	  public static int[] plusOne(int[] digits) {

	        
	        
	        int[] list = new int[digits.length]; 
	        
	        for(int i =0 ; i<list.length-1; i++ )
	        {
	            list[i] = digits[i];
	        }
	        list[list.length-1]=digits[list.length-1]+1;
	        return list ;  
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {1,2,3};
		int [] list3 = plusOne(list);
		for (int i : list3) {
			System.out.print(" "+i);
		}
		
		
	}

}
