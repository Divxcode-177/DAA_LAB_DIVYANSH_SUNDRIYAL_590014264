import java.util.Scanner;
import java.util.Stack;

public class celebrityproblem1{

    public static int celebrityProblemFunction(int[][] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (arr[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int candidate = stack.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate && (arr[candidate][i] == 1 || arr[i][candidate] == 0)) {
                return -1; 
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 2;
        int[][] arr = new int[n][n];

        System.out.println("Enter the 2x2 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int celeb = celebrityProblemFunction(arr, n);

        if (celeb == -1) {
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity is person " + celeb);
        }

        sc.close();
    }
}
