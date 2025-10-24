import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner st=new Scanner(System.in);
        System.out.println("Nhập vào năm dương lịch mà bạn cần tìm :");
        int nam= st.nextInt();

        if (nam % 4 == 0 && nam % 100 !=0 || nam % 400 ==0)
            System.out.println("Đây là năm nhuận");
        else
            System.out.println("Đây là năm không nhuận");
    }
}