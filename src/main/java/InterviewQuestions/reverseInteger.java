package InterviewQuestions;

public class reverseInteger {

	public static void main(String[] args) {
		int num = 12345;
		int revNum = 0;
		
		//using while loop
		while(num!=0) {
			revNum = revNum*10+num%10;
			num=num/10;
		}
		System.out.println("revNum is :"+ revNum);
		
		//using string buffer
		int num1 = 12345;
		StringBuffer sf = new StringBuffer();
		sf.append(String.valueOf(num1));
		System.out.println("rev is :"+sf.reverse());
	
	}

}
