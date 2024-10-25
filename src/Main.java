public class Main {
    public static void main(String[] args) {

        int[] array = {2,6,2,7,9,4,6,2,8,7,1,2,9,10};

        printArray(array);
        countingSort(array,1,10);
        printArray(array);
    }
    public static void printArray(int[] array){

        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static void countingSort(int[] array,int min,int max){

        int[] countingArray = new int[max - min + 1];

        for(int i = 0;i<array.length;i++){
            countingArray[array[i] - min]++;
        }

        int index = 0;
        for(int i = min;i<=max;i++){
            while(countingArray[i-min] > 0){
                array[index++] = i;
                countingArray[i-min]--;
            }
        }
    }

}