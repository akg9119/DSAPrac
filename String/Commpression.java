package String;

public class Commpression {
    public static void main(String[] args){
        char[] chars = {'a', 'a', 'a', 'b', 'c', 'c', 'c', 'd', 'e', 'f', 'f'};  

         int n = chars.length;
        int ind = 0; // write index
        int i = 0;   // read index

        while (i < n) {
            char ch = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < n && chars[i] == ch) {
                i++;
                count++;
            }

            // Write character
            chars[ind++] = ch;

            // Write count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[ind++] = c;
                }
            }
        }
        char[] compressedChars = new char[ind];
        for (int j = 0; j < ind; j++) {
            compressedChars[j] = chars[j];
        }
        System.out.print("Compressed characters: ");
        for (char c : compressedChars) {
            System.out.print(c);
        }
       

        
    }
}
