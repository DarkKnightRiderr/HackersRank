package Root;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
    	long startTime = System.nanoTime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List < Integer > ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List < Integer > player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List < Integer > result = Result.climbingLeaderboard(ranked, player);

        /*bufferedWriter.write(
            result.stream()
            .map(Object::toString)
            .collect(joining("\n")) +
            "\n"
        );*/
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
        long endTime = System.nanoTime();
                long executionTime
            = (endTime - startTime) / 1000000;
         System.out.println("Total time took "
                           + executionTime + "ms");
    }
}
