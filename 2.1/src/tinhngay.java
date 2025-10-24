import java.util.Scanner;

public class tinhngay {
    public static void main(String[] args) {

        Scanner st=new Scanner(System.in);
        System.out.println("Nhập vào tháng mà bạn cần tìm :");
        int thang= st.nextInt();

        if (thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12)
            System.out.println("\"tháng"+thang+"có 31 ngày \"");
        else if (thang==4 || thang==6 || thang==9 || thang==11) {
            System.out.println("\"tháng"+thang+"có 30 ngày\"");
        } else if (thang==2){
            System.out.println("Nhập vào năm mà bạn cần tìm :");
            int nam= st.nextInt();
            if (nam % 4 ==0 && nam % 100 !=0 || nam % 400==0)
                System.out.println("\"tháng "+thang+" năm "+nam+" có 29 ngày\"");
            else
                System.out.println("\"thang "+thang+" năm"+nam+" có 28 ngày\"");
        }else
            System.out.println("Tháng không hợp lệ");

    }
}










