// public class Adsa {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0, high = nums.length - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 // Swap nums[low] and nums[mid], then increment both pointers
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 1) {
//                 // Move mid pointer forward
//                 mid++;
//             } else {
//                 // Swap nums[mid] and nums[high], then decrement high pointer
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }

//    public static void main(String[] args) {
//         Adsa sc = new Adsa();
//         int[] nums = {2, 0, 2, 1, 1, 0};
//         sc.sortColors(nums);

//         // Print sorted array
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }



// public class ReverseWordsTwoStep {
//     // helper method to reverse a portion of StringBuilder
//     private static void reverse(StringBuilder sb, int left, int right) {
//         while (left < right) {
//             char temp = sb.charAt(left);
//             sb.setCharAt(left, sb.charAt(right));
//             sb.setCharAt(right, temp);
//             left++;
//             right--;
//         }
//     }

//     public static String reverseWords(String str) {
//         int n = str.length();
//         StringBuilder revString = new StringBuilder();

//         // Step 1: Reverse entire string
//         for (int i = n - 1; i >= 0; i--) {   // FIX: use i >= 0
//             revString.append(str.charAt(i));
//         }

//         // Step 2: Traverse and reverse each word
//         int left = 0;
//         int right = 0;

//         while (right < revString.length()) {
//             // move right until space or end
//             while (right < revString.length() && revString.charAt(right) != ' ') {
//                 right++;
//             }

//             // reverse the word between left and right-1
//             reverse(revString, left, right - 1);

//             // move to next word (skip space)
//             right++;
//             left = right;
//         }

//         return revString.toString();
//     }

//     public static void main(String[] args) {
//         String s = "welcome to India";
//         System.out.println(reverseWords(s));  // Output: "India to welcome"
//     }
// }

// import java.util.*;

// public class Adsa {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int T = sc.nextInt();  
//         while (T-- > 0) {
//             int N = sc.nextInt();  
//             int[] A = new int[N];
            
//             for (int i = 0; i < N; i++) {
//                 A[i] = sc.nextInt();
//             }
            
//             int M = Arrays.stream(A).min().getAsInt(); 
//             int count = 0;
            
//             for (int x : A) {
//                 if (x > M) count++;
//             }
            
//             System.out.println(count);
//         }
        
//         sc.close();
//     }
// }

// public class Adsa {
//     public void moveZeroes(int[] nums) {
//         int index = 0; 
        
//         // Shift non-zero elements to the front
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums[index] = nums[i];
//                 index++;
//             }
//         }
        
//         // Fill remaining positions with 0
//         while (index < nums.length) {
//             nums[index] = 0;
//             index++;
//         }
//     }

    
//     public static void main(String[] args) {
//         Adsa obj = new Adsa();
        
//         int[] nums = {0, 1, 0, 3, 12};
//         obj.moveZeroes(nums);
        
        
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
    
//     }
// }

// public class Adsa {
    
    
//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

    
//     public static int lcm(int a, int b) {
//         return (a * b) / gcd(a, b);
//     }

    
//     public static int[] lcmAndGcd(int a, int b) {
//         int g = gcd(a, b);
//         int l = lcm(a, b);
//         return new int[] { l, g };
//     }


//     public static void main(String[] args) {
//         int a = 5, b = 10;
//         int[] result = lcmAndGcd(a, b);
//         System.out.println("[" + result[0] + ", " + result[1] + "]");
//     }
// }

public class Adsa {

    
    public static void findLeaders(int[] arr) {
        int n = arr.length;

        
        int[] temp = new int[n];
        int count = 0;

        
        int maxFromRight = arr[n - 1];
        temp[count++] = maxFromRight;

        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                temp[count++] = arr[i];
                maxFromRight = arr[i];
            }
        }

    
        System.out.print("[");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(temp[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr); 
    }
}
