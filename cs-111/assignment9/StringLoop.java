public class StringLoop{
	public static String decompress(String compressedText){
		int x = 1;
		String decompressedText = "";
		for(int i = 0; i < compressedText.length(); i++){
			char current = compressedText.charAt(i);
			if(Character.isDigit(current)){
				x = current;
			}else{
				for(int j = 0; j < x; j++){
					System.out.print(current);
					decompressedText = decompressedText + current;
				}
				x = 1;
			}
		}
		return decompressedText;
	}
}
