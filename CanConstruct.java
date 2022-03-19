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
