package ra;

import java.util.Scanner;

public class StudentManager {
    protected static Student[] students = new Student[100];
    protected static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------Quản lý sinh viên-----------------------");
            System.out.println("1. Hiển thị danh sách sinh viên\n" +
                    "2. Thêm mới sinh viên\n" +
                    "3. Update thông tin sinh viên theo id\n" +
                    "4. Xoá sinh viên theo id\n" +
                    "5. Thoát\n");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = sc.nextByte();

            switch (choice) {
                case 1:
                    // hiển thị
                    showAllStudent();
                    break;
                case 2:
                    // thêm mới
                    createStudent();
                    break;
                case 3:
                    // cập nhật theo id
                    System.out.println("Nhập id cần sửa");
                    int idEdit = sc.nextInt();
                    updateStudent(idEdit);
                    break;
                case 4:
                    // xóa theo id
                    System.out.println("Nhập id cần xóa");
                    int idDel = sc.nextInt();
                    deleteStudent(idDel);
                    break;
                case 5:
                    // thoát
                    System.exit(0);
                    break;
                default:
                    // nhập sai
                    System.out.println("Nhập không chính xác , vui lòng thử lại");
                    break;
            }

        }
    }

    public static void createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên cân thêm mới");
        int quantity = sc.nextInt();
        if(quantity > students.length-count){
            System.out.println("Vượt quá số lượng");
            return;
        }

        for (int i = 0; i < quantity; i++) {
            Student newStudent = new Student();
            System.out.println("Nhập thông tin cho sinh viên thứ "+(i+1));
            System.out.println("Nhập id");
            newStudent.setStudentId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập tên sinh viên");
            newStudent.setStudentName(sc.nextLine());
            System.out.println("Nhập giới tính : Nam/Nữ");
            newStudent.setSex(sc.nextLine().equalsIgnoreCase("Nam"));
            System.out.println("Nhạp vào Tên lớp");
            newStudent.setClassName(sc.nextLine());
            System.out.println("Nhập tuổi");
            newStudent.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập địa chỉ sinh viên");
            newStudent.setAddress(sc.nextLine());
            students[count++] = newStudent;
        }
        System.out.println("Thêm mới thành công");
    }

    public static void updateStudent(int idEdit) {
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStudentId(idEdit);
        if(index==-1){
            System.out.println("Không tìm thấy sinh viên nào phù hợp");
            return;
        }

        // cho phép sửa
        System.out.println("------------Thông tin sinh viên cũ---------------");
        System.out.println(students[index]);
        System.out.println("Nhập tên sinh viên mới");
        students[index].setStudentName(sc.nextLine());
        System.out.println("Nhập giới tính mới : Nam/Nữ");
        students[index].setSex(sc.nextLine().equalsIgnoreCase("Nam"));
        System.out.println("Nhạp vào Tên lớp mới");
        students[index].setClassName(sc.nextLine());
        System.out.println("Nhập tuổi mới");
        students[index].setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên mới");
        students[index].setAddress(sc.nextLine());
        System.out.println("Cập nhật thành công");
    }

    public static void showAllStudent() {
        if(count==0){
            System.out.println("Danh sách sinh viên trống");
            return;
        }

        // hiển thị danh sách
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]); // gọi đến phương thức toString
        }
    }

    public static void deleteStudent(int idDelete) {
       int index = getIndexByStudentId(idDelete);
       if(index==-1){
           System.out.println("Không tìm thấy sinh viên nào phù hợp");
           return;
       }

       // cho phép xóa
        for (int i = index+1; i <count ; i++) {
            students[i-1] = students[i];
        }
        students[count-1]= null;
        count--;
        System.out.println("Xóa thành công");
    }

    public static int getIndexByStudentId(int id){
        for (int i = 0; i < count; i++) {
            if(id == students[i].getStudentId()){
                    return i;
            }
        }
        return -1;
    }

}
