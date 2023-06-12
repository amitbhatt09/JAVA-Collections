import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        //Create a hashset to store strings
        //Insertion order is not preserved and is implementation class of Set.
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("USA");
        hs.add("China");
        hs.add("Africa");

        System.out.println("Hash set = "+hs);

        //add an iterator to hs
        Iterator it = hs.iterator();

        //display element using iterator
        System.out.println("Elements using iterator: ");
        while(it.hasNext())
        {
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}
