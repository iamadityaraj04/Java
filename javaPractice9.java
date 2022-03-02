//Array Rotation

public class javaPractice9 {
    public static void rotate(int arr[], int k){
        int n=arr.length;
        if(n<k){
            k%=n;
        }
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i +" ");
        } 
    }
    public static int[] reverse(int arr[], int i,int j)
    {
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            reverse(arr,i+1,j-1);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={0,4,2,8};
        int k=9;
        rotate(arr, k);
    }
}