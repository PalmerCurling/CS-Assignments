public class WordCount{
	public static void main(String[] args){

		String s = IO.readString();
		int x = IO.readInt();
		int l = 0;
		int count = 0;

		for(int i = 0; i < s.length(); i++){
			if(i == s.length() - 1 && Character.isLetter(s.charAt(i))){
				l++;
				if(l >= x){
					count++;
					l = 0;
				}
			}
			if(s.charAt(i) == ' '){
				if(l >= x){
					count++;
					l = 0;
				}else{
					l = 0;
				}
			}
			if(Character.isLetter(s.charAt(i))){
				l++;
			}
		}
		IO.outputIntAnswer(count);
	}
}
