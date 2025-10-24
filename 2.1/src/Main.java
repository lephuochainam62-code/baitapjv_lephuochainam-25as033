import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Nhập số tháng bạn cần tìm: ");
        int thang = st.nextInt();
        int ngay = 0;

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            ngay = 31;
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            ngay = 30;
        } else if (thang == 2) {
            System.out.print("Nhập năm: ");
            int nam = st.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                ngay = 29;
            } else {
                ngay = 28;
            }
        } else {
            System.out.println("Tháng không hợp lệ!");
            return;
        }

        System.out.println("Tháng " + thang + " có " + ngay + " ngày.");
    }
}


