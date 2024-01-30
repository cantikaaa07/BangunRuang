
package bangunruang;

public class Bola extends BangunRuang {
    float r;
    
    float volume (){
        float volume = (float)(Math.PI * r * r * r)* 4/3;
        System.out.println(" volume bola"+ volume);
        return volume;
    }
    float luasPermukaan (){
        float luasPermukaan = (float) (4 * Math.PI * r * r );
        System.out.println(" luasPermukaan bola: "+luasPermukaan);
        return luasPermukaan;
    }
    
}
