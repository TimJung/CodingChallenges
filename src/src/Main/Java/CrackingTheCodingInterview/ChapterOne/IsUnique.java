package src.Main.Java.CrackingTheCodingInterview.ChapterOne;

/**
 * Chapter 1 - 1.1 - IsUnique
 *
 * Implement an algorithm to determine if a string has all
 * unique characters. What if you cannot use additional
 * data structures?
 */
public class IsUnique {

    public boolean isUniqueChars(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
