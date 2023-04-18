package BankClient;

import java.util.HashMap;
import java.util.Objects;

public class Accounts {
    private HashMap<String,Integer> accounts;

    public Accounts(HashMap<String, Integer> accounts) {
        this.accounts = accounts;
    }

    public HashMap<String, Integer> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<String, Integer> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts1 = (Accounts) o;
        return Objects.equals(accounts, accounts1.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }
    public static HashMap<String, Integer> generateBalance(){
        HashMap<String, Integer> accountsClient = new HashMap<>();
        accountsClient.put("Debit card", (int) (Math.random() *10000));
        accountsClient.put("Account", (int) (Math.random() *100));
        accountsClient.put("Credit card", (int) (Math.random() *100));
        accountsClient.put("Mortgage", (int) (Math.random() *1000));
        return accountsClient;
    }
}
