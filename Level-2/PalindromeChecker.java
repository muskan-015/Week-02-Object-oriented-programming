class Main{
    public static void main(String[] args) {
        // object of palindromechecker class
        PalindromeChecker text1 = new PalindromeChecker("Hello");
        PalindromeChecker text2 = new PalindromeChecker("madam");
       
        // Display results
        text1.Result();
        text2.Result();
    }
}

class PalindromeChecker {
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
       int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void Result() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}
