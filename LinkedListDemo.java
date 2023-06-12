import java.io.*;
import java.util.*;
public class LinkedListDemo {// implementing class of list<T>, allows duplicates
    public static void main(String[] args) throws IOException {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("India");
        l1.add("USA");
        l1.add("china");
        l1.add("Africa");

        System.out.println("List is "+l1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ele;
        int pos,choice =0;
        while(choice<4)
        {
            System.out.println("\nLINKEDLIST OPERATIONS");
            System.out.println("1. Add an element");// at position
            System.out.println("2. Remove an element"); //at postition
            System.out.println("3 Change an element");//element and position by l1.set
            System.out.println("4 Exit");

            System.out.println("Your choice ");
            choice = Integer.parseInt(br.readLine());

            switch (choice)
            {
                case 1:
                    System.out.print("Enter element ");
                    ele = br.readLine();
                    System.out.println("At which position");
                    pos = Integer.parseInt(br.readLine());
                    l1.add(pos-1,ele);
                    break;

                case 2:
                    System.out.println("Remove an element");
                    pos = Integer.parseInt(br.readLine());
                    l1.remove(pos-1);
                    break;

                case 3:
                    System.out.println("Enter position ");
                    pos = Integer.parseInt(br.readLine());
                    System.out.println("Enter new element");
                    ele = br.readLine();
                    l1.set(pos-1,ele);
                    break;

                default:return;
            }
            System.out.print("List is ");
            Iterator it = l1.iterator();// with the help of iterator4
            
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }

        }

    }
}
