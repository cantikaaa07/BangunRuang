
package bangunruang;

public class LimasSegitiga {
    float a;
    float ts;
    float tl;
    float tst;
    
    float volume (){
        float volume = tl* (a*ts*1/2)* 1/3;
        System.out.println("volume LimasSegitiga"+volume);
        return volume;
    }
    float luasPermukaan (){
        float luasPermukaan = (3* (a*tst*1/2))+(a*ts*1/2);
        System.out.println("luasPermukaan LimasSegitiga"+luasPermukaan);
        return luasPermukaan ;
                
    }
}
