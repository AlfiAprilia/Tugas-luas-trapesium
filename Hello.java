import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Hello {
    public static void main(String[] args) {

        // String nama= "Alfi";
        // String asalKota= "Mojokerto";
        // int usia=15;
        // double beratBadan=60.00;
        // float tinggiBadan=156.0f;
        // char jenisKelamin= 'P';
        // boolean status= false; 

        // System.out.println("Nama: "+nama);
        // System.out.println("Asal Kota: "+asalKota);
        // System.out.println("Usia: "+usia);
        // System.out.println("Berat Badan: "+beratBadan);
        // System.out.println("Tinggi Badan: "+tinggiBadan);
        // System.out.println("Jenis Kelamin: "+jenisKelamin);
        // System.out.println("Status: "+status);

        // Scanner input  = new Scanner(System.in); 
        // System.out.println("Masukkan Nama Siswa: ");
        // String nama= input.nextLine(); 
        // System.out.println("Masukkan Alamat Siswa: ");
        // String alamat= input.next(); 
        // System.out.println("Masukkan Usia: ");
        // int usia= input.nextInt();
        // System.out.println("=============");
        // System.out.println("Selamat datang, "+nama);


        // double alas,tinggi,hasil;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan alas segitiga");
        // alas = input.nextDouble();
        // System.out.println("Masukkan tinggi segitiga");
        // tinggi = input.nextDouble();
        // hasil = alas*tinggi;
        // System.out.println("Hasil Luas Segitiga Adalah:" +hasil);

        double sisiAtas,sisiBawah,tinggi,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi atas : ");
        sisiAtas = input.nextDouble();
        System.out.println("Masukkan panjang sisi bawah : ");
        sisiBawah = input.nextDouble();
        System.out.println("Masukkan tinggi trapesium : ");
        tinggi = input.nextDouble();
        hasil = 0.5 * (sisiAtas*sisiBawah) * tinggi;
        System.out.println("Hasil luas trapesium adalah : "+hasil);

    }
}
