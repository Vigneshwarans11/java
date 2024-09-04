import java.util.*; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int sum=0;
	    if(inputNumber>0){
	        while(inputNumber!=0){
	            int rem = inputNumber%10;
	            if(rem%2==0){
	                sum +=rem;
	            }
	            inputNumber/=10;
	        }
	    }
	   System.out.println(sum); 
	}
}
