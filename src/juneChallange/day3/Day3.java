package juneChallange.day3;

/**There are 2N people a company is planning to interview. 
 * The cost of flying the i-th person to city A is costs[i][0], 
 * and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * 
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation: 
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 * 
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
*/

/**
amangupta
*/
public class Day3 {
	public static void main(String[] args) {
		int [][]costs=new int[][] {{10,20},{30,200},{400,50},{30,20}};
		Solution s=new Solution();
		System.out.println(s.twoCitySchedCost(costs));
	}
}

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum=0;
        int n=costs.length/2;
        quickSort(costs, 0, costs.length-1);
        
        for(int i=0;i<n;i++) {
        	sum=sum+costs[i][0]+costs[i+n][1];
        }
        return sum;
    }
    
    public void quickSort(int [][]arr, int left, int right) {
    		if(left<right) {
    			int pivot=pivot(arr, left, right);
    			quickSort(arr, left, pivot-1);
    			quickSort(arr, pivot+1, right);
    		}
    }
    public int pivot(int [][]arr, int left, int right) {
    	int pivot=arr[right][0]-arr[right][1];
    	int i=left-1;
    	for(int j=left;j<right;j++) {
    		if(arr[j][0]-arr[j][1]<pivot) {
    			i++;
    			int []temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
		int []temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
    	
    	return i+1;
    }
}
