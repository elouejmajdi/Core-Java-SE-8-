package the3profe.jse8.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Permute {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        permuteRecursion(results, nums, 0, nums.length - 1);
        
        return results;
    }
    
    public static void permuteRecursion(List<List<Integer>> results, int[] nums, int start, int end) {
        if(start == end) {
            List<Integer> result = new ArrayList<Integer>();
            for (int num : nums) {
                result.add(num);
            }
            results.add(result);
        } else {
            for(int i = start; i <= end; i++) {
                nums = swap(nums, start, i);
                permuteRecursion(results, nums, start + 1, end);
                nums = swap(nums, start, i);
            }
        }
    }
    
    public static int[] swap(int[] nums, int first, int second) {
        int c = nums[first];
        nums[first] = nums[second];
        nums[second] = c;
        
        return nums;
    }
    
    public static void main(String[] args) {
		
    	
    	int[] list = {1,2,3};
    	 List<List<Integer>> results = new ArrayList<List<Integer>>();
    	 results =permute(list); 
    	 for (List<Integer> list2 : results) {
			System.out.println(list2);
		}
	}
	
}
