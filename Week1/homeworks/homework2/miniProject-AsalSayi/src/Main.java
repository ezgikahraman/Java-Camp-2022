public class Main {
    public static void main(String[] args) {
        int sayi = 30;
        boolean asalMi = true;

        if(sayi==1) {
            System.out.println("sayı asal değildir.");
            return;
        }

        if(sayi<1) {
            System.out.println("geçersiz sayı");
            return;
        }

        for(int i=2;i<sayi;i++) {
            if(sayi % i == 0) {
                asalMi = false;
            }
        }

        if(asalMi) {
            System.out.println("sayı asaldır.");
        }
        else {
            System.out.println("sayı asal değildir");
        }

    }
}