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
public class EKtp {
    //membuat variabel
    private String nik;
    private String nama;
    private String ttl;
    private String jk;
    protected String rt;
    protected String ds;
    protected String kec;
    protected String agama;
    protected String K;
    
    Scanner I = new Scanner(System.in);//scanner
    
    //mthod untuk mengisikan variabel
    public void setNik(){
        System.out.print("NIK\t: ");
        nik = I.nextLine();
    }
    
    //method untuk menyimpan isi variabel
    public String getNik(){
        return nik;
    }
    
    public void setNama(){
        System.out.print("Nama\t: ");
        nama = I.nextLine();
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTtl(){
        System.out.print("TTL\t: ");
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
    
    public void setRtRw(){
        System.out.print("Rt/Rw\t: ");
        rt = I.nextLine();
    }
    
    public String getRtRw(){
        return rt;
    }
    
    public void setDs(){
        System.out.print("Desa/Kel: ");
        ds = I.nextLine();
    }
    
    public String getDs(){
        return ds;
    }
    
    public void setKec(){
        System.out.print("Kec\t: ");
        kec = I.nextLine();
    }
    
    public String getKec(){
        return kec;
    }
    
    public void setAgama(){
        System.out.print("Agama\t: ");
        agama = I.nextLine();
    }
    
    public String getAgama(){
        return agama;
    }
    
    public void setKwrg(){
        System.out.print("Kewarganegaraan\t: ");
        K = I.nextLine();
    }
    
    public String getKwrg(){
        return K;
    }
}