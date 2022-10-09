
public class ArraysDemo {

    public static void main(String[] args) {

        int a[] = new int[6];

        // reading leangth of arrays

        System.out.println("Array lenght is :" + a.length);

        // initializing an array

        int b[] = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        int specificNumber = 30;
        String specificString = "Charlie";

        // reading array value of array b[] using enhanced for loop
        for (int i : b) {
            System.out.println("I value of array b[] :" + i);

        }
        // reading array value of array b[] using for loop
        for (int j = 0; j < b.length; j++) {

            // sum = sum + b[j];
            sum += b[j];

        }
        // Printing sum of array
        System.out.println("Printing array sum :" + sum);

        // searching specific element in array

        for (int i : b) {
            if (i == specificNumber) {
                System.out.println("We go the number : " + i);
                break;
            }

        }
        // Creating a new array of Strings

        String c[] = { "Alpha", "Beta", "Charlie", "Delta" };
        // Printing length of string of array c[]

        System.out.println("Length of string array is :" + c.length);

        // Finding specific string in array using enhanced for loop

        for (String s : c) {
            if (s == specificString) {
                System.out.println(" String present in the array !!!" + s);
            }
        }
    }
}
