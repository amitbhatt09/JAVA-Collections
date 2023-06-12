import java.io.*;
import java.util.*;
public class StackDemo {// LIFO and allows Duplicates values and is implementing class of List<t> interface
    public static void main(String[] args) throws Exception{
        Stack<Integer> st = new Stack<>();

        int choice =0;
        int pos,ele;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(choice<4)
        {
            System.out.println("STACK OPERATIONS");
            System.out.println("1 Push an element");
            System.out.println("2 Pop an element");
            System.out.println("3 Search an element");
            System.out.println("4 Exit");
            System.out.print("Your choice: ");

            choice = Integer.parseInt(br.readLine());

            switch (choice)
            {
                case 1:
                    System.out.println("Enter element");
                    ele = Integer.parseInt(br.readLine());
                    //int type element is converted into Integer object and then pushed into stack
                    st.push(ele);
                    break;

                case 2:

                    Integer obj = st.pop();
                    System.out.println("Popped element is "+obj);
                    break;

                case 3:
                    System.out.println("Enter element to search");
                    ele = Integer.parseInt(br.readLine());
                    pos = st.search(ele);
                    if(pos==-1)
                        System.out.println("Element not found");
                    else System.out.println("Position is "+pos);
                    break;

                default:
                    return;
            }
            //view contents of stack
            System.out.println("Stack contents : "+st);
        }


    }
}
