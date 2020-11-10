import java.util.Scanner;

class Ppap {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        String obj1 = "";
        String obj2 = "";
        //int end;
        sentence = sc.nextLine();
        for(int i = 9; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ',') obj1 = sentence.substring(9, i);
            obj2 = sentence.substring(sentence.lastIndexOf(" ") + 1);
        }
        obj2 = obj2.substring(0, 1).toUpperCase() + obj2.substring(1);
        System.out.println("Uh! " + obj2 + " " + obj1);
    }
}