public class Demo074 {
    public static void main(String[] args) {
        int[] array={64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted array: ");
        bubbleSort(array);
        printArray(array);
    }
    public static void bubbleSort(int[] array) {
        int n=array.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1;j<n;j++) {
                if (array[i]>array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}