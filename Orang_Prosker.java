package BKPM17_18_19_20;

public class Orang_Prosker {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang_Prosker (String nama, double tinggi, double berat){
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    }
    
    public String toString() {
    return ("Nama : "+nama+"\nTinggi :"+ tinggi + "\nBerat :"+berat);
    }   
}