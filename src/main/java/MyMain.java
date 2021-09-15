public class MyMain {
    // Warm-up: Returns true if the char is a lowercase
    // letter or uppercase letter
    // Recall that you can compare chars with operators like < and >=
    // Ex. isLetter('a') => true
    //     isLetter('C') => true
    //     isLetter('?') => false
    //     isLetter('4') => false
    public static boolean isLetter(char c) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }

    // This method is given two chars as input, c1 and c2
    // The method should print out the chars between c1 and c2
    // You can assume that c2 will always come after c2
    // Ex. printChars('b', 'g') => 'b'
    //                             'c'
    //                             'd'
    //                             'e'
    //                             'f'
    //                             'g'
    public static void printChars(char c1, char c2) {
        // REPLACE WITH YOUR CODE HERE
    }

    // Given a char ch, and returns the next letter in the alphabet.
    // The letters 'z' and 'Z' should "roll over" to 'a' and 'A', respectively
    // At first, you should focus on just uppercase letters, but you should get your code
    // to work with lowercase letters as well.
    // You can assume that this method will only ever be called with letter chars
    // Ex. nextLetter('J') => 'K'
    //     nextLetter('Z') => 'A'
    //     nextLetter('a') => 'b'
    //     nextLetter('z') => 'a'
    public static char nextLetter(char ch) {
        // REPLACE WITH YOUR CODE HERE
        return ' ';
    }

    // Similar to the previous example, the method is given a char ch. However, the method
    // returns the letter 3 after the current letter
    // The letters 'x', 'y', and 'z' should "roll over" to 'a', 'b', and 'c', respectively
    // Ex. nextNextNextLetter('J') => 'M'
    //     nextNextNextLetter('Z') => 'C'
    //     nextNextNextLetter('a') => 'd'
    //     nextNextNextLetter('z') => 'c'
    public static char nextNextNextLetter(char ch) {
        // REPLACE WITH YOUR CODE HERE
        return ' ';
    }


    public static void main(String[] args) {
        System.out.println("isLetter Tests:");
        System.out.println(isLetter('a')); // true
        System.out.println(isLetter('C')); // true
        System.out.println(isLetter('?')); // false
        System.out.println(isLetter('4')); // false

        System.out.println();
        System.out.println("printChars Tests:");
        printChars('b', 'g');
        // 'b'
        // 'c'
        // 'd'
        // 'e'
        // 'f'
        // 'g'

        System.out.println();
        System.out.println("nextLetter Tests:");
        System.out.println(nextLetter('J')); // 'K'
        System.out.println(nextLetter('Z')); // 'A'
        System.out.println(nextLetter('a')); // 'b'
        System.out.println(nextLetter('z')); // 'a'

        System.out.println();
        System.out.println("nextNextNextLetter Tests:");
        System.out.println(nextNextNextLetter('J')); // 'M'
        System.out.println(nextNextNextLetter('Z')); // 'C'
        System.out.println(nextNextNextLetter('a')); // 'd'
        System.out.println(nextNextNextLetter('z')); // 'c'
    }
}