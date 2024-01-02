/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
		String uniqueS = "";
		for (int i = 0; i < s.length(); i++) {
			char uniqueC = s.charAt(i);
			boolean found = false;
			if (uniqueC != ' ') {
				for (int j = 0; j < uniqueS.length(); j++) {
					if (uniqueC == uniqueS.charAt(j))
						found = true;
				}
			}
			if (!found)
				uniqueS += uniqueC;
		}
        return uniqueS;
    }
}
