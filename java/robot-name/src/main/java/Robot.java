import java.util.Random;

public class Robot {
    private String name;

    public Robot() {
        this.reset();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        StringBuilder sBuilder = new StringBuilder();

        Random randomGenerator = new Random();
        for (int i = 0; i < 2; i++) {
            sBuilder.append((char) (randomGenerator.nextInt(26) + 65));
        }
        for (int i = 0; i < 3; i++) {
            sBuilder.append(randomGenerator.nextInt(10));
        }

        this.name = sBuilder.toString();
    }
}