
public class L9_E1 {

	public static void main(String[] args) {
		
		String str = "Helo world, welcome!".replace('e', 'A');
		System.out.println(str);

		str = "Helo world, welcome!".replaceFirst("e", "AB");
		System.out.println(str);
		
		str = "Helo world, welcome!".replaceAll("e", "AB");
		System.out.println(str);
		
		String[] tokens = "JAVA#HTML#PERL".split("#");
		
		for(int i = 0; i < tokens.length; i++){
			System.out.println(tokens[i]);
		}
		

		String[] langs = "Java,C?C#,C++".split("[.,:;?]");
		for(int i = 0; i < langs.length; i++){
			System.out.println(langs[i]);
		}

		StringBuilder sb = new StringBuilder();
		
		sb.append("This");
		sb.append(" ");
		sb.append("a");
		sb.append(" ");
		sb.append("string");
		sb.append(" ");
		sb.append("builder.");
		
		System.out.println(sb.toString());
		System.out.println(sb.reverse().toString());
		
		String[] words = new String[]{
				"This","is","a","sentence"
		};
		
		System.out.println(makeSentence(words, "."));
		
	}

	
	public static String makeSentence(String[] words, String punct){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < words.length; i++){
			sb.append(words[i]);
			if(i != (words.length - 1)){
				sb.append(" ");
			}
		}
		
		sb.append(punct);
		
		return sb.toString();
	}
	
	
}
