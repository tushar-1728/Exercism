import java.lang.Math;

class Robot{
	static Integer initNumber = 100;
	static Integer firstString = 0;
	static Integer secondString = 0;

    String name;

    public Robot() {
        this.reset();
    }

    String getName() {
        return name;
    }

    void reset() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append((char) (firstString + 65));
		sBuilder.append((char) (secondString++ + 65));

        sBuilder.append(initNumber);

        this.name = sBuilder.toString();

		if (secondString > 25) {
			secondString = 0;
			firstString++;
		}

		if (firstString > 25) {
			secondString = 0;
	                firstString = 0;
			initNumber++;
        }
    }
}
