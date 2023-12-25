import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        int value = sc.nextInt();
        int[] arr = {1,0,5,2,9,8,4,7,3,6};
        if(linearSearch(arr,value) != -1) {
            System.out.println("Vị trí của "+value+" là "+linearSearch(arr, value));
        }else System.out.println("Không tìm thấy "+value+" trong mảng");
    }
    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
