public class StringRec{

	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String decompress(String compressedText){

		if(compressedText.equals("")){
			return compressedText;
		}else{
			char first = compressedText.charAt(0);
			if(first >= '0' && first <= '9'){
				
				System.out.println("");
				return decompress(compressedText);
			}

		}
	}
}
