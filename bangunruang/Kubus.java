
package bangunruang;

public class Kubus extends BangunRuang  {
    float s;
    
    float volume (){
        float volume = s*s*s;
        System.out.println("volume kubus"+volume);
        return volume;
    }
    float luasPermukaan (){
        float luasPermukaan = 6*s*s ;
        System.out.println("luasPermukaan kubus"+luasPermukaan);
        return luasPermukaan;
    }

    
 
    
    
        
         
    
    
}
