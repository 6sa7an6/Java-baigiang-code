import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static char text;
    static int global;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int a = 10;
        double d = 5.6;
        float f = 3.2f;
        boolean check = true;
        short sh = 100;
        long l = 1000;
        char c = '.';
        System.out.println("gia tri bien a" +a);
        System.out.println("gia tri bien d" +d);
        System.out.println("gia tri bien f" +f);
        System.out.println("gia tri bien boolean" + check);
        System.out.println("gia tri bien short" +sh);
        System.out.println("gia tri bien l" +l);
        System.out.println("gia tri bien char" +c);
        System.out.println(global);
        // chuỗi
        String fullName = "ABCCBA" ; //Khởi tạo tường minh
//        System.out.println(fullName);
//        System.out.println(text);//giá trị null là giá trị rỗng , giá trị mặc định của các đối tượng tạo ra từ class
//        String name = new String("ABCCAB"); // cú pháp khởi tạo đối tượng , từ khóa new dùng để gọi đến hàm khởi tạo đối tượng
//        System.out.println(name);
//        Date date = new Date();// đã lỗi thời
//        System.out.println("ngày giờ hiện tại" + date);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        //nhập xuất dữ liệu :
//        Scanner sc =  new Scanner(System.in);
//        Scanner sc1 =  new Scanner(System.in);
//        // system.in là tham số để quét màn hình console
////        System.out.println("hãy nhập tên của bạn");
////        String hoten = sc.nextLine(); // nextLine là phương thức cho phép người dùng nhập 1 chuỗi
////        System.out.println("bạn vừa nhập " + hoten);
////        // nhap so
//        System.out.println("Hay nhap 1 so");
//        int number = sc1.nextInt();
//       // int number = Integer.parseInt(sc.nextLine()); // ép kiểu từ string về kiểu dữ liệu tương
////        float real = sc.nextFloat();
////        double db = sc.nextDouble(); // nhập double
////        char ch = sc.nextLine().charAt(0); // lấy ký tự đầu tiên
////        boolean bool = sc.nextBoolean();
////        sc.nextLine();
//        System.out.println("hay nhap 1 chuoi");
//        String str = sc.nextLine();
//        // khi nhập kiểu dữ liệu là số
//        Integer num = 10 ;
        System.out.printf("họ tên : %s , tuổi %d , điểm %.1f" , fullName,a,d);

        }
    }