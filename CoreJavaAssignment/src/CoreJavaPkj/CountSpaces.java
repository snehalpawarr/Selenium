package CoreJavaPkj;

public class CountSpaces {

	public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
	
    public static String extractWelcome(String str) {
        String[] words = str.split(" ");
       
            return words[0];
        }
           
    

    public static void main(String[] args) {
        String a = "Welcome To Java";
        
      
        int spacesCount = countSpaces(a);
        System.out.println("Number of spaces: " + spacesCount);
        
        
        String welcomeSubstring = extractWelcome(a);
        System.out.println("Substring : " + welcomeSubstring);
    }
}
