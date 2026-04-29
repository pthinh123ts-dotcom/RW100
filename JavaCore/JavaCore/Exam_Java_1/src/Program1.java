import java.time.LocalDate;

public class Program1 {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Marketing";

        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "Sale";

        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "Manager";

        System.out.println("Thông tin phòng ban là : ");
        System.out.println("Phòng ban có ID là : " + department1.departmentID + "   Phòng Ban Có tên là : " + department1.departmentName);
        System.out.println("Phòng ban có ID là : " + department2.departmentID + "   Phòng Ban Có tên là : " + department2.departmentName);
        System.out.println("Phòng ban có ID là : " + department3.departmentID + "   Phòng Ban Có tên là : " + department3.departmentName);

        Position position1 = new Position();
        position1.positionid = 1;
        position1.positionname = PositionName.PM;
        Position position2 = new Position();
        position2.positionid = 2;
        position2.positionname = PositionName.DEV;
        Position position3 = new Position();
        position3.positionid = 3;
        position3.positionname = PositionName.TEST;

        System.out.println("Thông tin chức vụ là : ");
        System.out.println("Chức vụ có ID là : " + position1.positionid + "    Chức vụ tên là : " + position1.positionname);
        System.out.println("Chức vụ có ID là : " + position2.positionid + "    Chức vụ tên là : " + position2.positionname);
        System.out.println("Chức vụ có ID là : " + position3.positionid + "    Chức vụ tên là : " + position3.positionname);

        Account account1 = new Account();
            account1.accountID = 1;
            account1.username = "Thinh1";
            account1.fullname = "Pham Van Thinh";
            account1.department = department1;
            account1.position = position1;
            account1.localDate = LocalDate.now();

        Account account2 = new Account();
            account2.accountID = 1;
            account2.username = "Thinh2";
            account2.fullname = "Pham Van Thinh";
            account2.department = department2;
            account2.position = position2;
            account2.localDate = LocalDate.now();

        Account account3 = new Account();
            account3.accountID = 1;
            account3.username = "Thinh1";
            account3.fullname = "Pham Van Thinh";
            account3.department = department3;
            account3.position = position3;
            account3.localDate = LocalDate.now();

        System.out.println("Thông tin tài khoản là : ");
        System.out.println("ID của tài khoản là : " + account1.accountID +
                "   Username Là : " + account1.username +
                "   Tên đầy đủ là : " + account1.fullname +
                "   Phòng ban là : " + account1.department.departmentName +
                "   Chức vụ là : " + account1.position.positionname +
                "   Thời gian tạo : " + account1.localDate
        );
        System.out.println("ID của tài khoản là : " + account2.accountID +
                "   Username Là : " + account2.username +
                "   Tên đầy đủ là : " + account2.fullname +
                "   Phòng ban là : " + account2.department.departmentName +
                "   Chức vụ là : " + account2.position.positionname +
                "   Thời gian tạo : " + account2.localDate
        );
        System.out.println("ID của tài khoản là : " + account3.accountID +
                "   Username Là : " + account3.username +
                "   Tên đầy đủ là : " + account3.fullname +
                "   Phòng ban là : " + account3.department.departmentName +
                "   Chức vụ là : " + account3.position.positionname +
                "   Thời gian tạo : " + account3.localDate
        );

        Group group1 = new Group();
        group1.groupname = 1;
        group1.groupname = "T1";
        group1.creatorid = 1;
        group1.createdate = LocalDate.now();
        Group group2 = new Group();
        group2.groupname = 2;
        group2.groupname = "GENG";
        group2.creatorid = 2;
        group2.createdate = LocalDate.now();
        Group group3 = new Group();
        group3.groupname = 3;
        group3.groupname = "HLE";
        group3.creatorid = 3;
        group3.createdate = LocalDate.now();

        System.out.println("Không tin của các Group là : ");
        System.out.println("ID Group là : " + group1.groupname +
                "   Tên Group là : " + group1.groupname +
                "   ID người tạo Group là : " + group1.creatorid +
                "   Thời gian tạo Group là : " + group1.createdate
        );

        System.out.println("ID Group là : " + group2.groupname +
                "   Tên Group là : " + group2.groupname +
                "   ID người tạo Group là : " + group2.creatorid +
                "   Thời gian tạo Group là : " + group2.createdate
        );

        System.out.println("ID Group là : " + group3.groupname +
                "   Tên Group là : " + group3.groupname +
                "   ID người tạo Group là : " + group3.creatorid +
                "   Thời gian tạo Group là : " + group3.createdate
        );

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupid = group1;
        groupAccount1.accountid = account1;
        groupAccount1.localdate = LocalDate.of(2018,12,3);
        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupid = group2;
        groupAccount2.accountid = account2;
        groupAccount2.localdate = LocalDate.of(2022,5,11);
        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupid = group3;
        groupAccount3.accountid = account3;
        groupAccount3.localdate = LocalDate.of(2025,6,7);







    }
}