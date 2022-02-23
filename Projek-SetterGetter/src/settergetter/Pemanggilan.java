/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;
import java.util.Scanner;//scanner
/**
 *
 * @author MOKLET-2
 */
public class Pemanggilan {
    public static void main(String[] args) {
        
        Scanner I = new Scanner(System.in);//scanner
        
        //membuat obek
        EKtp yi = new EKtp();
        KartuPelajar yu = new KartuPelajar();
        
        //output yang akan ditampilkan
        System.out.println("=====================================");
        System.out.println("Selamat Datang Di Petugas Percetakan");
        System.out.println("=====================================");
        System.out.println("1. Cetak E-Ktp");
        System.out.println("2. Cetak Kartu Pelajar");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan => ");
        int p = I.nextInt();//scanner untuk memilih percetakan
        
        //switch case untuk pemilihan sesuai degan kondisi
        switch(p){
            case 1://case pertama
                //memanggil method 
                yi.setNik();
                yi.setNama();
                yi.setTtl();
                yi.setJk();
                yi.setRtRw();
                yi.setDs();
                yi.setKec();
                yi.setAgama();
                yi.setKwrg();
                
                //memanggil method
                String Nik = yi.getNik();
                String Nm = yi.getNama();
                String Ttl = yi.getTtl();
                String Jk = yi.getJk();
                String Rt = yi.getRtRw();
                String Ds = yi.getDs();
                String Kec = yi.getKec();
                String Agama = yi.getAgama();
                String Kwrg = yi.getKwrg();
                
                //output yang akan ditampilkan
                System.out.println("\n===================================");
                System.out.println("             E - KTP              ");
                System.out.println("===================================");
                System.out.println("NIK\t\t: " + Nik);
                System.out.println("Nama\t\t: " + Nm);
                System.out.println("Tempat/Tgl.Lahir: " + Ttl);
                System.out.println("Jenis Kelamin\t: " + Jk);
                System.out.println("Alamat");
                System.out.println(" RT\t\t: " + Rt);
                System.out.println(" Desa\t\t: " + Ds);
                System.out.println(" Kecamatan\t: " + Kec);
                System.out.println("Agama\t\t: " + Agama);
                System.out.println("Kewarganegaraan\t: " + Kwrg);
                break;
            case 2://case kedua
                //memanggil method
                yu.setNisn();
                yu.setNama();
                yu.setTtl();
                yu.setJk();
                yu.setAlamat();
                
                //memanggil method
                String Nisn = yu.getNisn();
                String Nm2 = yu.getNama();
                String Ttl2 = yu.getTtl();
                String Jk2 = yu.getJk();
                String Alamat = yu.getAlamat();
                
                //output yang akan ditampilkan
                System.out.println("\n===================================");
                System.out.println("          KARTU PELAJAR           ");
                System.out.println("===================================");
                System.out.println("NISN\t\t: " + Nisn);
                System.out.println("Nama\t\t: " + Nm2);
                System.out.println("Tempat/Tgl.Lahir: " + Ttl2);
                System.out.println("Jenis Kelamin\t: " + Jk2);
                System.out.println("Alamat\t\t: " + Alamat);
                break;
            case 3:
                 System.exit(0);
            default:
                System.out.println("PILIHAN TIDAK TERSEDIA");
        }
    }
}
