import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TeacherMaps {


    /*
    Though maps often store their elements in unpredictable order, for this problem you may assume
    that the grade mapping's key/value pairs are stored in ascending order by keys (percentages).
     */


    public static HashMap<String, String> teacher(HashMap<String, Integer> roster,
                                                  HashMap<Integer, String> gradeMap) {
        HashMap<String, String> grades = new HashMap<>();
        // Loop through every name
        Set<String> names = roster.keySet();
        for (String name : names) {
            // Get and store their percent grade
            int currentPercent = roster.get(name);
            // Init grade below lowest in gradeMap
            String grade = "F";
            // Loop through every percent
            Set<Integer> percents = gradeMap.keySet();
            for (int percent : percents) {
                // If the students grade exceeds or meets the percent key in gradeMap,
                // set their letter grade to corresponding value
                if (currentPercent >= percent) grade = gradeMap.get(percent);
            }
            // Add the student and letter grade to the new HashMap
            grades.put(name, grade);
        }
        return grades;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> roster = new HashMap<>(Map.of("Mort", 77, "Dan",
                81, "Alyssa", 98, "Kim", 52, "Lisa", 87, "Bob",
                43, "Jeff", 70, "Sylvia", 92, "Vikram", 90));
        HashMap<Integer, String> gradeMap = new HashMap<>(Map.of(52, "D", 70,
                "C-", 73, "C", 76, "C+", 80, "B-", 84, "B",
                87, "B+", 89, "A-", 91, "A", 98, "A+"));
        System.out.println(teacher(roster, gradeMap));
        System.out.println("{Mort=C+, Dan=B-, Alyssa=A+, Kim=D, Lisa=B+, Bob=F, Jeff=C-, Sylvia=A, Vikram=A-}");

    }

}
