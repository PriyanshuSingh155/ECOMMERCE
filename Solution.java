import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static int unaffectedChar(String datastream) {
        int answer = 0;

        // Reverse the data stream
        String reversedDatastream = new StringBuilder(datastream).reverse().toString();

        // Iterate over the data stream and its reverse
        for (int i = 0; i < datastream.length(); i++) {
            // Check if the character at the current position is the same in both the
            // original and reversed data streams
            if (datastream.charAt(i) == reversedDatastream.charAt(i)) {
                // If it is, increment the counter
                answer++;
            }
        }

        // Return the count of unaffected characters
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for datastream
        String datastream = in.nextLine();

        // Call the unaffectedChar function and print the result
        int result = unaffectedChar(datastream);
        System.out.print(result);
    }
}