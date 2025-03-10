package javatraining;

public class NthPerfectNumber {

    
    public boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public void findNthPerfectNumber(int n) {
        int count = 0;
        int num = 2; 
        
        while (true) {
            if (isPerfectNumber(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th perfect number is: " + num);
                    return;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        NthPerfectNumber obj = new NthPerfectNumber();
        obj.findNthPerfectNumber(4); 
}
}



