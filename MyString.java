public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newLowercaseString = "";
        for (int i = 0; i < str.length(); i ++) {
            if ((str.charAt(i)) >= 65 && (str.charAt(i)) <= 90) {
                int ascii = (int)str.charAt(i);
                newLowercaseString += (char)(ascii + 32);
            }
            else {
                newLowercaseString += str.charAt(i);
            }
        }
        return newLowercaseString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        // edge case- str2 is longer than str1, means str1 can't contain it.
        if (str2.length() > str1.length()) {
            return false;
        }
        boolean strContains = false;
        for (int i = 0; i < (str1.length() - str2.length()); i++) // Avoiding out of Bounds error
        {
            strContains = true;
            for (int j = 0; j < str2. length(); j++) 
            {
                int index = i + j;
                if (str1.charAt(index) != str2.charAt(j)) {
                    strContains = false;
                    break;
                }
            }
            if (strContains) {
                return true;
            }   
        }
        return false;
    }
}
