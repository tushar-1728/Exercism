import java.lang.String;

public class PigLatinTranslator {

	public String translate(String inputString) {
		String vovels = "aeiou";
		String consonants = "qwrtypsdfghjklzxcvbnm";
		String output = "";
		String[] words = inputString.split(" ");
		for (String input: words) {
			String firstCharacter = String.valueOf(input.charAt(0));
			String firstTwoCharacters = String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(1));
			String secondTwoCharacters = input.length() > 2 ? String.valueOf(input.charAt(1)) + String.valueOf(input.charAt(2)) : "";
			if (vovels.contains(firstCharacter) || firstTwoCharacters.contentEquals("xr") || firstTwoCharacters.contentEquals("yt")) {
				output += input + "ay";
			} else if (consonants.contains(firstCharacter)) {
				if (firstCharacter.contentEquals("t") && secondTwoCharacters.contentEquals("hr")) {
	                 output += input.substring(3) + firstCharacter + secondTwoCharacters + "ay";
	            } else if (firstTwoCharacters.contentEquals("th")) {
					output += input.substring(2) + firstTwoCharacters + "ay";
				} else if (firstTwoCharacters.contentEquals("qu")) {
	                 output += input.substring(2) + firstTwoCharacters + "ay";
	            } else if (secondTwoCharacters.contentEquals("qu")) {
					output += input.substring(3) + firstCharacter + secondTwoCharacters + "ay";
				} else if (firstTwoCharacters.contentEquals("ch")) {
					output += input.substring(2).concat(firstTwoCharacters).concat("ay");
	        	} else if (secondTwoCharacters.contentEquals("ch")) {
					output += input.substring(3) + firstCharacter + secondTwoCharacters + "ay";
				} else if (firstTwoCharacters.contentEquals("rh")) {
					output += input.substring(2).concat(firstTwoCharacters).concat("ay");
				} else {
	  				output += input.substring(1) + firstCharacter + "ay";
				}
			}
			output += " ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
		String input = "chair";
		PigLatinTranslator test = new PigLatinTranslator();
		System.out.println(test.translate(input));
	}
}
