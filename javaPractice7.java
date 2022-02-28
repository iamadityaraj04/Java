/**
 * Water Trapping Problem
 */
public class javaPractice7 {
    public static int waterTrapped(int arr[]) {

        //prefixMax
        int prefixMax[]=new int[arr.length];
        prefixMax[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(prefixMax[i-1]>arr[i]){
                prefixMax[i]=prefixMax[i-1];
            }else{
                prefixMax[i]=arr[i];
            }
        }
        //sufixMax
        int sufixMax[]=new int[arr.length];
        sufixMax[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if(sufixMax[i+1]>arr[i]){
                sufixMax[i]=sufixMax[i+1];
            }else{
                sufixMax[i]=arr[i];
            }
        }
        int waterTrapped=0;

        for ( int i = 1; i < arr.length-1; i++) {
            int leftTallestPillar=prefixMax[i-1];
            int rightTallestPillar=sufixMax[i+1];
            int decidingHeight=Math.min(leftTallestPillar, rightTallestPillar);
            if(decidingHeight>arr[i]){
                waterTrapped+=(decidingHeight-arr[i]);
            }
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,3,0,2};
        System.out.println(waterTrapped(arr));

    }
}