import java.time.LocalDate;

public class Exercise_2 {
    public static void question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = "Email " + i;
            account.userName = "User name " + i;
            account.fullName = "Full name " + i;
            account.createDate = LocalDate.now();
            accounts[i] = account;
            System.out.println("Thông tin Account " + i + " Email: " +
                    accounts[i].email +
                    " UserName: " + accounts[i].userName +
                    " FullName: " + accounts[i].fullName +
                    " CreateDate: " + accounts[i].createDate);

        }
    }
}
