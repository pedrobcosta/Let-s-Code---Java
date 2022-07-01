public class Desafio04 {
    
    public static void main(String[] args) {
        
        String[] input = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};

        System.out.println(substring(input));
    }

    public static String substring(String[] input) {

        String substring = "";

        for(String word : input) {

            char[] wordArray = word.toCharArray();
            String possibleSubstring = "";

            for(int i=0; i<wordArray.length;  i++) {

                // first iteration
                if(i==0)
                    possibleSubstring += wordArray[i];
                // sequence continued
                else if(wordArray[i] > wordArray[i-1])
                    possibleSubstring += wordArray[i];
                // sequence broken
                else {
                    // greater sequence found
                    if(possibleSubstring.length() > substring.length()) 
                        substring = possibleSubstring;
                    // reset
                    possibleSubstring = "" + wordArray[i];
                }
            }
        }

        return substring;
    }

}
