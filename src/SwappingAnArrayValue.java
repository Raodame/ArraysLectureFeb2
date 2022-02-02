public class SwappingAnArrayValue {
    public static void main(String[] args) {

        int[] array = {102, 11, 388, 41, 599, -51, -4, -23};
        printArray(array);
        sortArray(array);
        printArray(array);
    }

    public static void sortArray(int[] array){
        int temp;
        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array.length - 1; y++){
                if (array[y] > array[y + 1]) {
                    temp = array[y + 1];
                    array[y + 1] = array[y];
                    array[y] = temp;
                }
            }
        }

    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int x = 0; x < array.length; x++) {
            System.out.print(" " + array[x]);
            if (x < array.length - 1)
                System.out.print(",");
        }
        System.out.println(" ]");
    }
}