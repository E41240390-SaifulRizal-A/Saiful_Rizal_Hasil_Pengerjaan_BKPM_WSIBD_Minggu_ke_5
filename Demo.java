package BKPM17_18_19_20;

public class Demo {

    public static void main(String[] args) {
        A1_Prosker superOb = new A1_Prosker();
        B1_Prosker  subOb = new B1_Prosker ();

        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();

        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();
        
        // Member tambahasan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
