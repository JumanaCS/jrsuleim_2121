/**
* @author Jumana Suleiman 
* @version 1.0
*/

public class StringUtility {

    public static String reverse(String sentence) {
        
        String wrd[] = sentence.split("\\s+");
        String reverse = "";

        for(int i = wrd.length - 1; i>=0; i--){
            reverse+= wrd[i] + " ";
        }

        return reverse.toLowerCase().trim();
    }
    
      public static char maxOccuringCharacter(String sentence) throws IllegalArgumentException {
        if(sentence.length() == 0){
            throw new IllegalArgumentException("Length is 0 no max accuring character!");
        }
        
        sentence = sentence.toLowerCase().trim();
                int[] charAr = new int[256];

        for (char w : sentence.toCharArray()) {
            if ((int) w >= 97 && (int) w <= 122) {
                charAr[w]++;
            }
        }

        int max_index = 0;
        int max_count = 0;
        for(int i = 97; i <= 122; i++){
            if(charAr[i] > max_count){
                max_count = charAr[i];
                max_index = i;
            }
        }
        
        return (char) max_index;
    
      }

      public static boolean isPalindrome(String input) {
        
        
            if(input.trim().equals("")) 
            return true;
            
            String equal = "";
            
            for(int i = input.length()- 1; i >= 0; i--){
                equal += input.charAt(i);
            }
            
            return input.equals(equal);
        
    }

    public static void main(String[] args){


        System.out.println(reverse("this is a sentence"));
        System.out.println(maxOccuringCharacter("iijjiii"));
        System.out.println(isPalindrome("racecar"));

    }
}
