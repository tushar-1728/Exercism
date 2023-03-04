import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder rStringBuilder = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            int codePoint = identifier.codePointAt(i);
            if (codePoint == ' ') {
                rStringBuilder.append('_');
            } else if (Character.isISOControl(codePoint)) {
                rStringBuilder.append("CTRL");
            } else if (codePoint == '-' && Character.isLetter(identifier.charAt(i + 1))) {
                rStringBuilder.append(Character.toUpperCase(identifier.charAt(i + 1)));
                i += 1;
            } else if ((codePoint >= 'α' && codePoint <= 'ω') || !Character.isLetter(codePoint)) {
                // do Nothing
            } else {
                rStringBuilder.append((char)codePoint);
            }
        }
        return rStringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Character.isLetter('1'));
    }
}
