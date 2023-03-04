import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> binaryHandshake = new ArrayList<Signal>();
        int count = 0;
        while (number > 0) {
            int temp = number % 2;
            if (temp == 1) {
                switch (count) {
                    case 0:
                        binaryHandshake.add(Signal.WINK);
                        break;
                    case 1:
                        binaryHandshake.add(Signal.DOUBLE_BLINK);
                        break;
                    case 2:
                        binaryHandshake.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 3:
                        binaryHandshake.add(Signal.JUMP);
                        break;
                    case 4:
                        Collections.reverse(binaryHandshake);
                        break;
                }
            }
            number /= 2;
            count += 1;
        }
        return binaryHandshake;
    }

    public static void main(String[] args) {
        HandshakeCalculator test = new HandshakeCalculator();
        System.out.println(test.calculateHandshake(1).contains(Signal.WINK));
    }

}
