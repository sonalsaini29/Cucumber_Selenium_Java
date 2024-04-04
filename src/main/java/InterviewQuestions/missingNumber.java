package InterviewQuestions;

public class missingNumber {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,7};
		int sum =0;
		
		//add number of list in array
		for(int i=0;i<num.length;i++) {
			sum =sum+num[i];
		}
		System.out.println("sum of array list:"+sum);
		
		//add all the numbers of the SEQUENCE list provided		
		int sum1=0;
		for(int j=1;j<=7;j++) {
			sum1=sum1+j;
		}
		System.out.println("Sum of consecutive array list:"+sum1);
		
		System.out.println("the missing number is :"+ (sum1-sum));
	
	}
	

}
