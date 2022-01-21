
public class java9 {
    
    public static void main(String[] args) {
        
        for(int i=0;i<8;i++) {
            
            for(int j=0;j<8;j++) {
                
                if(i%2==0) {
                    System.out.print((j+1)%2+" ");
                }else {
                    System.out.print(j%2+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        

        // label in loop
		myloop: // label to the i loop
		for(int i=1; i<=3; i++) {
			System.out.println(">> i is: "+i);
			
			// j loop is externally executed 3 times
			// j loop is internally executed 5 times
			for(int j=1; j<=5; j++) {
				System.out.print(j+"  ");
				
				if(j==3) {
					break myloop; // break the outer loop
				}
				
			}
			System.out.println();
		}
		

	}

}