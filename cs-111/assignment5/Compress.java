public class Compress{
	public static void main(String[] args){
		String s = IO.readString();
		String c = "";
		int count = 1;
		for(int i = 0; i < s.length(); i++){
			if(i+1 == s.length()){
				if(count == 1){
					c = c + s.charAt(i);
				}else{
					c = c + count + s.charAt(i);
					count = 1;
				}
				break;
			}
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}else{
				if(count == 1){
					c = c + s.charAt(i);
				}else{
					c = c + count + s.charAt(i);
					count = 1;
				}
			}
		}
		IO.outputStringAnswer(c);
	}
}
