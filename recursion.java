class recursion{
    public static void sum(int i, int j, int sum) {
        if(i==j){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1, j,sum);
    }
    public static void main(String[] args) {
        sum(1, 5,0);
    }
}