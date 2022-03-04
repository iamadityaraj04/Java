//binary Searching

import java.util.Scanner;
public class javaPractice11
{
	public static int search(int arr[], int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}else if(arr[mid]<key){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return -1;
	}
    public static void main (String[] args) 
    {
        // your code goes here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
    int testCases=sc.nextInt();
    for(int i=0;i<testCases;i++){
        int key=sc.nextInt();
        
        System.out.println(search(arr,key));
    }
    sc.close();
}
}