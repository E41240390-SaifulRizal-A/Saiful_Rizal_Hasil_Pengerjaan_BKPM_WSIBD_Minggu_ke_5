package BKPM17_18_19_20;

public class B1_Prosker extends A1_Prosker {

    int z;

    void TampilkanJumlah() {
        //subclass dapat mengakses member dari superclass
        System.out.println("Jumlah :" + (x + y + z));
    }
}