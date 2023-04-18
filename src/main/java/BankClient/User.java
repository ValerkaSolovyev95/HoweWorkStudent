package BankClient;

public class User {
    private long id;
    private String passport;
    private Accounts accounts;

    private boolean isBankrupt = false;

    public User(long id, String passport) {
        this.id = id;
        this.passport = passport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public boolean isBankrupt() {
        return isBankrupt;
    }

    public void setBankrupt(boolean bankrupt) {
        isBankrupt = bankrupt;
    }


    public static User checkStatusUser(User user){
        int sumBalanceDebitAccounts;
        int sumBalanceCreditAccounts;
        Accounts accounts1 = user.getAccounts();
        sumBalanceDebitAccounts = accounts1.getAccounts().get("Debit card") + accounts1.getAccounts().get("Account");
        sumBalanceCreditAccounts = accounts1.getAccounts().get("Credit card") + accounts1.getAccounts().get("Mortgage");
        if((double)(sumBalanceDebitAccounts - sumBalanceCreditAccounts) % sumBalanceDebitAccounts >= 2.5){
            user.setBankrupt(true);
        }
        return user;


    }


}
