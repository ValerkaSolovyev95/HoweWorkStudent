import BankClient.Accounts;
import BankClient.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Struct;

public class UserTest {
    @Test
    public void isBankruptTest(){
        Accounts accountsPetya = new Accounts(Accounts.generateBalance());
        User petya = new User(235645, "2415 784678");
        petya.setAccounts(accountsPetya);
        User.checkStatusUser(petya);
        Assert.assertEquals(petya.isBankrupt(), true);
    }

}
