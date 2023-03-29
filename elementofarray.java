package arrayofelement;

public class elementofarray {
    public static void main(String[] args) {

        // create an array
        int[] array = { 1, 2, 3, 4, 5 };

        // getting array length
        int length = array.length;

        // default sium value.
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : "+average);

    }

}


