/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ')
                break;
            len++;
        }
        return len;
    }
}
