public class PigLatin{
	public static void main(String[] args){
		String s = IO.readString();
		char c = s.charAt(0);

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			IO.outputStringAnswer(s.concat("way"));

		}else{
			int x = s.length();
			String p = s.substring(1, x);
			IO.outputStringAnswer(p+c+"ay");

		}
	}
}
