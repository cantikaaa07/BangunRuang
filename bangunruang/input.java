
package bangunruang;
import java.util.Scanner;

public class input {
    public static void main (String[] args) {
        
        Scanner Scanner = new Scanner (System.in);
        
        BangunRuang BangunRuang = new BangunRuang ();
        Bola Bola = new Bola();
            System.out.println("Masukaan r");
            Bola.r = Scanner.nextFloat();
            
            Kubus Kubus = new Kubus ();
            System.out.println("Masukkan s");
            Kubus.s = Scanner.nextFloat();
            
            Balok Balok = new Balok ();
            System.out.print("masukkan p");
            Balok.p = Scanner.nextFloat();
            System.out.print("masukkan l");
            Balok.l = Scanner.nextFloat();
            System.out.print("masukka t");
            Balok.t = Scanner.nextFloat();
            
            LimasSegitiga LimasSegitiga = new LimasSegitiga();
            System.out.print("masukkan a");
            LimasSegitiga.a = Scanner.nextFloat();
            System.out.print("masukkan.ts");
            LimasSegitiga.ts = Scanner.nextFloat();
            System.out.print("masukkan tl");
            LimasSegitiga.tl = Scanner.nextFloat();
            System.out.print("masukkan tst");
            LimasSegitiga.tst = Scanner.nextFloat();
            
            
            BangunRuang volume;
            BangunRuang luasPermukaan;
            
            Bola.volume();
            Bola.luasPermukaan();
            
            Kubus.volume ();
            Kubus.luasPermukaan();
            
            Balok.volume ();
            Balok.luasPermukaan();
            
            LimasSegitiga.volume();
            LimasSegitiga.luasPermukaan();
            
     
    }
    
}
