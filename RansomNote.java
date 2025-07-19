public class RansomNote {
    public static void main(String[] args) {
        InnerRansomNote solution = new InnerRansomNote();
        System.out.println(solution.canConstruct("aa", "abab"));

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
