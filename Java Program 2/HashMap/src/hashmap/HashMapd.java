package hashmap;
import java.util.*;
public class HashMapd {
      public static void main(String[] args) {
      HashMap<String,Double> hm=new HashMap<String,Double>();      
      hm.put("Zara",3434.34);
      hm.put("Mahnaz",123.22);
      hm.put("Ayan",1378.00);
      hm.put("Daisy",99.22);
      hm.put("Qadir",-19.08);   
      Set set = hm.entrySet();
      Iterator i = set.iterator();
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      double balance = ((Double)hm.get("Zara")).doubleValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " +hm.get("Zara"));
    }
}
