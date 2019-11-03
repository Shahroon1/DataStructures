package academy.Map;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linked_HashMap
{
    public static void main(String[] args )
    {
        LinkedHashMap lmap = new LinkedHashMap();

        lmap.put("David",3400);
        lmap.put("Raven",2800);
        lmap.put("Feroz",4500);
        lmap.put("Trevor",3600);

        System.out.println(lmap);
    }
}
