import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

class DiamondPrinter {

    List<String> printToList(char a) {
		List<String> stringList = new ArrayList<String>();
		for(int i = 65; i <= a; i++) {
			stringList.add(getRow(a - i, (char)i));
		}
		for(int i = a - 1; i >= 65; i--) {
            stringList.add(getRow(a - i, (char)i));
        }
		return stringList;
    }

    String getRow(int spaceCount, char ch) {
		int flag = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < spaceCount; i++) {
		    sb.append(' ');
		}
		sb.append(ch);
		for(int i = ch; i > 65; i--) {
			sb.append(' ');
			flag = 1;
			if((i - 65) > 1) {
				sb.append(' ');
			}
		}
		if (flag == 1) {
			sb.append(ch);
		}
		for(int i = 0; i < spaceCount; i++) {
	    	sb.append(' ');
		}
		return sb.toString();
	}

}
