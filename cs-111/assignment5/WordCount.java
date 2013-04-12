public class WordCount{
	public static void main(String[] args){

		String s = IO.readString();
		int x = IO.readInt();
		int l = 0;
		int count = 0;

		for(int i = 0; i < s.length(); i++){
			if(Character.isLetter(s.charAt(i))){
				l++;
			}
			if(s.charAt(i) == ' ' || i+1 == s.length()){
				if(l >= x){
					count++;
				}
				l = 0;
			}
		}
		IO.outputIntAnswer(count);
	}
}
