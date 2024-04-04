package InterviewQuestions;

public class reverseString {

	public static void main(String[] args) {
		String rev = "";
		String s = "*****";
		int len = s.length();
		for (int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i);
			System.out.println(rev);
		}
		System.out.println("reverse string is :"+ rev);
	}

}
