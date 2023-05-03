import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
  public static void main(String[] args) {


//        1.Write a Java program to test if the first and the last element of an array of integers are same.
//        The length of the array must be greater than or equal to 2
//      int[] numbers = {50, -20, 0, 30, 40, 60, 10};
//
//        System.out.println(numbers.length >= 2 && numbers[0] ==  numbers[numbers.length-1]);
//    }
//        }
//       2. Write a Java program to find the k largest elements in a given array.
//       Elements in the array can be in any order.

//      Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//        System.out.println("Original Array: ");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(k +" largest elements of the said array are:");
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (int i = 0; i < k; i++)
//            System.out.print(arr[i] + " ");
//    }
//}
// 3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
//        Integer nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int sum = 0;
//        System.out.println("Original Array: ");
//        System.out.println(Arrays.toString(nums));
//        System.out.println(sum + " largest elements of the said array are:");
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//        }
//        double average = sum / nums.length;
//        System.out.println("The average of the said array is: " + average);
//        System.out.println("The numbers in the said array that are greater than the average are: ");
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > average) {
//                System.out.println(nums[i]);
//            }
//        }
//    }
//}
//        4.Write a Java program to get the larger value between first and last element of an array of integers.
//        int[] num = {20, 30, 40};
//        System.out.println("Original Array:" + Arrays.toString(num));
//        int max_val = num[0];
//        if (num[2] >= max_val) ;
//        {
//            max_val = num[2];
//            System.out.println("Larger value between first and last element:" + max_val);
//
//        }
//    }
//}
//5.Write a Java program to swap the first and last elements of an array and create a new array.
//        int[] array_n = {20, 30, 40};
//        System.out.println("Original Array: "+Arrays.toString(array_n));
//        int x = array_n[0];
//        array_n[0] = array_n[array_n.length-1];
//        array_n[array_n.length-1] = x;
//        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(array_n));
//    }
//}
//6.Write a Java program to find all of the longest word in a given dictionary.


//          static ArrayList<String> longestWords(String[] dictionary) {
//              ArrayList<String> list = new ArrayList<String>();
//              int longest_length = 0;
//              for (String str : dictionary) {
//                  int length = str.length();
//                  if (length > longest_length) {
//                      longest_length = length;
//                      list.clear();
//                  }
//                  if (length == longest_length) {
//                      list.add(str);
//                  }
//              }
//              return list;
//          }
//
//          public static void main(String[] args) {
//              String [] dict = {"cat", "dog", "red", "is", "am"};
//              System.out.println(Arrays.toString(dict));
//              System.out.println(longestWords(dict));
//          }
//      }
//     7. Write a menu driven Java program with following option:
//
//     1. Accept elements of an array
//     2. Display elements of an array
//     3. Search the element within array
//     4. Sort the array
//     5. To Stop
//     the size of the array should be entered by the user.
//    Scanner scanner = new Scanner(System.in);
//    int option;
//    int[] arr = null;
//    do {
//
//      System.out.print("Enter your option: ");
//      option = scanner.nextInt();
//      switch (option) {
//        case 1:
//          arr = acceptArray(scanner);
//          break;
//        case 2:
//          displayArray(arr);
//          break;
//        case 3:
//          searchArray(arr, scanner);
//          break;
//        case 4:
//          sortArray(arr);
//          break;
//        case 5:
//          System.out.println("Exiting program...");
//          break;
//        default:
//          System.out.println("Invalid option, please try again.");
//      }         } while (option != 5);
//  }
//
//  public static int[] acceptArray(Scanner sc) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter the size of the array: ");
//    int size = scanner.nextInt();
//    int[] arr = new int[size];
//    System.out.println("Enter the elements of the array:");
//    for (int i = 0; i < size; i++) {
//      System.out.print("Element " + i + ": ");
//      arr[i] = scanner.nextInt();         }
//    System.out.println("Array accepted.");
//    return arr;     }
//  public static void displayArray(int[] arr) {
//    if (arr == null) {
//      System.out.println("Array is empty, nothing to display!");
//      return;
//    }
//    System.out.print("Elements of the array: ");
//    for (int i = 0; i < arr.length; i++) {
//      System.out.print(arr[i] + " ");
//    }         System.out.println();     }
//  public static void searchArray(int[] arr, Scanner sca) {
//    Scanner scanner = new Scanner(System.in);
//    if (arr == null) {
//      System.out.println("Array is empty, nothing to search!");
//      return;         }
//    System.out.print("Enter the element to search: ");
//    int element = scanner.nextInt();
//    boolean found = false;
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] == element) {
//        System.out.println("Element found at index " + i);
//        found = true;
//        break;
//      }
//    }
//    if (!found) {
//      System.out.println("Element not found in the array.");
//    }     }      public static void sortArray(int[] arr) {
//
//    if (arr == null) {
//      System.out.println("Array is empty, nothing to sort!");
//      return;         }
//    Arrays.sort(arr);
//
//    System.out.println("Array sorted.");
//  }
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
//    int[] arr = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//    int leftIndex = 0;
//    int rightIndex = arr.length - 1;
//
//     while (leftIndex < rightIndex) {
//
//     while (arr[leftIndex] % 2 != 0 && leftIndex < rightIndex) {
//     leftIndex++;             }
//
//     while (arr[rightIndex] % 2 == 0 && leftIndex < rightIndex) {
//     rightIndex--;             }
//
//     if (leftIndex < rightIndex) {
//     int temp = arr[leftIndex];
//     arr[leftIndex] = arr[rightIndex];
//     arr[rightIndex] = temp;
//     }         }
//
//     System.out.println(Arrays.toString(arr));
//  }
//}
//    10. Write a program that test the equality of two arrays.
    int[] arr1 = {2, 3, 6, 6, 4};
    int[] arr2 = {2, 3, 6, 6, 4};
    boolean isEqual = true;
    if (arr1.length != arr2.length) {
      isEqual = false;
    } else {
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
          isEqual = false;
          break;
        }
      }
    }
    System.out.println(isEqual);
  }
}