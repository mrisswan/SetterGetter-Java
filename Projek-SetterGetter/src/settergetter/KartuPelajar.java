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
public class KartuPelajar {
    //membuat variabel
    private String nisn;
    private String nama;
    private String ttl;
    private String jk;
    protected String alamat;
    
    Scanner I = new Scanner(System.in);//scanner
    
    //membuat method untuk mengisi variabel
    public void setNisn(){
        System.out.print("NISN\t: ");
        nisn = I.nextLine();
    }
    
    //membuat method untuk menyimpan isi variabel
    public String getNisn(){
        return nisn;
    }
    
    public void setNama(){
        System.out.print("Nama\t: ");
        nama = I.nextLine();
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTtl(){
        System.out.print("Ttl\t: ");
        ttl = I.nextLine();
    }
    
    public String getTtl(){
        return ttl;
    }
    
    public void setJk(){
        System.out.print("Jenis kelamin\t: ");
        jk = I.nextLine();
    }
    
    public String getJk(){
        return jk;
    }
    
    public void setAlamat(){
        System.out.print("Alamat\t: ");
        alamat = I.nextLine();
    }
    
    public String getAlamat(){
        return alamat;
    }
    
}
