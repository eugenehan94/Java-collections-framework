import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new Stack<>();

        // Creating list using the ArrayList class
        List<Integer> numbersArrayList = new ArrayList<>();
        // Add elements to the list
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        System.out.println("List: " + numbersArrayList);
        // Access element from the list
        int numbersIndexOne = numbersArrayList.get(1);
        System.out.println("Accessed Element: " + numbersIndexOne);
        // Remove element from the list
        int removeNumbersIndexOne = numbersArrayList.remove(1);
        System.out.println("Removed Element:  " + removeNumbersIndexOne);
        // Get the length of list
        System.out.println("Length of list: " + numbersArrayList.size());
        // returns "true" if a list contains specific element
        System.out.println("If it contains specified element: " + numbersArrayList.contains(4));
        // Traversing list through Iterator
        Iterator<Integer> itr = numbersArrayList.iterator();
        while (itr.hasNext()) {
            System.out.println("Iterator: " + itr.next());
        }

    }
}
