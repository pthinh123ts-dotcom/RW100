package com.vti.entity;

public class Position {
  private   int positionid;
  private PositionName positionname;

    public enum PositionName {
        DEV , TEST , SCRUM_MASTER , PM
    }

    public Position(int positionid, PositionName positionname) {
        this.positionid = positionid;
        this.positionname = positionname;
    }

    public int getPositionid() {
        return positionid;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public PositionName getPositionname() {
        return positionname;
    }

    public void setPositionname(PositionName positionname) {
        this.positionname = positionname;
    }
}
