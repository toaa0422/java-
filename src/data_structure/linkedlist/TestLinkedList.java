package data_structure.linkedlist;



public class TestLinkedList {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Double[] floatArr={1.1,2.,3.,4.,5.};
        Integer[] intArr={1,2,3,4,5};
        printArray(floatArr);

    }
}
