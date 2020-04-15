package branching;

public class IfElse3 {
    public static void main(String[] args) {
        double hargaGundam = 500000;
        double isiDompet = 800000;

        if (isiDompet<hargaGundam){
            System.out.println("Uang anda sedang kekurangan gizi");
        }
        else if (isiDompet>hargaGundam){
            double uangkembali = isiDompet-hargaGundam;
            System.out.println("Uang cukup dengan kembalian sebesar :"+uangkembali);
        }
        else {
            System.out.println("Uang pas!");
        }
    }
}
