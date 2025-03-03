package BKPM17_18_19_20;

public class DynamicDispatch_Tugas2 {

    public static void main(String[] args) {
        A_Method a = new A_Method();
        B_Method b = new B_Method();
        C_Method c = new C_Method();
        A_Method ref;

        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();

        ref = a;
        ref.callthis();
    }
}
