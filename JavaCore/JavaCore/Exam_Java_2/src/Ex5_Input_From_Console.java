import java.lang.classfile.instruction.SwitchCase;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Ex5_Input_From_Console {
    public static void question1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời bạn nhập 3 số nguyên : ");
        int a = scanner.nextInt();
        System.out.println("Số đầu tiên là : " + a);
        int b = scanner.nextInt();
        System.out.println("Số thứ 2  là : " + b);
        int c = scanner.nextInt();
        System.out.println("Số thứ 3 là : " + c);
    }

    public static void question2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời bạn nhập 3 số thực : ");
        float a = scanner.nextInt();
        System.out.println("Số đầu tiên là : " + a);
        float b = scanner.nextInt();
        System.out.println("Số thứ 2  là : " + b);
        float c = scanner.nextInt();
        System.out.println("Số thứ 3 là : " + c);
    }

    public static void question3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ và tên : ");
        String a = scanner.next();
        System.out.println("Tên của bạn là : " + a);
    }

    public static void question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày tháng năm sinh của bạn : ");
        System.out.println("Năm sinh của bạn là : ");
        int year = scanner.nextInt();
        System.out.println("Thàng sinh của bạn là : ");
        int month = scanner.nextInt();
        System.out.println("Ngày sinh của bạn là : ");
        int day = scanner.nextInt();
        LocalDate dateBirthday = LocalDate.of(year, month, day);
        System.out.println("Ngày tháng năm sinh của bạn là : " + dateBirthday);
    }

    public static void question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin tài khoản bạn cần tạo");
        Account account = new Account();
        System.out.println("Mời bạn nhập ID");
        account.accountID = scanner.nextInt();
        System.out.println("Mời bạn nhập Email ");
        account.email = scanner.next();
        System.out.println("Mời bạn nhập phòng ban ");
        int pos = scanner.nextInt();
        switch (pos) {
            case 1:
                Position position = new Position();
                position.positionname = PositionName.DEV;
                account.position = position;
                break;
            case 2:
                Position position1 = new Position();
                position1.positionname = PositionName.PM;
                account.position = position1;
                break;
            case 3:
                Position position2 = new Position();
                position2.positionname = PositionName.TEST;
                account.position = position2;
                break;
            case 4:
                Position position3 = new Position();
                position3.positionname = PositionName.SCRUM_MASTER;
                account.position = position3;
                break;
        }
        System.out.println("Thông tin Acc vừa nhập, ID: " + account.accountID
                + " Email: " + account.email
                + "Position: " + account.position.positionname);


    }

    public static void question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin tạo Department ");
        Department department = new Department();
        department.departmentid = scanner.nextInt();
        System.out.println("Phòng ban của bạn có ID là : " + department.departmentid);
        department.departmentname = scanner.next();
        System.out.println("Phòng ban của bạn tên là : " + department.departmentname);
    }
    public static void question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số chẵn");
        int t = scanner.nextInt();
        if (t %2 == 0)
            System.out.println("Số bạn vừa nhập là : " + t);
        else
            System.out.println("Số bạn vừa nhập không phải là số chẵn vui lòng nhập lại");
    }

    public static void question8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chức năng muốn sử dụng");
        int chose;
        System.out.println("1: Tạo Account và Position " + ",2: Tạo Department");
        chose = scanner.nextInt();
        if (chose == 1 || chose == 2) {
            switch (chose) {
                case 1:
                    question5();
                case 2:
                    question6();
                    return;
            }

        } else {
            System.out.println("Mời bạn nhập lại");
        }
    }

    public static void question9() {
        Scanner scanner = new Scanner(System.in);
        Department department1 = new Department();
        department1.departmentid = 1;
        department1.departmentname = "Marketing";

        Department department2 = new Department();
        department2.departmentid = 2;
        department2.departmentname = "Sale";

        Department department3 = new Department();
        department3.departmentid = 3;
        department3.departmentname = "Manager";


        Position position1 = new Position();
        position1.positionid = 1;
        position1.positionname = PositionName.PM;
        Position position2 = new Position();
        position2.positionid = 2;
        position2.positionname = PositionName.DEV;
        Position position3 = new Position();
        position3.positionid = 3;
        position3.positionname = PositionName.TEST;

        Account account1 = new Account();
        account1.accountID = 1;
        account1.username = "Thinh1";
        account1.fullname = "Pham Van Thinh";
        account1.department = department1;
        account1.position = position1;
        account1.createdate = LocalDate.now();
        account1.email = "thinh1@gmail.com";

        Account account2 = new Account();
        account2.accountID = 2;
        account2.username = "Thinh2";
        account2.fullname = "Pham Van Thinh";
        account2.department = department2;
        account2.position = position2;
        account2.createdate = LocalDate.now();
        account2.email = "thinh2@gmail.com";

        Account account3 = new Account();
        account3.accountID = 3;
        account3.username = "Thinh3";
        account3.fullname = "Pham Van Thinh";
        account3.department = department3;
        account3.position = position3;
        account3.createdate = LocalDate.now();
        account3.email = "thinh3@gmail.com";

        Group group1 = new Group();
        group1.groupid = 1;
        group1.groupname = "T1";
        group1.creatorid = 1;
        group1.createdate = LocalDate.now();
        Group group2 = new Group();
        group2.groupid = 2;
        group2.groupname = "GENG";
        group2.creatorid = 2;
        group2.createdate = LocalDate.now();
        Group group3 = new Group();
        group3.groupid = 3;
        group3.groupname = "HLE";
        group3.creatorid = 3;
        group3.createdate = LocalDate.now();
        //
        Account[] accList = {account1, account2, account3};
        Group[] groupList = {group1, group2, group3};

        //
        account1.groups = new Group[]{group1, group2};
        account2.groups = new Group[]{group1, group2};
        account3.groups = new Group[]{group1, group2, group3};
        //
        group1.accounts = new Account[]{account1, account3};
        group2.accounts = new Account[]{account1, account2, account3};
        group3.accounts = new Account[]{account2, account3};

        System.out.println("Danh sách User đang có là ");
        for (int i = 0; i < accList.length; i++) {
            System.out.println(accList[i].username);
        }
        System.out.println("Nhập vào Username của Account");

        String username = scanner.next();
        System.out.println("Group đang có mặt trong hệ thống ");

        for (int i = 0; i < groupList.length; i++) {
            System.out.println(groupList[i].groupname);
        }

        System.out.println("Nhập tên Group cần thêm ");
        String groupname = scanner.next();
        int groupsIndex = -1;
        for (int i = 0; i < groupList.length; i++) {
            if (groupList[i].groupname.equals(groupname))
                groupsIndex = i;

        }
        int accIndex = -1;
        for (int j = 0; j < accList.length; j++) {
            if (accList[j].username.equals(username))
                accIndex = j;

        }
        if (accIndex < 0 || groupsIndex < 0) {
            System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc group này trên hệ thống");
        } else {
            for (int j = 0; j < accList.length; j++) {
                if (accList[j].username.equals(username)) {
                    Group[] grouppAdd = {groupList[groupsIndex]};
                    accList[j].groups = grouppAdd;
                    System.out.println("Bạn vừa Add group: " +
                            accList[accIndex].groups[0].groupname +
                            " cho Account: " + accList[accIndex].username);


                }

            }


        }
    }public static void question9radom() {
        Scanner scanner = new Scanner(System.in);
        Department department1 = new Department();
        department1.departmentid = 1;
        department1.departmentname = "Marketing";

        Department department2 = new Department();
        department2.departmentid = 2;
        department2.departmentname = "Sale";

        Department department3 = new Department();
        department3.departmentid = 3;
        department3.departmentname = "Manager";


        Position position1 = new Position();
        position1.positionid = 1;
        position1.positionname = PositionName.PM;
        Position position2 = new Position();
        position2.positionid = 2;
        position2.positionname = PositionName.DEV;
        Position position3 = new Position();
        position3.positionid = 3;
        position3.positionname = PositionName.TEST;

        Account account1 = new Account();
        account1.accountID = 1;
        account1.username = "Thinh1";
        account1.fullname = "Pham Van Thinh";
        account1.department = department1;
        account1.position = position1;
        account1.createdate = LocalDate.now();
        account1.email = "thinh1@gmail.com";

        Account account2 = new Account();
        account2.accountID = 2;
        account2.username = "Thinh2";
        account2.fullname = "Pham Van Thinh";
        account2.department = department2;
        account2.position = position2;
        account2.createdate = LocalDate.now();
        account2.email = "thinh2@gmail.com";

        Account account3 = new Account();
        account3.accountID = 3;
        account3.username = "Thinh3";
        account3.fullname = "Pham Van Thinh";
        account3.department = department3;
        account3.position = position3;
        account3.createdate = LocalDate.now();
        account3.email = "thinh3@gmail.com";

        Group group1 = new Group();
        group1.groupid = 1;
        group1.groupname = "T1";
        group1.creatorid = 1;
        group1.createdate = LocalDate.now();
        Group group2 = new Group();
        group2.groupid = 2;
        group2.groupname = "GENG";
        group2.creatorid = 2;
        group2.createdate = LocalDate.now();
        Group group3 = new Group();
        group3.groupid = 3;
        group3.groupname = "HLE";
        group3.creatorid = 3;
        group3.createdate = LocalDate.now();
        //
        Account[] accList = {account1, account2, account3};
        Group[] groupList = {group1, group2, group3};

        //
        account1.groups = new Group[]{group1, group2};
        account2.groups = new Group[]{group1, group2};
        account3.groups = new Group[]{group1, group2, group3};
        //
        group1.accounts = new Account[]{account1, account3};
        group2.accounts = new Account[]{account1, account2, account3};
        group3.accounts = new Account[]{account2, account3};

        System.out.println("Danh sách User đang có là ");
        for (int i = 0; i < accList.length; i++) {
            System.out.println(accList[i].username);
        }
        System.out.println("Nhập vào Username của Account");

        String username = scanner.next();



        Random random = new Random();
        int groupsIndex = random.nextInt(2);

        int accIndex = -1;
        for (int j = 0; j < accList.length; j++) {
            if (accList[j].username.equals(username))
                accIndex = j;

        }
        if (accIndex < 0  ) {
            System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc group này trên hệ thống");
        } else {
            for (int j = 0; j < accList.length; j++) {
                if (accList[j].username.equals(username)) {
                    Group[] grouppAdd = {groupList[groupsIndex]};
                    accList[j].groups = grouppAdd;
                    System.out.println("Bạn vừa Add group: " +
                            accList[accIndex].groups[0].groupname +
                            " cho Account: " + accList[accIndex].username);


                }

            }


        }
    }
    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        while (true){
            System.out.println("Mời bạn chọn chức năng"
            + "1: Tạo Account " +
               "2: Tạo Department" +
                    "3: Add Account vào Group");
            choice = scanner.nextInt();
            if (choice ==1 || choice==2 || choice==3)
                switch (choice){
                    case 1:
                        question5();
                        break;
                    case 2:
                        question8();
                        break;
                    case 3:
                        question9();
                        break;
                }

                System.out.println("Bạn có muốn thực hiện chức năng khác không?");
                String q = scanner.next();
                if (q.equals("no" + "không") ){
                    System.out.println("Kết thúc chương trình");
                    return;
                }else {
                    System.out.println("Vui lòng chọn lại chức năng" );
                }

        }
    }
    public static void question11() {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        while (true){
            System.out.println("Mời bạn chọn chức năng"
                    + " 1: Tạo Account " +
                    " 2: Tạo Department" +
                    " 3: Add Account vào Group"+
            " 4: Thêm Account vào group ngẫu nhiên");
            choice = scanner.nextInt();
            if (choice ==1 || choice==2 || choice==3 || choice ==4)
                switch (choice){
                    case 1:
                        question5();
                        break;
                    case 2:
                        question8();
                        break;
                    case 3:
                        question9();
                        break;
                    case 4:
                        question9radom();
                        break;
                }
            System.out.println("Bạn có muốn thực hiện chức năng khác không?");
            String q = scanner.next();
            if (q.equals("no" + "không") ){
                System.out.println("Kết thúc chương trình");
                return;
            }else {
                System.out.println("Vui lòng chọn lại chức năng" );
            }

    }
}
}





