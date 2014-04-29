public class Main{
	public static void main(String[] args){
		String compressedText = IO.readString();
		String decompressedText = StringRec.decompress(compressedText);
		System.out.println(decompressedText);
		
	}
}
