class Scrabble {
    private int score = 0;

    Scrabble(String word) {
        int i = 0;
        String wordInLowercase = word.toLowerCase();
        while (i < wordInLowercase.length()) {
            char ch = wordInLowercase.charAt(i);
            switch(ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'l':
                case 'n':
                case 'r':
                case 's':
                case 't':
                    score += 1;
                    break;
                case 'd':
                case 'g':
                    score += 2;
                    break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    score += 3;
                    break;
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    score += 4;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'j':
                case 'x':
                    score += 8;
                    break;
                case 'q':
                case 'z':
                    score += 10;
                    break;                
            }
            i++;
        }
    }

    int getScore() {
        return score;
    }

}
