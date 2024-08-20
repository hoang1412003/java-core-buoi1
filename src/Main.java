import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int inputNumber(String name) {
      Scanner sc =new Scanner(System.in);
      boolean validInput =false;
      int value = 0;
      while (!validInput) {
          try {
              float a = 0;
              double b = 0;
              System.out.printf("nhập %s của bạn: ", name);
              value = sc.nextInt();
              sc.nextLine();
              validInput = true; //nếu nhập hợp lệ, thoát vòng lặp
          }
          catch (InputMismatchException e) {
              System.out.println("Lỗi: Bạn phải nhập 1 số nguyên hợp lệ.");
              sc.next(); // xóa bỏ dữ liệu khỏi scanner
          }
      }
      return value;
    };

    public static void nhapXuat () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        int age = 0;
        int height = 0;
        age = inputNumber("Tuổi");
        height = inputNumber("Chiều cao");

        System.out.println("Tên: "+ name);
        System.out.println("Tuổi: "+ age);
        System.out.println("chiều cao: "+height+"m");
        sc.close();
    }

    public static String getZodiacSing(int day, int month) {
        if(month == 1) {
            return (day <= 19) ? "Ma kết" : "Bảo Bình";
        } else if(month == 2) {
            return (day <= 18) ? "Bảo Bình" : "Song ngư";
        }else if(month == 3) {
            return (day <= 20) ? "song ngư" : "Bạch dương";
        }else if(month == 4) {
            return (day <= 19) ? "Bạch dương" : "Kim Ngưu";
        }else if(month == 5) {
            return (day <= 20) ? "Kim ngưu" : "Song Tử";
        }else if(month == 6) {
            return (day <= 20) ? "song Tử" : "cự giải";
        }else if(month == 7) {
            return (day <= 22) ? "Cự giải" : "Sư tử";
        }else if(month == 8) {
            return (day <= 22) ? "Sử Tử" : "Xử Nử";
        }else if(month == 9) {
            return (day <= 22) ? "Xử Nữ" : "Thiên Bình";
        }else if(month == 10) {
            return (day <= 22) ? "Thiên bình" : "Bọ cạp";
        }else if(month == 11) {
            return (day <= 21) ? "Bọ cạp" : "Nhân Mã";
        }else if(month == 12) {
            return (day <= 21) ? "Nhân Mã" : "Ma Kết";
        } else {
            return "Ngày hoặc tháng không hợp lệ";
        }

    }

    public  static int calculateLifePathNumber(int day, int month, int year) {
        int sum = day + month + year;
        return reduceToSingleDigit(sum);
    }

    private static int reduceToSingleDigit(int number) {
        while (number > 9 && number != 11 && number != 22 && number != 33) {
            number = sumDfDigits(number);
        }
        return number;
    }

    private static int sumDfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
//        Scanner scanner = new Scanner(System.in);

//        // nhập 1 chuỗi
//        System.out.print("nhập tên của bạn: ");
//        String name = scanner.nextLine();
//        // nhập 1 số nguyên
//        int age;
//        boolean flag = false;
//        while (!flag) {
//            try {
//                System.out.print("Nhập tuổi của bạn: ");
//                age = scanner.nextInt();
//                flag = true; // nếu không có lô đặt validInput thành true
//            }
//            catch (InputMismatchException e) {
//                System.out.println("lỗi: vui lòng nhập 1 số nguyên hợp lệ.");
//                scanner.next(); // xóa bỏ dữ liệu không hợp lệ
//            }
//
//        }
//
//
//        // nhập số thực
//        System.out.print("Nhập chều cao của bạn (mét): ");
//        double height = scanner.nextDouble();
//
//        // hiển thị thông tin đã nhập
//        System.out.println("Tên: "+ name);
//        System.out.println("Chiều cao: "+height+" mét");
//
//        // đóng đối tượng scanner
//        scanner.close();

//        int a=2, b=3;
//        System.out.println("a + b = " + (a+b));
//        System.out.println("a - b = " + (a-b));
//        System.out.println("a * b = " + (a*b));
//        System.out.println("a % b = " + (a%b));
//        System.out.println("a / b = " + (float)a/b);
//        System.out.println("a / b = " + a/(float)b);
//        System.out.println("a / b = " + a/(double)b);
//        System.out.println("a / b = " + a*1.0/b);
//        System.out.println("a / b = " + a/(b*1.0));

//        nhapXuat();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập ngày sinh (dd): ");
//        int day = sc.nextInt();
//
//        System.out.print("Nhập tháng sinh (mm): ");
//        int month = sc.nextInt();
//
//        System.out.println("Cung của bạn là: " + getZodiacSing(day, month));
//
//        System.out.print("Nhập năm sinh (yyyy): ");
//        int year = sc.nextInt();
//
//        System.out.print("số của bạn là: " + calculateLifePathNumber(day, month, year));

        HinhChuNhat a = new HinhChuNhat(4, 5);
        System.out.println("Dài = "+ a.dai);
        System.out.println("Rộng = "+a.rong);

        System.out.println("Chu vi = "+a.chuVi());
        System.out.println("Diện tích = "+a.dienTich());
    }

}