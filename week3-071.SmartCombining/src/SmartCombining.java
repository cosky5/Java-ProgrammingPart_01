import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    
    public static void smartCombine(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        
        int count = 0;
        while(count < secondList.size()){
            if(!firstList.contains(secondList.get(count))){
                firstList.add(secondList.get(count));
            }
            count++;
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
