import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        InnerRansomNote2 solution = new InnerRansomNote2();
        System.out.println(solution.canConstruct("aa", "bab"));

    }
}

class InnerRansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for( int i = 0; i < ransomNote.length(); i++){
            char ransomChar = ransomNote.charAt(i);
            if(!magazine.contains(String.valueOf(ransomChar))){
                System.err.println(magazine);
                return false;
            }
            int index = magazine.indexOf(ransomChar);
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }
}

class InnerRansomNote2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineChars = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char character = magazine.charAt(i);
            
            int currentCount = magazineChars.getOrDefault(character, 0);
            magazineChars.put(character, currentCount + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char character = ransomNote.charAt(i);

            int currentCount = magazineChars.getOrDefault(character, 0);
            if(currentCount == 0) return false;

            magazineChars.put(character, currentCount - 1);
        }
        return true;
    }
}