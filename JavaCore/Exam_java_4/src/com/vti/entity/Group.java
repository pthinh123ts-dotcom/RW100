package com.vti.entity;

import java.time.LocalDate;


public class Group {
    private int id;
    private  String groupname;
    private  int creatorid;
    private  LocalDate createdate;

    public Group(int id, String groupname, int creatorid, LocalDate createdate) {
        this.id = id;
        this.groupname = groupname;
        this.creatorid = creatorid;
        this.createdate = createdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }

    public LocalDate getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDate createdate) {
        this.createdate = createdate;
    }
}
