import java.time.LocalDate;

public class Program1 {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.DepartmentID = 1;
        department1.DepartmentName = "Marketing";

        Department department2 = new Department();
        department2.DepartmentID = 2;
        department2.DepartmentName = "Sale";

        Department department3 = new Department();
        department3.DepartmentID = 3;
        department3.DepartmentName = "Manager";

        System.out.println("Thông tin phòng ban là : ");
        System.out.println("Phòng ban có ID là : " + department1.DepartmentID + "   Phòng Ban Có tên là : " + department1.DepartmentName);
        System.out.println("Phòng ban có ID là : " + department2.DepartmentID + "   Phòng Ban Có tên là : " + department2.DepartmentName);
        System.out.println("Phòng ban có ID là : " + department3.DepartmentID + "   Phòng Ban Có tên là : " + department3.DepartmentName);

        Position position1 = new Position();
        position1.PositionID = 1;
        position1.PositionName = PositionName.PM;
        Position position2 = new Position();
        position2.PositionID = 2;
        position2.PositionName = PositionName.DEV;
        Position position3 = new Position();
        position3.PositionID = 3;
        position3.PositionName = PositionName.TEST;

        System.out.println("Thông tin chức vụ là : ");
        System.out.println("Chức vụ có ID là : " + position1.PositionID + "    Chức vụ tên là : " + position1.PositionName);
        System.out.println("Chức vụ có ID là : " + position2.PositionID + "    Chức vụ tên là : " + position2.PositionName);
        System.out.println("Chức vụ có ID là : " + position3.PositionID + "    Chức vụ tên là : " + position3.PositionName);

        Account account1 = new Account();
            account1.AccountID = 1;
            account1.Username = "Thinh1";
            account1.Fullname = "Pham Van Thinh";
            account1.Department = department1;
            account1.Position = position1;
            account1.LocalDate = LocalDate.now();

        Account account2 = new Account();
            account2.AccountID = 1;
            account2.Username = "Thinh2";
            account2.Fullname = "Pham Van Thinh";
            account2.Department = department2;
            account2.Position = position2;
            account2.LocalDate = LocalDate.now();

        Account account3 = new Account();
            account3.AccountID = 1;
            account3.Username = "Thinh1";
            account3.Fullname = "Pham Van Thinh";
            account3.Department = department3;
            account3.Position = position3;
            account3.LocalDate = LocalDate.now();

        System.out.println("Thông tin tài khoản là : ");
        System.out.println("ID của tài khoản là : " + account1.AccountID +
                "   Username Là : " + account1.Username +
                "   Tên đầy đủ là : " + account1.Fullname +
                "   Phòng ban là : " + account1.Department.DepartmentName +
                "   Chức vụ là : " + account1.Position.PositionName +
                "   Thời gian tạo : " + account1.LocalDate
        );
        System.out.println("ID của tài khoản là : " + account2.AccountID +
                "   Username Là : " + account2.Username +
                "   Tên đầy đủ là : " + account2.Fullname +
                "   Phòng ban là : " + account2.Department.DepartmentName +
                "   Chức vụ là : " + account2.Position.PositionName +
                "   Thời gian tạo : " + account2.LocalDate
        );
        System.out.println("ID của tài khoản là : " + account3.AccountID +
                "   Username Là : " + account3.Username +
                "   Tên đầy đủ là : " + account3.Fullname +
                "   Phòng ban là : " + account3.Department.DepartmentName +
                "   Chức vụ là : " + account3.Position.PositionName +
                "   Thời gian tạo : " + account3.LocalDate
        );

        Group group1 = new Group();
        group1.GroupID = 1;
        group1.GroupName = "T1";
        group1.CreatorID = 1;
        group1.CreateDate = LocalDate.now();
        Group group2 = new Group();
        group2.GroupID = 2;
        group2.GroupName = "GENG";
        group2.CreatorID = 2;
        group2.CreateDate = LocalDate.now();
        Group group3 = new Group();
        group3.GroupID = 3;
        group3.GroupName = "HLE";
        group3.CreatorID = 3;
        group3.CreateDate = LocalDate.now();

        System.out.println("Không tin của các Group là : ");
        System.out.println("ID Group là : " + group1.GroupID +
                "   Tên Group là : " + group1.GroupName +
                "   ID người tạo Group là : " + group1.CreatorID +
                "   Thời gian tạo Group là : " + group1.CreateDate
        );

        System.out.println("ID Group là : " + group2.GroupID +
                "   Tên Group là : " + group2.GroupName +
                "   ID người tạo Group là : " + group2.CreatorID +
                "   Thời gian tạo Group là : " + group2.CreateDate
        );

        System.out.println("ID Group là : " + group3.GroupID +
                "   Tên Group là : " + group3.GroupName +
                "   ID người tạo Group là : " + group3.CreatorID +
                "   Thời gian tạo Group là : " + group3.CreateDate
        );

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.GroupId = group1;
        groupAccount1.AccountID = account1;
        groupAccount1.LocalDate = LocalDate.of(2018,12,3);
        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.GroupId = group2;
        groupAccount2.AccountID = account2;
        groupAccount2.LocalDate = LocalDate.of(2022,5,11);
        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.GroupId = group3;
        groupAccount3.AccountID = account3;
        groupAccount3.LocalDate = LocalDate.of(2025,6,7);







    }
}