public class Solution {
    static <T> void printArray(T[] tab) {
        for (T t : tab)
            System.out.println(t);
    }

    public static void main(String[] args) {
        Integer[] arrInt = new Integer[]{1,2,3};
        String[] arrStr = new String[]{"Hello", "World"};

        printArray(arrInt);
        printArray(arrStr);
    }
}