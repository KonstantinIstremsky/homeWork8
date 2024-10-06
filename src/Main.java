import java.util.Arrays;
public void main(String[] args) {
    // task 1
    System.out.println("Task 1 and Task 2");
    byte[] arr1 = new byte[3];
    arr1[0] = 1;
    arr1[1] = 2;
    arr1[2] = 3;
    System.out.println(Arrays.toString(arr1));

    float[] arr2 = {1.57f, 7.654f, 9.986f};
    System.out.println(Arrays.toString(arr2));

    byte[] arr3 = {1, 7, 9};
    System.out.println(Arrays.toString(arr3));

    // task 3
    System.out.println("Task 3");

    StringBuilder result1 = new StringBuilder();
    for (int i = arr1.length - 1; i >= 0; i--) {
        result1.append(arr1[i]);
        if (i != 0) {
            result1.append(", ");
        }
    }
    System.out.println(result1.toString());

    StringBuilder result2 = new StringBuilder();
    for (int i = arr2.length - 1; i >= 0; i--) {
        result2.append(arr2[i]);
        if (i != 0) {
            result2.append(", ");
        }
    }
    System.out.println(result2.toString());

    StringBuilder result3 = new StringBuilder();
    for (int i = arr3.length - 1; i >= 0; i--) {
        result3.append(arr3[i]);
        if (i != 0) {
            result3.append(", ");
        }
    }
    System.out.println(result3.toString());

    // task 4
    System.out.println("Task 4");
    int [] arr = {1, 2, 3};
    for (int i = 0; i < arr.length; i++) {
       if (arr[i] % 2 != 0) {
           arr[i]++;
        }
    }
    for (int num : arr) {
        System.out.print(num + " ");
    }
}