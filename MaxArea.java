package the3profe.jse8.algorithms;


public class MaxArea {

//	private int area;
//
//	public static int maxAreaf(int[] height) {
//
//		int max1 = height[0], posMax1 = 0, max2 = height[0], posMax2 = 0, max3 = 0;
//
//		for (int i = 1; i < height.length; i++) {
//			if (max1 < height[i]) {
//				max1 = height[i];
//				posMax1 = i + 1;
//			}
//			if (max2 < height[i]) {
//				if (posMax2 != posMax1) {
//					max2 = height[i];
//					posMax2 = i + 1;
//				}
//			}
//			int min2 = Math.min(max1, max2);
//			max3 = Math.abs((posMax2 - posMax1));
//			int area = min2 * max3;
//
//		}
//		return (area);
//	}
	
	
	
	 public static int maxArea(int A[], int len) 
	    { 
	        int l = 0; 
	        int r = len -1; 
	        int area = 0; 
	      
	        while (l < r) 
	        { 
	            // Calculating the max area 
	            area = Math.max(area,  
	                        Math.min(A[l], A[r]) * (r - l)); 
	                          
	            if (A[l] < A[r]) 
	                l += 1; 
	                  
	            else
	                r -= 1; 
	        } 
	        return area; 
	    } 
	

	public static void main(String[] args) {
		int[] list = {1,8,6,2,5,4,8,3,7};
		int y = maxArea(list, list.length);
		
		System.out.println(y);
	}

}
