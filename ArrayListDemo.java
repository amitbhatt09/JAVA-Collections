import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {//Implementing class of list<t> interface, it allows duplicates
                            // and insertion order is also preserved
 public static void main(String[] args) {
     ArrayList<String> ar1 = new ArrayList<>();
     ar1.add("Apple");
     ar1.add("mangoes");
     ar1.add("Guava");
     ar1.add("Papaya");

     System.out.println("Contents are "+ar1);
     ar1.remove(2);
     System.out.println("Content after removing is "+ar1);

     ar1.indexOf("Apple");
     System.out.println("Size of arrayList "+ar1.size());

     Iterator it = ar1.iterator();
     while(it.hasNext())
         System.out.println(it.next());
   }
}
