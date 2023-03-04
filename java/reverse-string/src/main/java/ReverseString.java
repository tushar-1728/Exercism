class ReverseString {

    String reverse(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = inputString.length();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(inputString.charAt(len - i - 1));
        }
        return stringBuilder.toString();
    }
  
}
