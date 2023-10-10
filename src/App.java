import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;


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

        System.out.println("-------------ArrayList--------------------");

        // Create ArrayList
        ArrayList<String> languages = new ArrayList<>();
        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        languages.add("C");
        System.out.println("ArrayList: " + languages);
        // Add element at a specific position in ArrayList
        languages.add(1, "JavaScript");
        languages.add(3, "C++");
        // Get element from the arrayList
        String str2 = languages.get(2);
        System.out.println("Element at index 2: " + str2);
        // Change the element of the arrayList
        languages.set(5, "Kotlin");
        System.out.println("Modified ArrayList: " + languages);
        // Remove element from index 3
        String removeStr3 = languages.remove(3);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + removeStr3);
        // Iterate using for-each loop
        System.out.println("Accessing individual elements: ");
        for (String lang : languages) {
            System.out.print(lang);
            System.out.print(", ");
        }
        System.out.println();
        // Size of the arrayList
        System.out.println("Size of ArrayList: " + languages.size());
        // Sort the arrayList
        System.out.println("Unsorted ArrayList: " + languages);
        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + languages);
        // Sort the arrayList - reverseOrder
        languages.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList reverseOrder: " + languages);
        // Create a new ArrayList with the same element, size and capacity.
        // Shallow copy
        ArrayList<String> cloneLanguages = (ArrayList<String>) languages.clone();
        System.out.println("Cloned ArrayList: " + cloneLanguages);
        // Check if ArrayList contains a specific element
        System.out.println("Is Java present in arrayList: " + languages.contains("Java"));
        // Check if ArrayList is empty
        boolean isEmptyResult = languages.isEmpty();
        System.out.println("Is the ArrayList empty: " + isEmptyResult);
        // Searches a specified element in an arraylist and returns the index of the
        // element.
        int javascriptPosition = languages.indexOf("JavaScript");
        System.out.println("First Occurrence of JavaScript: " + javascriptPosition);

        System.out.println("-------------Vector--------------------");
        // Vector<Type> vector = new Vector<>();

        // Create Integer type vector
        Vector<Integer> vectorInt = new Vector<>();
        // Create String type vector
        Vector<String> vectorStr = new Vector<>();

        Vector<String> mammals = new Vector<>();
        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        // Using the add() method with index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
        // Using addAll() - adds all elements of a vector to another vector
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        // using get(index) - returns an element specified by the index
        String elementAtTwo = animals.get(2);
        System.out.println("Element at index 2: " + elementAtTwo);
        // using iterator() - returns an iterator object to sequentially access vector
        // elements
        Iterator<String> iterateAnimal = animals.iterator();
        System.out.print("Vector: ");
        while (iterateAnimal.hasNext()) {
            System.out.print(iterateAnimal.next());
            System.out.print(", ");
        }
        System.out.println();
        // Using size() - returns the size of the vector
        System.out.println("Vector size: " + animals.size());
        // Using remove(index) - removes an element from specified position
        String elementRemoveAnimal = animals.remove(0);
        System.out.println("Removed element: " + elementRemoveAnimal);
        System.out.println("New Vector: " + animals);
        // using clear() - removes all elements. It is more efficient than removeAll()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);

        System.out.println("-------------Vector--------------------");

        //Create Integer type stack
        Stack<Integer> stacksInteger = new Stack<>();
        // Create String type stack
        Stack<String> stacksString = new Stack<>();

        Stack<String> animalsStack = new Stack<>();
        // Add element to Stack
        animalsStack.push("Dog");
        animalsStack.push("Horse");
        animalsStack.push("Cat");
        System.out.println("Stack: " + animalsStack);

        // Remove element from Stack
        String removeStackElement = animalsStack.pop();
        System.out.println("Removed Element: " + removeStackElement);

        // The peek() method returns an object from the top of the stack
        String peekStackElement = animalsStack.peek();
        System.out.println("Element at top: " + peekStackElement);

        animalsStack.push("Cat");
        animalsStack.push("Bird");
        animalsStack.push("Fish");

        // To search an element in the stack, we use the search() method
        int positionOfCat = animalsStack.search("Cat");
        System.out.println("Position of Cat: " + positionOfCat);
        // Check if Stack is empty
        boolean animalStackEmptyResult = animalsStack.empty();
        System.out.println("Is the stack empty: " + animalStackEmptyResult);
    
        System.out.println("-------------Queue--------------------");

        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();
        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();
        // Priority queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();

        //Create Queue using the LinkedList class
        Queue<Integer> numbersQueue = new LinkedList<>();
        // offer elements to the Queue
        numbersQueue.offer(1);
        numbersQueue.offer(2);
        numbersQueue.offer(3);
        System.out.println("Queue: " + numbersQueue);
        // Access elements of the Queue
        int accessedQueueNumber = numbersQueue.peek();
        System.out.println("Accessed element: " + accessedQueueNumber);
        // Remove elements from the Queue
        int removedQueueNumber = numbersQueue.poll();
        System.out.println("Removed element: " + removedQueueNumber);
        System.out.println("Updated Queue: "+ numbersQueue);


        // Create Queue using the PriorityQueue class:
        Queue<Integer> numbersPriorityQueue = new PriorityQueue<>();
        
        // Offer elements to the Queue
        numbersPriorityQueue.offer(5);
        numbersPriorityQueue.offer(1);
        numbersPriorityQueue.offer(2);
        System.out.println("Queue: " + numbersPriorityQueue);
        // Access elements of the Queue
        int accessedPriorityQueue = numbersPriorityQueue.peek();
        System.out.println("Accessed element: " + accessedPriorityQueue);
        // Remove elements from the Queue
        int removedPriorityQueue = numbersPriorityQueue.poll();
        System.out.println("Removed Element: " + removedPriorityQueue);
    }
}
