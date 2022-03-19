/* Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters. */


class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean canConstruct = false;
       
        for(int i=0;i<ransomNote.length();i++){
             StringBuilder magsb = new StringBuilder(magazine);
            if(magazine.contains(ransomNote.substring(i,i+1))){
                canConstruct = true;
                magsb.deleteCharAt(magazine.indexOf(ransomNote.substring(i,i+1)));
                magazine = magsb.toString();
            } else{
                canConstruct = false;
                break;
            }
        }
        return canConstruct;
    }
}

