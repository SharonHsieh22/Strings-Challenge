import java.util.Scanner;

class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";
        String finalSentence = "";
        String word = "";
        int num = 0;
        
        sentence = sc.nextLine();
        
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ' || i == sentence.length() - 1) {                
                word = sentence.substring(num, i);
                if(word.length() > 2) 
                finalSentence += word.substring(1) + word.charAt(0) + "ay ";
                else finalSentence += word + " ";
                num = i + 1;
            }
        }
        
        System.out.println(finalSentence);
    }
    
}