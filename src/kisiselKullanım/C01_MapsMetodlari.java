package kisiselKullanım;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsMetodlari {
    public static void main(String[] args) {


        Map<String, Integer> mp1 = new HashMap<>();

        mp1.put("A" , 5);
        mp1.put("B" , 3);
        mp1.put("C" , 7);

        System.out.println(mp1.putIfAbsent("B", 6));
        System.out.println(mp1);


    }
}