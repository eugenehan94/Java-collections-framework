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
import java.util.Deque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

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

        // Create Integer type stack
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

        // Create Queue using the LinkedList class
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
        System.out.println("Updated Queue: " + numbersQueue);

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
        System.out.println("Updated Queue: " + numbersPriorityQueue);

        System.out.println("-------------PriorityQueue--------------------");

        PriorityQueue<Integer> numbersPriorityQueue2 = new PriorityQueue<>();

        // Using the add() method
        numbersPriorityQueue2.add(4);
        numbersPriorityQueue2.add(2);
        System.out.println("Priority Queue: " + numbersPriorityQueue2);
        // Using the offer() method
        numbersPriorityQueue2.offer(1);
        System.out.println("Updated PriorityQueue: " + numbersPriorityQueue2);
        // Using the peek() method
        int numbersPriorityQueue2Peek = numbersPriorityQueue2.peek();
        System.out.println("Accessed Element: " + numbersPriorityQueue2Peek);
        // Using the remove() method
        boolean numbersPriorityQueue2Remove = numbersPriorityQueue2.remove(2);
        System.out.println("Is the element 2 removed? " + numbersPriorityQueue2Remove);
        // Using the poll() method
        int numbersPriorityQueue2Poll = numbersPriorityQueue2.poll();
        System.out.println("Removed Element using poll(): " + numbersPriorityQueue2Poll);

        numbersPriorityQueue2.add(2);
        numbersPriorityQueue2.add(1);
        System.out.println("PriorityQueue using iterator(): ");
        // Using the iterator() method
        Iterator<Integer> iterateNumbersPriorityQueue2 = numbersPriorityQueue2.iterator();
        while (iterateNumbersPriorityQueue2.hasNext()) {
            System.out.print(iterateNumbersPriorityQueue2.next());
            System.out.print(", ");
        }
        System.out.println();
        // Using the contains(element) method
        boolean containsNumberPriorityQueue2 = numbersPriorityQueue2.contains(2);
        System.out.println("Does PriorityQueue contains 2: " + containsNumberPriorityQueue2);
        // Using the size() method
        System.out.println("The size of PriorityQueue is: " + numbersPriorityQueue2.size());

        System.out.println("-------------Deque--------------------");
        // Array implementation of Deque
        Deque<String> animal1Deque = new ArrayDeque<>();
        // LinkedList implementation of Deque
        Deque<String> animal2Deque = new LinkedList<>();

        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbersDeque = new ArrayDeque<>();

        // add elements to the Deque
        numbersDeque.offer(1);
        numbersDeque.offerLast(2);
        numbersDeque.offerFirst(3);
        System.out.println("Deque: " + numbersDeque);

        // Access elements of the Deque
        int firstElementDeque = numbersDeque.peekFirst();
        System.out.println("First element of Deque: " + firstElementDeque);
        int lastElementDeque = numbersDeque.peekLast();
        System.out.println("Last element of Deque: " + lastElementDeque);
        // Remove elements from the Deque
        int removedNumber1Deque = numbersDeque.pollFirst();
        System.out.println("Removed first element of Deque: " + removedNumber1Deque);
        int removedNumber2Deque = numbersDeque.pollLast();
        System.out.println("Removed last element of Deque: " + removedNumber2Deque);
        System.out.println("Updated Deque: " + numbersDeque);

        System.out.println("-------------LinkedList--------------------");

        // Create Integer type linked list
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        // Create String type linked list
        LinkedList<String> stringLinkedList = new LinkedList<>();

        LinkedList<String> animalsLinkedList2 = new LinkedList<>();
        // Add elements to Linked list
        animalsLinkedList2.add("Dog");
        animalsLinkedList2.add("Cat");
        animalsLinkedList2.add("Cow");
        System.out.println("LinkedList: " + animalsLinkedList2);

        // add() method with the index parameter
        animalsLinkedList2.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animalsLinkedList2);

        LinkedList<String> languagesLinkedList = new LinkedList<>();
        languagesLinkedList.add("Python");
        languagesLinkedList.add("Java");
        languagesLinkedList.add("JavaScript");
        languagesLinkedList.add("C");
        System.out.println("LinkedList: " + languagesLinkedList);
        // get the element from the linked list
        String strLinkedList = languagesLinkedList.get(1);
        System.out.println("Element at index 1 is: " + strLinkedList);
        // change elements at index 3
        languagesLinkedList.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languagesLinkedList);
        // remove elements from index 1
        String strLanguagesLinkedList = languagesLinkedList.remove(1);
        System.out.println("Removed element: " + strLanguagesLinkedList);
        System.out.println("Updated LinkedList:  " + languagesLinkedList);
        // using contains() - checks if the linkedlist contains the elements
        boolean linkedListContains = languagesLinkedList.contains("Kotlin");
        System.out.println("Contains element 'Java': " + linkedListContains);
        // using indexOf() - returns the index of the first occurrance of the element
        int linkedListIndexOf = languagesLinkedList.indexOf("JavaScript");
        System.out.println("The index of JavaScript: " + linkedListIndexOf);
        // using lastIndexOf() - returns the index of the last occurrance of the element
        int lastIndexOfLinkedList = languagesLinkedList.lastIndexOf("JavaScript");
        System.out.println("The last index of JavaScript: " + lastIndexOfLinkedList);

        System.out.println("-------------LinkedList as Queue--------------------");
        Queue<String> languagesLinkedListQueue = new LinkedList<>();
        // add elements
        languagesLinkedListQueue.add("Python");
        languagesLinkedListQueue.add("Java");
        languagesLinkedListQueue.add("C");
        languagesLinkedListQueue.add("JavaScript");
        System.out.println("LinkedList Queue: " + languagesLinkedListQueue);
        // access the first element
        String strLanguagesLinkedListQueue = languagesLinkedListQueue.peek();
        System.out.println("Accessed element: " + strLanguagesLinkedListQueue);
        // access and remove the first element
        String pollLanguagesLinkedListQueue = languagesLinkedListQueue.poll();
        System.out.println("Removed element: " + pollLanguagesLinkedListQueue);
        System.out.println("Linkedlist after poll(): " + languagesLinkedListQueue);
        // add element at the end
        languagesLinkedListQueue.offer("Swift");
        System.out.println("LinkedList after offer(): " + languagesLinkedListQueue);

        System.out.println("-------------LinkedList as Deque--------------------");

        Deque<String> animalsDequeLinkedList = new LinkedList<>();
        // add elements at the beginning
        animalsDequeLinkedList.add("Cow");
        System.out.println("Linkedlist: " + animalsDequeLinkedList);
        animalsDequeLinkedList.addFirst("Dog");
        System.out.println("Linkedlist after addFirst(): " + animalsDequeLinkedList);
        // add elements at the end
        animalsDequeLinkedList.addLast("Zebra");
        System.out.println("Linkedlist after addLast(): " + animalsDequeLinkedList);
        // remove the first element
        animalsDequeLinkedList.removeFirst();
        System.out.println("Linkedlist after removeFirst(): " + animalsDequeLinkedList);
        // remove the last element
        animalsDequeLinkedList.removeLast();
        System.out.println("Linkedlist after removeLast(): " + animalsDequeLinkedList);
        // iteration through linkedlist
        animalsDequeLinkedList.add("Cat");
        animalsDequeLinkedList.add("Dog");
        System.out.println("Deque linkedlist: " + animalsDequeLinkedList);
        for (String animal : animalsDequeLinkedList) {
            System.out.print(animal);
            System.out.print(", ");
        }
        System.out.println();

        System.out.println("-------------ArrayDeque--------------------");
        // ArrayDeque<Type> animal = new ArrayDeque<>();

        ArrayDeque<String> animalsArrayDeque = new ArrayDeque<>();
        // using add()
        animalsArrayDeque.add("Dog");
        // using addFirst()
        animalsArrayDeque.addFirst("Cat");
        // using addLast()
        animalsArrayDeque.addLast("Horse");
        System.out.println("ArrayDeque: " + animalsArrayDeque);
        ArrayDeque<String> animalsArrayDeque2 = new ArrayDeque<>();
        // using offer()
        animalsArrayDeque2.offer("Dog");
        // using offerFirst()
        animalsArrayDeque2.offerFirst("Cat");
        // using offerLast();
        animalsArrayDeque2.offerLast("Horse");
        System.out.println("ArrayDeque2: " + animalsArrayDeque2);

        // get the first element
        String firstAnimalsArrayDeque = animalsArrayDeque.getFirst();
        System.out.println("First element: " + firstAnimalsArrayDeque);
        // get the last element
        String lastAnimalsArrayDeque = animalsArrayDeque.getLast();
        System.out.println("Last element: " + lastAnimalsArrayDeque);
        // using peek()
        String peekAnimalsArrayDeque = animalsArrayDeque.peek();
        System.out.println("Head element: " + peekAnimalsArrayDeque);
        // using peekFirst()
        String firstElementAnimalsArrayDeque = animalsArrayDeque.peekFirst();
        System.out.println("First element: " + firstElementAnimalsArrayDeque);
        // using peekLast()
        String lastElementAnimalsArrayDeque = animalsArrayDeque.peekLast();
        System.out.println("Last element: " + lastElementAnimalsArrayDeque);

        animalsArrayDeque.add("Cow");
        System.out.println("ArrayDeque: " + animalsArrayDeque);
        // using remove()
        String removeAnimalsArrayDeque = animalsArrayDeque.remove();
        System.out.println("Removed element: " + removeAnimalsArrayDeque);
        System.out.println("New ArrayDeque: " + animalsArrayDeque);
        // using removeFirst()
        String firstElementRemovedAnimalsArrayDeque = animalsArrayDeque.removeFirst();
        System.out.println("Removed first element: " + firstElementRemovedAnimalsArrayDeque);
        // using removeLast()
        String lastElementRemovedAnimalsArrayDeque = animalsArrayDeque.removeLast();
        System.out.println("Removed last element: " + lastElementRemovedAnimalsArrayDeque);
        animalsArrayDeque.clear();

        animalsArrayDeque.add("Dog");
        animalsArrayDeque.add("Cat");
        animalsArrayDeque.add("Cow");
        animalsArrayDeque.add("Horse");
        System.out.println("ArrayDeque: " + animalsArrayDeque);
        // using poll()
        String pollAnimalsArrayDeque = animalsArrayDeque.poll();
        System.out.println("Removed element: " + pollAnimalsArrayDeque);
        System.out.println("New ArrayDeque: " + animalsArrayDeque);
        // using pollFirst()
        String pollFirstAnimalsArrayDeque = animalsArrayDeque.pollFirst();
        System.out.println("Removed first element: " + pollFirstAnimalsArrayDeque);
        // using pollLast()
        String pollLastAnimalsArrayDeque = animalsArrayDeque.pollLast();
        System.out.println("Removed last element: " + pollLastAnimalsArrayDeque);
        animalsArrayDeque.clear();

        animalsArrayDeque.add("Dog");
        animalsArrayDeque.add("Cat");
        animalsArrayDeque.add("Horse");
        System.out.print("ArrayDeque: ");
        // using iterator()
        Iterator<String> iterateAnimalsArrayDeque = animalsArrayDeque.iterator();
        while (iterateAnimalsArrayDeque.hasNext()) {
            System.out.print(iterateAnimalsArrayDeque.next());
            System.out.print(", ");
        }
        System.out.print("\nArrayDeque in reverse order: ");
        // using descendingIterator()
        Iterator<String> desIterator = animalsArrayDeque.descendingIterator();
        while (desIterator.hasNext()) {
            System.out.print(desIterator.next());
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("-------------Blocking Queue--------------------");
        // Array implementation of BlockingQueue
        // BlockingQueue<String> animal1 = new ArrayBlockingQueue<>();
        // LinkedList implementation of BlockingQueue
        // BlockingQueue<String> animal2 = new LinkedBlockingQueue<>();

        // Create a blocking queue using the ArrayBlockingQueue
        BlockingQueue<Integer> numbersBlockingQueue = new ArrayBlockingQueue<>(5);
        try {
            // Insert element to blocking queue
            numbersBlockingQueue.put(2);
            numbersBlockingQueue.put(1);
            numbersBlockingQueue.put(3);
            System.out.println("BlockingQueue: " + numbersBlockingQueue);

            // Remove elements from blocking queue
            int removedNumberBlockingQueue = numbersBlockingQueue.take();
            System.out.println("Removed Number: " + removedNumberBlockingQueue);
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println("-------------ArrayBlockingQueue--------------------");
        // ArrayBlockingQueue<Type> animal = new ArrayBlockingQueue<>(int capacity);
        // Creating String type ArrayBlockingQueue with size 5
        // ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
        // Creating Integer type ArrayBlockingQueue with size 5
        // ArrayBlockingQueue<Integer> age = new ArrayBlockingQueue<>(5);

        ArrayBlockingQueue<String> animalsArrayBlockingQueue = new ArrayBlockingQueue<>(5);
        // Using add()
        animalsArrayBlockingQueue.add("Dog");
        animalsArrayBlockingQueue.add("Cat");
        // Using offer()
        animalsArrayBlockingQueue.offer("Horse");
        System.out.println("ArrayBlockingQueue: " + animalsArrayBlockingQueue);
        // Using peek()
        String peekAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.peek();
        System.out.println("Accessed element: " + peekAnimalsArrayBlockingQueue);
        // Using iterator()
        Iterator<String> iterateAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.iterator();
        System.out.print("ArrayBlockingQueue elements: ");
        while (iterateAnimalsArrayBlockingQueue.hasNext()) {
            System.out.print(iterateAnimalsArrayBlockingQueue.next());
            System.out.print(", ");
        }
        System.out.println();
        // Using remove()
        String removeAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.remove();
        System.out.println("Remove Element: ");
        System.out.println("Using remove(): " + removeAnimalsArrayBlockingQueue);
        // Using poll()
        String pollAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.poll();
        System.out.println("Using poll(): " + pollAnimalsArrayBlockingQueue);
        // Using clear()
        animalsArrayBlockingQueue.clear();
        System.out.println("Updated ArrayBlockingQueue: " + animalsArrayBlockingQueue);

        try {
            // Using put() - to add elements
            animalsArrayBlockingQueue.add("Dog");
            animalsArrayBlockingQueue.add("Cat");
            System.out.println("ArrayBlockingQueue: " + animalsArrayBlockingQueue);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            // Remove element with take()
            String takeAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.take();
            System.out.println("Remove element: " + takeAnimalsArrayBlockingQueue);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-------------LinkedBlockingQueue--------------------");
        // LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>(int capacity);
        // Create String type LinkedBlockingQueue with size 5
        // LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);
        // Create Integer type LinkedBlockingQueue with size 5
        // LinkedBlockingQueue<Integer> age = new LinkedBlockingQueue<>(5);

        LinkedBlockingQueue<String> animalsLinkedBlockingQueue = new LinkedBlockingQueue<>(5);
        // using add()
        animalsLinkedBlockingQueue.add("Dog");
        animalsLinkedBlockingQueue.add("Cat");
        // using offer()
        animalsLinkedBlockingQueue.offer("Horse");
        System.out.println("LinkedBlockingQueue: " + animalsLinkedBlockingQueue);
        // using peek()
        String peekAnimalsLinkedBlockingQueueElement = animalsLinkedBlockingQueue.peek();
        System.out.println("Accessed element: " + peekAnimalsLinkedBlockingQueueElement);
        // using iterator()
        Iterator<String> iterateAnimalsLinkedBlockingQueue = animalsLinkedBlockingQueue.iterator();
        System.out.print("LinkedBlockingQueue: elements: ");
        while (iterateAnimalsLinkedBlockingQueue.hasNext()) {
            System.out.print(iterateAnimalsLinkedBlockingQueue.next());
            System.out.print(", ");
        }
        // using remove()
        String removeAnimalsLinkedBlockingQueue = animalsLinkedBlockingQueue.remove();
        System.out.println("Using remove(): " + removeAnimalsLinkedBlockingQueue);
        // using poll()
        String pollAnimalsLinkedBlockingQueue = animalsLinkedBlockingQueue.poll();
        System.out.println("Using poll(): " + pollAnimalsLinkedBlockingQueue);
        // using clear()
        animalsLinkedBlockingQueue.clear();
        System.out.println("Update LinkedBlockingQueue " + animalsLinkedBlockingQueue);

        try {
            // Add elements to animals
            animalsArrayBlockingQueue.put("Dog");
            animalsArrayBlockingQueue.put("Cat");
            animalsArrayBlockingQueue.put("Horse");
            System.out.println("LinkedBlockingQueue: " + animalsArrayBlockingQueue);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String takeAnimalsArrayBlockingQueue = animalsArrayBlockingQueue.take();
            System.out.println("Removed element: " + takeAnimalsArrayBlockingQueue);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-------------Map--------------------");
        // Map implementation using HashMap
        // Map<Key, Value> numbers = new HashMap<>();

        // Creating a map using the HashMap
        Map<String, Integer> numbersMap = new HashMap<>();
        // insert elements to the map
        numbersMap.put("One", 1);
        numbersMap.put("Two", 2);
        System.out.println("Map: " + numbersMap);
        // access keys of the map
        System.out.println("Keys: " + numbersMap.keySet());
        // access values of the map
        System.out.println("Values: " + numbersMap.values());
        // access entries of the map
        System.out.println("Entries: " + numbersMap.entrySet());
        // remove Elements from the map
        int valueRemove = numbersMap.remove("Two");
        System.out.println("Removed value: " + valueRemove);

        // create Map using TreeMap
        Map<String, Integer> valuesMap = new TreeMap<>();
        // insert elements to map
        valuesMap.put("Second", 2);
        valuesMap.put("First", 1);
        System.out.println("Map using TreeMap: " + valuesMap);
        // replacing the values
        valuesMap.replace("First", 11);
        valuesMap.replace("Second", 22);
        System.out.println("New Map: " + valuesMap);
        // remove elements from the Map
        int removedMapValue = valuesMap.remove("First");
        System.out.println("Removed value: " + removedMapValue);

        System.out.println("-------------HashMap--------------------");
        // HashMap<K, V> numbers = new HashMap<>();
        // HashMap<String, Integer> numbers = new HashMap<>();

        // create a hashmap
        HashMap<Integer, String> languagesHashMap = new HashMap<>();
        languagesHashMap.put(1, "Java");
        languagesHashMap.put(2, "Python");
        languagesHashMap.put(3, "JavaScript");
        System.out.println("HashMap: " + languagesHashMap);
        // get() method to get value
        String getLanguagesHashMap = languagesHashMap.get(2);
        System.out.println("Value at index 1: " + getLanguagesHashMap);
        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + languagesHashMap.keySet());
        // return set view of values
        // using values()
        System.out.println("Values: " + languagesHashMap.values());
        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languagesHashMap.entrySet());

    }
}
