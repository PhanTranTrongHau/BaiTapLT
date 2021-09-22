import java.util.Scanner;

public class LT1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai va chieu rong ");
        double chieuDai = scanner.nextDouble();
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2;
        double dienTich = chieuDai*chieuRong;
        double canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi va dien tich la: ");
        System.out.printf("%.2f %.2f", chuVi, dienTich);
        System.out.println("Canh nho nhat la: "+ canhNhoNhat);
    }
}
