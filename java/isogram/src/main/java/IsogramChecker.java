class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll(" ", "").replaceAll("-", "").toLowerCase();
        Long charCount = phrase.chars().count();
        Long distinctCharCount = phrase.chars().distinct().count();
        
        return (charCount == distinctCharCount);
    }
}