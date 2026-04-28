import java.time.LocalDate;

public class Exercise_1_Flow_Control {
    public static void main(String[] args) {
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
        account1.groups = new Group[]{group1,group2};
        account2.groups = new Group[]{group1,group2};
        account3.groups = new Group[]{group1,group2,group3};
        //
        group1.accounts = new Account[]{account1,account3};
        group2.accounts = new Account[]{account1,account2, account3};
        group3.accounts = new Account[]{account2,account3};







        // if
        System.out.println("Question1 : ");
        if (account2.department == null) {
            System.out.println(" Nhân viên này chưa có phòng ban ");
        } else {
            System.out.println(" Nhân viên này có phòng ban là : " + account2.department.departmentname);
        }


        System.out.println("Question2 : ");
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa có group !!");
        } else { int countgroups = account2.groups.length;
            if (countgroups == 1 || countgroups == 2)
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            if (countgroups == 3)
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            if (countgroups == 4)
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        System.out.println("Question3 : ");
        System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" :
                "Phòng ban của nhân viên này là : " + account2.department.departmentname);

        System.out.println("Question4 : ");
        System.out.println(account1.position.positionname.toString()== "DEV" ? "Đây là DEV" :
        "Đây không phải là DEV");

        // Switch case
        System.out.println("Question5 : ");
        if (group1.accounts == null){
            System.out.println("Nhóm chưa có thành viên");
        }else {
            int countAccInGroup = group1.accounts.length;
            switch (countAccInGroup){
                case 1 :
                    System.out.println("Group này có 1 thành viên");
                    break;
                case 2 :
                    System.out.println("Group này có 2 thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên ");
                    break;

            }

        }
        System.out.println("Question6 : ");
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        }else {
            int countGroupInAcc = account2.groups.length;
            switch (countGroupInAcc){
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");break;
            }
        }
        System.out.println("Question7 : ");
        String positionname = account1.position.positionname.toString();
        switch (positionname){
            case "DEV" :
                System.out.println("Nhân viên này là DEV");
                break;
            default:
                System.out.println("Nhân viên này không phải là DEV");
                break;
        }

        // foreach
        System.out.println("Question8 : ");
        Account[] accList = {account1,account2,account3};
        for (Account account : accList ){
            System.out.println("Email :" + account.email +
                    "   UserName : " + account.username +
                    "   FullName : " + account.fullname
            );
        }
        System.out.println("Question9 : ");
        Department[] departmentList = { department1, department2, department3 };
        for (Department department : departmentList) {
            System.out.println("DepartmentID: " + department.departmentid + " DepartmentName: " + department.departmentname);
        }

        // for
        System.out.println("Question10 : ");
        for (int i = 0; i < accList.length ; i++) {
            System.out.println("Thông tin Account thứ " + (i +1) +
                    "   Email :" + accList[i].email +
                    "   FullName" + accList[i].fullname +
                    "   Phòng ban " + accList[i].department.departmentname);
            
        }
        System.out.println("Question11 : ");
        for (int i = 0; i < departmentList.length ; i++) {
            System.out.println(" ID là : " + departmentList[i].departmentid +
                    " Tên phòng ban là : " + departmentList[i].departmentname);

        }


        System.out.println("Question 12 : ");
        for (int i = 0; i < 2 ; i++) {
            System.out.println( "Department thứ " + (i + 1) +
                    " ID là : " + departmentList[i].departmentid +
                    " Tên phòng ban là : " + departmentList[i].departmentname);
        }

        System.out.println("Question13 : ");
        for (int i = 0; i < accList.length ; i++)
        if (i !=1) {
            System.out.println("Thông tin Account thứ " + (i + 1) +
                    "   Email :" + accList[i].email +
                    "   FullName" + accList[i].fullname +
                    "   Phòng ban " + accList[i].department.departmentname);
        }

        System.out.println("Question14 : ");
        for (int i = 0; i < accList.length ; i++)
        if (accList[i].accountID<4) {
            System.out.println("Thông tin Account thứ " + (i + 1) +
                    "   Email :" + accList[i].email +
                    "   FullName : " + accList[i].fullname +
                    "   Phòng ban : " + accList[i].department.departmentname);
        }
        System.out.println("Question15 : ");
        for (int i = 1; i <= 20; i++) {
            if (i%2 ==0 ) {
            System.out.print(i+ "  ");
        }
        }


        // WHILE
        System.out.println("Question16-11 : ");
        int i = 0;
        while (i< accList.length) {
            System.out.println("Thông tin Account thứ " + (i + 1) +
                    "   Email :" + accList[i].email +
                    "   FullName : " + accList[i].fullname +
                    "   Phòng ban : " + accList[i].department.departmentname);
            i++;


        }
        System.out.println("Question16-12 : ");
        int j = 0;
        while (j < departmentList.length){
            System.out.println("Thông tin phòng ban thứ : "+ (j+1) +
                    " ID là : " + departmentList[j].departmentid +
                    " Tên phòng ban là : " + departmentList[j].departmentname);
            j++;
        }
        System.out.println("Question16-13 : ");
        int a = 0;
        while (a< accList.length) {
            if (a !=1 ) {

                System.out.println("Thông tin Account thứ " + (a + 1) +
                        "   Email :" + accList[a].email +
                        "   FullName : " + accList[a].fullname +
                        "   Phòng ban : " + accList[a].department.departmentname);}
            a++;

            }
        System.out.println("Question16-14 : ");
        int d = 0;
        while (d < accList.length){
            if (accList[d].accountID<4) {
                System.out.println("Thông tin Account thứ " + (d + 1) +
                        "   Email :" + accList[d].email +
                        "   FullName : " + accList[d].fullname +
                        "   Phòng ban : " + accList[d].department.departmentname);
            }
            d++;
        }
        System.out.println("Question16-15 : ");
        while (i <=20){
            if (i %2 ==0)
                System.out.println(" " + i);
            i++;

        }
        // DO - WHITE
        System.out.println("Question17-10 : ");
        int i1 = 0;
        do {
            System.out.println("Thông tin Account thứ " + (i1 + 1) +
                    "   Email :" + accList[i1].email +
                    "   FullName : " + accList[i1].fullname +
                    "   Phòng ban : " + accList[i1].department.departmentname);
            
            i1++;
        } while (i1 < accList.length);

        System.out.println("Question17-11 : ");
        int j1 = 0;
        do {
            System.out.println("Thông tin phòng ban thứ : "+ (j1+1) +
                    " ID là : " + departmentList[j1].departmentid +
                    " Tên phòng ban là : " + departmentList[j1].departmentname);
            j1++;
        } while (j1 < departmentList.length);

        System.out.println("Question17-12 : ");
        int j2 =0;
        do {
            System.out.println("Thông tin phòng ban thứ : "+ (j2+1) +
                    " ID là : " + departmentList[j2].departmentid +
                    " Tên phòng ban là : " + departmentList[j2].departmentname);
            j2++;
        } while (j2 < 2);
        System.out.println("Question17-13 : ");
        int s1 = 0;
        do {
            if (s1 != 1) {
                System.out.println("Thông tin Account thứ " + (s1 + 1) +
                        "   Email :" + accList[s1].email +
                        "   FullName : " + accList[s1].fullname +
                        "   Phòng ban : " + accList[s1].department.departmentname);
            }
            s1++;
        }while (s1< accList.length);

        System.out.println("Question17-14 : ");
        int s2 = 0;
        do {
            if (accList[s2].accountID<4) {
                System.out.println("Thông tin Account thứ " + (s2 + 1) +
                        "   Email :" + accList[s2].email +
                        "   FullName : " + accList[s2].fullname +
                        "   Phòng ban : " + accList[s2].department.departmentname);
            }
            s2++;
        }while (s2< accList.length);

        System.out.println("Question17-15 : ");
        int i3 = 1;
        do {
            if (i3 % 2 == 0) {
                System.out.print(i3 + "  ");
            }
            i3++;
        } while (i3 <= 20);
    }















}


