package juneChallange.day6;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
amangupta
*/
public class Day6 {
	public static void main(String[] args) {
		Solution S=new Solution();
		int result[][]=S.reconstructQueue(new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}});
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int result[][]=new int[people.length][2];
        quickSort(people, 0, people.length-1);
        for(int i=0;i<people.length;i++) {
        	if(!Arrays.equals(result[people[i][1]], new int[] {0,0}))
        		move(result, people[i][1]);
        	result[people[i][1]]=people[i];
        }
        return result;
    }
    public void move(int[][]arr,int k) {
    	int i=k;
    	for(;i<arr.length && !Arrays.equals(arr[i], new int[] {0,0});i++);
    	for(;i>k;i--) {
    		arr[i]=arr[i-1];
    	}
    }
    public int[][] quickSort(int [][] people,int left,int right) {
    	if(left<right) {
    		int pivot=getPivot(people, left,right);
    		quickSort(people, left, pivot-1);
    		quickSort(people, pivot+1, right);
    	}
    	return people;
    }
    
    public int getPivot(int arr[][],int left,int right) {
    	int [] pivot=arr[right];
    	int i=left-1;
    	for(int j=left;j<right;j++) {
    		if(arr[j][0]>pivot[0]) {
    			i++;
    			int temp[]=arr[j];
    			arr[j]=arr[i];
    			arr[i]=temp;
    		}else if(arr[j][0]==pivot[0]) {
    			if(arr[j][1]<pivot[1]) {
    				i++;
    				int temp[]=arr[j];
        			arr[j]=arr[i];
        			arr[i]=temp;
    			}
    		}
    	}
    	int temp[]=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		return i+1;
    }
}
