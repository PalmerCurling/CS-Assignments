public class StringFormatter {

	public static void main (String[] args) {
		StringFormatter formatter = new StringFormatter();
		String originalPhrase = "qaaaaaaaaapppppbbtAAA";
		String formatedPhrase = null;
		System.out.println( "Original: " + originalPhrase);
		formatedPhrase = formatter.compress( originalPhrase);
		System.out.println( "Compressed: " + formatedPhrase);
		formatedPhrase = formatter.decompress( formatedPhrase);
		System.out.println( "Decompressed: " + formatedPhrase);
		if(originalPhrase.equals( formatedPhrase)){
			System.out.println( "Decompressed phrase is equal to original phrase");
		}
	}

	public String compress( String phrase) {
		if ( !checkPhrase( phrase)) {
			throw new IllegalArgumentException( "ERROR - sting provided is either null or empty");
		}
		return compress( 1, phrase.substring(1), phrase.charAt(0));
	}

	private String compress( int count, String phrase, char checking) {
		String str = "";
		if ( checkPhrase( phrase)) {
			if ( phrase.charAt(0) == checking) {
				return compress( ++count, phrase.substring(1), checking);
			} else {
				str = compress( 1, phrase.substring(1), phrase.charAt(0));
			}
		}
		return ( count==1 ? "": count) + String.valueOf( checking) + str;
	}

	public String decompress( String phrase) {
		if ( !checkPhrase( phrase)) {
			throw new IllegalArgumentException( "ERROR - sting provided is either null or empty");
		}
		return decompress( -2, phrase);
	}

	private String decompress( int count, String phrase) {
		String str = "";
		if ( checkPhrase( phrase)) {
			if( count==-2){
				char first = phrase.charAt( 0);
				if( first>='0' && first<='9'){
					return decompress( first-'0', phrase.substring(1));
				}
				return decompress( 1, phrase);
			}
			if( --count==-1){
				return decompress( -2, phrase.substring(1));
			}
			return phrase.charAt(0) + decompress( count, phrase);
		}
		return str;
	}

	private boolean checkPhrase( String phrase){
		return phrase!=null && phrase.length() != 0;
	}
}
