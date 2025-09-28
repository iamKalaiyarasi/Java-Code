package Test;
//Maximum number of words you can find

//There is a malfunctioning keyboard where some letter keys do not work.
//All other keys on the keyboard work properly.
//
//Given a string text of words separated by a single space (no leading or trailing spaces)
//and a string brokenLetters of all distinct letter keys that are broken,
//return the number of words in text you can fully type using this keyboard.

//Example 1:
//
//Input: text = "hello world", brokenLetters = "ad"
//Output: 1
//Explanation: We cannot type "world" because the 'd' key is broken.



public class Code1 {

    public static void main(String args[]) {

        String text = "hello world", brokenLetters = "ad";

        int result = text(text, brokenLetters);

        System.out.println(result);

    }

    public static int text(String text, String brokenLetters) {

        String[] n = text.split(" ");
        int count = 0;
        for (String s : n) {
            boolean type = true;
            for (int i = 0; i < s.length(); i++){
                for(int j = 0; j < brokenLetters.length(); j++){
                    if(s.charAt(i) == brokenLetters.charAt(j)){
                        type = false;
                        break;
                    }
                }
                if(!type){
                    break;
                }
            }
            if(type){
                count++;
            }


        }
        return count;
    }
}
