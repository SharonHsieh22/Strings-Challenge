import java.util.Scanner;

class PalindromeDetector { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";
        String front = "";
        String back = "";
        String punctuation = "!?,.:; ";
        sentence = sc.nextLine();
        for(int i = sentence.length() - 1; i >= 0; i--) {
            if(!punctuation.contains(sentence.substring(i, i+1))) 
            back += sentence.substring(i, i+1);
        }
        
        for(int j = 0; j < sentence.length(); j++) {
            if(!punctuation.contains(sentence.substring(j, j+1))) 
            front += sentence.substring(j, j+1);
        }
        
        //System.out.println(front);
        //System.out.print(back);
        if(front.toLowerCase().equals(back.toLowerCase())) System.out.println("YES");
        else System.out.println("NO");
    }
}