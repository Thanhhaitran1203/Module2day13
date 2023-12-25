import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi:");
//        String string = sc.nextLine();
        int[] string = {3, 10, 2, 1, 20};
        LinkedList<Integer> max = new LinkedList<>();
        for (int i = 0;i < string.length;i++) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(string[i]);
            for (int j = i + 1; j < string.length; j++) {
                if (string[j] > list.getLast()){
                    list.add(string[j]);
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.print(max);
    }
}