public class Demo075{
    public static void main(String[] args){
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Maximum number in array is: ");
        maxNum(array);
        printArray(array);
    }
    public static void maxNum(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++){
             for (int j=i+1;j<n;j++) {
                if (array[j]>array[i]) {
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
        }
    }
    }
    public static void printArray(int[] array) {
        for (int i=0;i<array.length;) {
            System.out.print(array[i]+" ");
            break;
        
    }
}
}