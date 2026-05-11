package entity;

import java.time.LocalDate;

public class Account {

    private int accountid;
    private String email;
    private String userName;
    private String fullName;
    private int department;
    private int position;
    private LocalDate localDate;

    public Account() {

    }

    public Account(int accountid, String email, String userName, String fullName, int department, int position ) {
        this.accountid = accountid;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.localDate = localDate;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", localDate=" + localDate +
                '}';
    }
}
