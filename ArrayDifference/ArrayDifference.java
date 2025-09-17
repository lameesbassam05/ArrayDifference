import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter size of second array: ");
        int size2 = scanner.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = (int) (Math.random() * 100) * 2 + 1;
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = (int) (Math.random() * 100) * 2 + 1;
        }

        System.out.println("Array 1:" + Arrays.toString(arr1));
        System.out.println("Array 2:" + Arrays.toString(arr2));

        int[] difference = getDifference(arr1, arr2);
        System.out.println("Difference: " + Arrays.toString(difference));
    }

    public static int[] getDifference(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int num1 : arr1) {
            boolean existsInSecond = false;

            for (int num2 : arr2) {
                if (num1 == num2) {
                    existsInSecond = true;
                    break;
                }
            }
            if (!existsInSecond) {
                list.add(num1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}