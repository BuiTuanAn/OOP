import java.util.*;

public class Appearances {

    public static <T> Map<T,Integer>  dem(Collection<T> b){
        Map<T,Integer> map = new HashMap<>();
        for(T t : b){
            if(map.containsKey(t)){
                map.put(t,map.get(t)+1);
            }
            else{
                map.put(t,1);
            }
        }
        return map;
    }
    public static <T> int sameCount(Collection<T> a, Collection<T> b) {
        Map<T,Integer> mapa = dem(a);
        Map<T,Integer> mapb = dem(b);
        int d=0;
        for(T t : mapa.keySet()){
            if(mapb.containsKey(t) && mapa.get(t)==mapb.get(t)){
                d=d+1;
            }
        }
        return d;



    }

}

