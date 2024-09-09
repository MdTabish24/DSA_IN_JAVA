//Arraylists in java:
import java.util.*;
public class tabish{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println("Enter the size of array list:");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            li.add(sc.nextInt());
        }       
        System.out.println(li); 
        //Operations on Arraylists we can perform are:-
        //1.To get element
        int myelement = li.get(2);
        System.out.println("The elemennt at 2 index is:"+myelement);
        //2.Adding element in between:
        li.add(3, 69);
        System.out.println("The list after adding the element: "+li);
        //3.Set element with other element 
        li.set(1, 96);
        System.out.println("it will replace the element of 1st index to 96 "+ li);
        //4.Deleting element
        li.remove(0);
        System.out.println("The list after removing 0 index element"+li);
        //5.To calculate size 
        int mysize = li.size();
        System.out.println("The size of arraylist is:"+mysize);
        //6.Sorting 
        Collections.sort(li);
        System.out.println("The list after sorting is: "+li);
    }
}







