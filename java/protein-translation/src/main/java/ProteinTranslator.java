import java.util.List;
import java.util.Hashtable;
import java.util.ArrayList;

class ProteinTranslator {
	Hashtable mapping = new Hashtable<String, String>();
	ProteinTranslator() {
		mapping.put("AUG", "Methionine");
		mapping.put("UUU", "Phenylalanine");
		mapping.put("UUC", "Phenylalanine");
		mapping.put("UUA", "Leucine");
		mapping.put("UUG", "Leucine");
		mapping.put("UCU", "Serine");
		mapping.put("UCC", "Serine");
		mapping.put("UCA", "Serine");
		mapping.put("UCG", "Serine");
		mapping.put("UAU", "Tyrosine");
		mapping.put("UAC", "Tyrosine");
		mapping.put("UGG", "Tryptophan");
		mapping.put("UGU", "Cysteine");
		mapping.put("UGC", "Cysteine");
		mapping.put("UAA", "STOP");
		mapping.put("UAG", "STOP");
		mapping.put("UGA", "STOP");

	}

	List<String> translate(String rnaSequence) {
		List<String> codonSequence = new ArrayList<String>();
      for (int i = 0; i < rnaSequence.length(); i += 3) {
	    	String temp = rnaSequence.substring(i, i + 3);
				String codon = mapping.get(temp).toString();
				if (codon.equals("STOP")) {
					break;
				}
				codonSequence.add(codon);
			}
		return codonSequence;
	}
}
