package com.vti.entity;


import java.time.LocalDate;

public class GroupAccount {
   private Group groupid;
    private Account accountid;
    private LocalDate localdate;

    public GroupAccount(Group groupid, Account accountid, LocalDate localdate) {
        this.groupid = groupid;
        this.accountid = accountid;
        this.localdate = localdate;
    }

    public Group getGroupid() {
        return groupid;
    }

    public void setGroupid(Group groupid) {
        this.groupid = groupid;
    }

    public Account getAccountid() {
        return accountid;
    }

    public void setAccountid(Account accountid) {
        this.accountid = accountid;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }
}
