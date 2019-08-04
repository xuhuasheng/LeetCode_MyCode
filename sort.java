
public class sort {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 6, 3, 7, 5, 9, 0};
        System.out.println("需要排序的数字序列：");
        sortMethod.displayArray(arr);
        System.out.println("选择排序法：");
        sortMethod.displayArray(sortMethod.selectSort(arr));
        System.out.println("冒泡排序法：");
        sortMethod.displayArray(sortMethod.bubbleSort(arr));
    }
}

class sortMethod {
    public static int[] selectSort(int[] arr) {
        int[] sortedArray = arr;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }                    
            }
        }
        return sortedArray;
    }

    public static int[] bubbleSort(int[] arr) {
        int[] sortedArray = arr;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void displayArray(int[] arr) {
        System.out.print("sorted array is:[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length-1] + "]\n");
    }
}
