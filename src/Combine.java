import java.text.Collator;
import java.util.Arrays;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        List<String> teamA= Arrays.asList("bob","john");
        List<String > teamB=Arrays.asList("ram","alice");
        List<List<String>> allTeam=Arrays.asList(teamA,teamB);
        System.out.println(allTeam);
//Flatmap() can convert 2D data structure convert into 1D data structure.
//        List<String> teams=allTeam.stream()
//                .Flatmap(List::stream)
//                .sorted()
//                .collect(Collator.toList());
//        System.out.println(teams);
    }
}