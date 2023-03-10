import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Grains {

    private List<BigInteger> grainCount;
    private BigInteger grainSum;

    Grains() {
        grainCount = new ArrayList<>();
        grainCount.add(BigInteger.ONE);
        grainCount.add(BigInteger.TWO);
        for (int i = 2; i < 64; i++) {
            grainCount.add(grainCount.get(i-1).multiply(BigInteger.TWO));
        }
        grainSum = grainCount.stream().reduce(BigInteger.ZERO, (t, u) -> t.add(u));
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return grainCount.get(square - 1);
    }

    BigInteger grainsOnBoard() {
        return grainSum;
    }

}
