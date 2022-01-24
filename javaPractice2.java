import java.util.Scanner;

public class javaPractice2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char whiteSquare = '\u25A1';
		char blackSquare = '\u25A0';
		char square;
		
		char queen = '\u2655';
		
		for(int k=0; k<1; k++){
			int row=sc.nextInt();
			int col=sc.nextInt();

			
			for(int i=1;i<=8;i++) {
				
				for(int j=1;j<=8;j++) {
					
					if(i%2==0) {
						if(i==row && j==col){
							square = queen;
							System.out.print(square+" ");		
						}
						else{
							square = (j+1)%2==0 ? blackSquare : whiteSquare;
							System.out.print(square+" ");		
						}
					}else {
						if(i==row && j==col){
							square = queen;
							System.out.print(square+" ");		
						}
						else{
							square = j%2==0 ? blackSquare : whiteSquare;
							System.out.print(square+" ");
						}
					}
				}
				
				System.out.println();
			}
			sc.close();
		}
			

    }
}
