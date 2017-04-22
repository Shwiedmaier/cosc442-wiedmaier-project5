
public class JamesBond {
	public static Boolean bondRegex(String input) {
		return input.matches((".*[(].*007.*[)].*"));
	}
}
