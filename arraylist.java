import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(466);//add element

        System.out.println(list);

        //get op
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(0, 100);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));

        //add
        list2.add("hello");
        list2.add("world");
        System.out.println(list2);

        

    }

    
}
