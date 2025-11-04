import java.util.Scanner;

public class mudah1 {
    public static void main(String[] args) {

        //input data
        Scanner input = new Scanner(System.in);
        System.out.println("----- Program Ekspedisi -----");
        System.out.println("Masukkan berat paket (kg): ");
        double beratPaket = input.nextDouble();
        System.out.println("Masukkan jarak tempuh (km): ");
        double jarakTempuh = input.nextDouble();
        System.out.println("Masukkan panjang paket (cm): ");
        double panjangPaket = input.nextDouble();
        System.out.println("Masukkan lebar paket (cm): ");
        double lebarPaket = input.nextDouble();
        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggiPaket = input.nextDouble();

        //hitung biaya berat
        double biayaBerat;
        if (jarakTempuh <=10) {
            biayaBerat = beratPaket*4250;
        } else {
            biayaBerat = beratPaket*6000;
        }

        //hitung volume paket
        double volume = panjangPaket*lebarPaket*tinggiPaket;
        double biayaVolume;
        if (volume >100) {
            biayaVolume = 50000;
        } else {
            biayaVolume = 0;
        }

        //hitung total biaya
        double total = biayaBerat + biayaVolume;

        //menampilkan output
        System.out.println("===========================================");
        System.out.println("Total biaya pengiriman adalah : Rp"+ total);

    }
}
