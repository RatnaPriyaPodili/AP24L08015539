package Assignmentfs;

public class ReplaceCharacter {
	public static void main(String args[])
    {
        // Get the String
        String str = "Full stack assignvent";
 
        // Get the index
        int index = 17;
 
        // Get the character
        char ch = 'm';
 
        // Print the original string
        System.out.println("Original String = " + str);
 
        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch);
 
        // Print the modified string
        System.out.println("Modified String = " + string);
    }

}
