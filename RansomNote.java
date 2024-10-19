import java.util.Scanner;
public class RansomNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        //initializong the array and keeping the characters at their respective
        //position in the array as we have 26 characters the size of the array is also 26
        int alphabetArray[] = new int[26];
        for(char c : magazine.toCharArray()){
            alphabetArray[c-'a']++;
        }
        //checking if the character in the ransomnote is not present in the previously 
        //initialized array
        for(char c : ransomNote.toCharArray()){
            if(alphabetArray[c-'a'] == 0){
                return false;
            }
            alphabetArray[c-'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        RansomNote rn = new RansomNote();
        System.out.println("Enter the RansomNote: ");
        String ransomNote = sc.next();
        System.out.println("Enter the Magazine: ");
        String magazine = sc.next();
        boolean canConstructTheString = rn.canConstruct(ransomNote, magazine);
        if(canConstructTheString){
            System.out.println("The string RansomNote can be constructed using the Magazine");
        }
        else{
            System.out.println("The string RansomNote cannot be constructed using the Magazine");
        }
    }
}
