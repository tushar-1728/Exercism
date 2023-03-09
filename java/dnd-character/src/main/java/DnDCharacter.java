import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    Integer strength;
    Integer dexterity;
    Integer constitution;
    Integer intelligence;
    Integer wisdom;
    Integer charisma;

    DnDCharacter () {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        int sumOfScores = scores.stream().reduce(0, Integer::sum);
        return (sumOfScores - Collections.min(scores));
    }

    List<Integer> rollDice() {
        ArrayList<Integer> diceResults = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 4; i++) {
            diceResults.add(randomGenerator.nextInt(5) + 1);
        }
        return diceResults;
    }

    int modifier(int input) {
        return (int)Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
