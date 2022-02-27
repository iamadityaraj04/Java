//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
class javaPractice6 {
    public static int[] productExceptSelf(int[] nums) {
        int prefix[]= new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        
        int sufix[]= new int[nums.length];
        sufix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]*nums[i];
        }
        for(int i=0; i<nums.length;i++){
            if(i==0){
                nums[i]=sufix[i+1];
            }
            else if(i==nums.length-1){
                nums[i]=prefix[i-1];
            }
            else{
                nums[i]=prefix[i-1]*sufix[i+1];
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int result[]=productExceptSelf(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }       
    }
}