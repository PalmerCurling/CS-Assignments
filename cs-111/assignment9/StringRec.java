public class StringRec{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String decompress(String compressedText){
		System.out.println("The function is being called on: "+compressedText+"\n\n");
		char first = compressedText.charAt(0);
		char letter = compressedText.charAt(1);
		String noNumber = compressedText.substring(1);
		String working = compressedText.substring(2);

		if(compressedText.length() == 1){
			return compressedText;
		}

		if(compressedText.length() == 2 && first == '0'){
			return"";
		}

		if(Character.isDigit(first)){
			int number  = Character.digit(first, 10);
			if(number > 0){
				number--;
				String decrement = Integer.toString(number);
				if (compressedText.length() == 2){
					String temp =  decrement + letter;
					return letter + decompress(temp);
				}else{
					return letter + decompress(decrement + letter + working);
				}
			}else{
				return decompress(working);
			}
		}else{
			return (first + decompress(noNumber));
		}
	}
}
