package javatraining;

public class NthStrongNumber {
    
    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isStrongNumber(int num) {
        int sum = 0, temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        
        return sum == num;
    }

    public void findNthStrongNumber(int n) {
        int count = 0, num = 1;
        
        while (true) {
            if (isStrongNumber(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th Strong number is: " + num);
                    return;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        NthStrongNumber obj = new NthStrongNumber();
        obj.findNthStrongNumber(4);
    }
}
