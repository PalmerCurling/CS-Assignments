public class Compress{
	public static void main(String[] args){
		String s = IO.readString();
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}else{
				if(count == 1){
					System.out.print(s.charAt(i));
					count = 0;
				}else{
					System.out.print(count+s.charAt(i));
					count = 0;
				}
			}
		}
	}
}
