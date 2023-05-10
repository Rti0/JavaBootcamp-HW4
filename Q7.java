
    import java.util.Scanner;
    public class Q7 {
        public static void main(String[] args) {
            Scanner p = new Scanner(System.in);
            int choice;
            int n;
            System.out.print("please enter size of array : ");
            n = p.nextInt();
            int[] arr = new int[n];
            while (true) {
                System.out.println("Please choose a menu option:");
                System.out.println("1. Accept element of an array");
                System.out.println("2. Display element of an array");
                System.out.println("3. search the element within array");
                System.out.println("4. Sort the array");
                System.out.println("5. To stop");

                choice = p.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("Please enter element of array:");
                        for (int i = 0; i < n; i++)
                            arr[i] = p.nextInt();
                    }

                    break;
                    case 2: {
                        System.out.println("element of array is : ");
                        for (int i = 0; i < n; i++)
                            System.out.print(arr[i] + "\t");
                        System.out.println();
                    }
                    break;
                    case 3: {
                        int x,i, flag=0;
                        System.out.print("Enter the element you want to find : ");
                        x = p.nextInt();
                        for(i=0;i<n;i++) {
                            if (arr[i] == x) {
                                System.out.println("Element " + x + " found at " + (i+1) + " position");
                                flag = 1;
                                break;
                            }
                        }
                        if(flag==0)
                        {
                            System.out.println("Element "+x+" not found");

                        }
                    }
                    break;
                    case 4: {
                        int temp = 0;
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = i + 1; j < arr.length; j++) {
                                if (arr[i] > arr[j]) {
                                    temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }
                        System.out.println("Elements of array sorted in ascending order: ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i] + "\t"); }
                        System.out.println();

                    }

                    break;
                    case 5:
                        System.out.println("Exiting.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }

