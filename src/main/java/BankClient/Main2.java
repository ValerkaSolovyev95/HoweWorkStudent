package BankClient;

import BankClient.Accounts;

public class Main2 {
    public static void main(String[] args) {

        Accounts accountsPetya = new Accounts(Accounts.generateBalance());
        Accounts accountsVanya = new Accounts(Accounts.generateBalance());
        Accounts accountsAlex = new Accounts(Accounts.generateBalance());

        User petya = new User(235645, "2415 784678");
        User vanya = new User(235645, "2415 784678");
        User alex = new User(235645, "2415 784678");

        petya.setAccounts(accountsPetya);
        vanya.setAccounts(accountsVanya);
        alex.setAccounts(accountsAlex);



        User.checkStatusUser(petya);
        User.checkStatusUser(vanya);
        User.checkStatusUser(alex);

        System.out.println(alex.isBankrupt());
        System.out.println(vanya.isBankrupt());
        System.out.println(petya.isBankrupt());





    }
}
