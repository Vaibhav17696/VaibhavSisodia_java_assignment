package collectionex;

import java.util.*;
 
class ArrayListEx {
    public static void main(String[] args)
    {
 
        ArrayList<Integer> arrli = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
            arrli.add(i);
 
        System.out.println(arrli);
 
        arrli.remove(3);
 
        System.out.println(arrli);
 
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
        arrli.set(0, 130);
        
		System.out.println("\n" +arrli);
		System.out.println(arrli.size());
    }
}
