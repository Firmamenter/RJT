/**
 * Created by DaChen on 11/12/18.
 */
public class RJT {
    public void starPrinter(int cnt) {
        if (cnt < 0) {
            System.out.println("Invaild input");
        }
        String star = "";
        for (int i = 0; i < cnt; i++) {
            star += "*";
            System.out.println(star);
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        int maxNum = num / 2;
        for (int i = 2; i <= maxNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void factorialPrinter(int num) {
        if (num < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (num == 0 || num == 1) {
            System.out.println(1);
            return;
        }
        long res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        if (num < 10) {
            return true;
        }
        int len = 0;
        int temp = num;
        while (temp != 0) {
            len++;
            temp /= 10;
        }
        int left, right;
        temp = num;
        while (temp != 0) {
            left = temp / (int)Math.pow(10, len - 1);
            right = temp % 10;
            if (left != right) {
                return false;
            }
            temp -= left * (int)Math.pow(10, len - 1);
            temp /= 10;
            len -= 2;
        }
        return true;
    }
}
