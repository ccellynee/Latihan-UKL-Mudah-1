# Latihan-UKL-Mudah-1

bagian 1:
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
pada bagian tersebut user diminta untuk memasukkan berat paket, jarak tempuh, panjang, lebar, tinggi paket.


bagian 2:
//hitung biaya berat
        double biayaBerat;
        if (jarakTempuh <=10) {
            biayaBerat = beratPaket*4250;
        } else {
            biayaBerat = beratPaket*6000;
        }
pada bagian tersebut program menghitung biaya paket berdasarkan beratnya, dengan kondisi jika jarak tempuhnya <= 10km dikenakan biaya 4250/kg. dan jika lebih dari 10km akan dikenakan biaya 6000/kg

bagian 3:
//hitung volume paket
        double volume = panjangPaket*lebarPaket*tinggiPaket;
        double biayaVolume;
        if (volume >100) {
            biayaVolume = 50000;
        } else {
            biayaVolume = 0;
        }
program menghitung volume dengan rumus p*l*t, dengan nilai yang telah di input pengguna. dengan kondisi jika lebih dari 100cm3 akan dikenakan biaya 50000, jika tidak maka 0 biaya.

bagian 4:
//hitung total biaya
        double total = biayaBerat + biayaVolume;
program menghitung total biaya yang harus dibayar, yaitu dengan menghitung biaya paket berdasarkan beratnya + biaya volume

bagian 5:
 //menampilkan output
        System.out.println("===========================================");
        System.out.println("Total biaya pengiriman adalah : Rp"+ total);

    }
}

program mengeluarkan output berupa total biaya yang harus dibayar

<img width="1919" height="1017" alt="Cuplikan layar 2025-11-04 121055" src="https://github.com/user-attachments/assets/f0da127d-075c-441d-9f7e-14eee716a9ad" />



