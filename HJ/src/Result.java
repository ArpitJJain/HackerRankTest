import java.util.regex.Pattern;

public class Result {
	public static void main(String[] args) {
		String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
		//String regex = "[A-Z]*";
		//String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
		System.out.println(regex);
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		System.out.println(p);
		System.out.println("Goodbye bye bye world world world World".replaceAll(p.toString(), ""));
	}
}