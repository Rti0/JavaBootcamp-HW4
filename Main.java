import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
 public static void main(String[] args) {


//        1.Write a Java program to test if the first and the last element of an array of integers are same.
//        The length of the array must be greater than or equal to 2
    int[] Arr = {50, -20, 0, 30, 40, 60, 10};

    System.out.println(Arr.length >= 2 && Arr[0] == Arr[Arr.length - 1]);
  }
}
//       2. Write a Java program to find the k largest elements in a given array.
//       Elements in the array can be in any order.

//    Integer line[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//        System.out.println("Original Array: ");
//        System.out.println(Arrays.toString(line));
//        System.out.println(k +" largest elements of the said array are:");
//        Arrays.sort(line, Collections.reverseOrder());
//        for (int i = 0; i < k; i++)
//            System.out.print(line[i] + " ");}}
// 3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
//    int numbers[] = new int[]{1, 4, 17, 7, 25, 3, 100};
//    int sum = 0;
//    System.out.println(Arrays.toString(numbers));
//    System.out.println(sum + " largest elements of the said array are:");
//    for (int i = 0; i < numbers.length; i++) {
//      sum = sum + numbers[i];
//    }
//    double average = sum / numbers.length;
//    System.out.println("The average of the said array is: " + average);
//    System.out.println("The numbers in the said array that are greater than the average are: ");
//    for (int i = 0; i < numbers.length; i++) {
//      if (numbers[i] > average) {
//        System.out.println(numbers[i]);
//      }
//    }
//  }
//}
//        4.Write a Java program to get the larger value between first and last element of an array of integers.
//        int[] num = {20, 30, 40};
//        System.out.println("Original Array:" + Arrays.toString(num));
//        int larg_val = num[0];
//        if (num[2] >= larg_val) ;
//        {
//          larg_val = num[2];
//            System.out.println("Larger value between first and last element:" + larg_val);
//
//        }
//    }}

//5.Write a Java program to swap the first and last elements of an array and create a new array.
//        int[] swapping = {20, 30, 40};
//        System.out.println("Original Array: "+Arrays.toString(swapping));
//        int x = swapping[0];
//   swapping[0] = swapping[swapping.length-1];
//   swapping[swapping.length-1] = x;
//        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(swapping));
//    }}
//6.Write a Java program to find all of the longest word in a given dictionary.


//          static ArrayList<String> longestWords(String[] data) {
//              ArrayList<String> list = new ArrayList<String>();
//              int l1 = 0;
//              for (String str : data) {
//                  int length = str.length();
//                  if (length > l1) {
//                      l1 = length;
//                      list.clear();
//                  }
//                  if (length == l1 ){
//                      list.add(str);
//                  }
//              }
//              return list;
//          }
//
//          public static void main(String[] args) {
//              String [] data = {"cat", "dog", "red", "is", "am"};
//              System.out.println(Arrays.toString(data));
//              System.out.println(longestWords(data));
//          }
//      }

//}
//    8. Write a program thats displays the number of occurrences of an element in the array.
//    int[] arr = {1, 1, 1, 3, 3, 5};
//     HashMap<Integer, Integer> countMap = new HashMap<>();
//     for (int ele : arr) {
//     if (countMap.containsKey(ele)) {
//     countMap.put(ele, countMap.get(ele) + 1);
//     } else {
//       countMap.put(ele, 1);
//     }         }
//     for (int ele : countMap.keySet()) {
//     int count = countMap.get(ele);
//     System.out.printf("%d occurs %d time%s\n", ele, count, count > 1 ? "s" : "");
//     }     }
//}
//9. Write a program that places the odd elements of an array before the even elements.
//    int[] arr = {2,3,40,1,5,9,4,10,7};
//    int left = 0;
//    int right = arr.length - 1;
//
//     while (left < right) {
//
//     while (arr[left] % 2 != 0 && left < right) left++;
//
//     while (arr[right] % 2 == 0 && left < right) right--;
//
//     if (left < right) {
//     int arr2 = arr[left];
//     arr[left] = arr[right];
//     arr[right] = arr2;
//     }         }
//
//     System.out.println(Arrays.toString(arr));
//  }
//}
//    10. Write a program that test the equality of two arrays.
//    int[] a1 = {2, 3, 6, 6, 4};
//    int[] a2 = {2, 3, 6, 6, 4};
//    boolean isEqual = true;
//    if (a1.length != a2.length) {
//      isEqual = false;
//    } else {
//      for (int i = 0; i < a1.length; i++) {
//        if (a1[i] != a2[i]) {
//          isEqual = false;
//          break;
//        }
//      }
//    }
//    System.out.println(isEqual);
//  }
//}