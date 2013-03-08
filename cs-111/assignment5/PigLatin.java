public class PigLatin{
	public static void main(String[] args){
		String s = IO.readString();
		String q = s.toLowerCase();
		char c = q.charAt(0);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				IO.outputStringAnswer(q.concat("way"));

		}else{
			int x = q.length();
			String p = q.substring(1, x);
			IO.outputStringAnswer(p+c+"ay");

		}
	}
}
