import java.util.Scanner;

class BinaryGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        String finalResult = "";
        int number;
        number = sc.nextInt();
        while(number >= 1) {
            n += number%2;
            number /= 2;            
        }
        
        for(int i = n.length() - 1; i >= 0; i--) {
            finalResult += n.substring(i, i+1);
        }
        System.out.println(finalResult);
    }
}