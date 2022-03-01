/*You are given an integer array arr of length n that represents a permutation of the integers in the range [0, n - 1].
We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.
Return the largest number of chunks we can make to sort the array.
*/

public class javaPractice8 {
    public static int maxChunksToSorted(int[] arr) {
        
        //prefixMax
        int prefixMax[]=new int[arr.length];
        prefixMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>prefixMax[i-1]) {
                prefixMax[i]=arr[i];
            }else{
                prefixMax[i]=prefixMax[i-1];
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(prefixMax[i]==i){
                count++;
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,4};
        int maxChunksToSorted=maxChunksToSorted(arr);
        System.out.println(maxChunksToSorted); 
    }
}
