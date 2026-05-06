package com.vti.backend;


import com.vti.entity.*;

import java.time.LocalDate;

public class Program1 {

    public static void department() {
        Department department1 = new Department("dep1", 1);
        Department department2 = new Department("dep2", 2);
        Department department3 = new Department("dep3", 3);
    }
    public  static void position() {
        Position position = new Position(1, Position.PositionName.PM);
        Position position1 = new Position(2, Position.PositionName.DEV);
        Position position2 = new Position(3, Position.PositionName.TEST);
        Position position3 = new Position(4, Position.PositionName.SCRUM_MASTER);

    }

    public static void account() {
        Account account = new Account(1, "thinh", "phamvanthinh",new
                Department("dep1",1),new Position(1, Position.PositionName.PM)
                ,LocalDate.now());

    }

    public static void group() {
        Group group = new Group(1,"HLE",1,LocalDate.now());

    }

    public static void groupAccount() {
        GroupAccount groupAccount = new GroupAccount(new Group(1,
                "T1", 1, LocalDate.now()),new Account(1,"thinh","pham van thinh"
                ,new Department("dep1",1)
                ,new Position(1, Position.PositionName.PM)
                ,LocalDate.now()), LocalDate.now());

    }












}