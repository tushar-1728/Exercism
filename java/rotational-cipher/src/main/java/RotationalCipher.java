class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey % 26;
    }

    String rotate(String data) {
        String info = "";
        for (int i = 0; i < data.length(); i++) {
            char letter = data.charAt(i);
            if (Character.isLetter(letter)) {
                if (Character.isLowerCase(letter)) {
                    letter = (char) (letter - 97);
                    info += (char) (97 + ((letter + shiftKey) % 26));
                } else {
                    letter = (char) (letter - 65);
                    info += (char) (65 + ((letter + shiftKey) % 26));
                }
            } else {
                info += letter;
            }
        }
        return info;
    }

    public static void main(String[] args) {
        RotationalCipher rotationalCipher = new RotationalCipher(0);
        System.out.println(rotationalCipher.rotate("a"));
    }
}
