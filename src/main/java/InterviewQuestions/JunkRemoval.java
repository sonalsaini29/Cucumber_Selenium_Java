package InterviewQuestions;

public class JunkRemoval {

	public static void main(String[] args) {
		String s = "fg76596##$%^&&&%&&ddhgrdugvbnvcgfs";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
