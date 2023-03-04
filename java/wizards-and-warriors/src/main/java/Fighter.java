abstract class Fighter {

    boolean isVulnerable() {
        throw new UnsupportedOperationException("Please provide implementation for this method");
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) {
            return 10;
        }
        return 6;
    }

    @Override
    boolean isVulnerable() {
        return false;
    }
}

class Wizard extends Fighter {

    private boolean isPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !isPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (isPrepared) {
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        isPrepared = true;
    }

}
