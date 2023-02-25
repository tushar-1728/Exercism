class BankAccount {
    boolean accountClosed;
    int amount;

    BankAccount() {
        this.accountClosed = true;
        this.amount = 0;
    }

    public void open() {
        accountClosed = false;
    }

    public synchronized int getBalance() throws BankAccountActionInvalidException {
        if (!accountClosed) {
            return this.amount;
        }
        throw new BankAccountActionInvalidException("Account closed");
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (this.accountClosed) {
            throw new BankAccountActionInvalidException("Account closed");
        }

        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        this.amount += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (this.accountClosed) {
            throw new BankAccountActionInvalidException("Account closed");
        }

        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }

        if (this.amount == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        }

        if (this.amount < amount) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        this.amount -= amount;
    }

    public void close() {
        this.accountClosed = true;
    }
}
