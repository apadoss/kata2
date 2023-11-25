package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Rating ---------");
        List<Application> applications = CsvFileApplicationLoader
                .with(new File("googleplaystore.csv"))
                .load();
        RatingApplicationStatistics ratingApplicationStatistics = new RatingApplicationStatistics();
        Map<String, Integer> ratingMap = ratingApplicationStatistics.calculate(applications);
        for (String key : ratingMap.keySet()) {
            System.out.println(key + " - " + ratingMap.get(key));
        }

        System.out.println("\n--------- Category ---------");
        ApplicationStatistics categoryApplicationStatistics = new CategoryApplicationStatistics();
        Map<String, Integer> categoryMap = categoryApplicationStatistics.calculate(applications);
        for (String key : categoryMap.keySet()) {
            System.out.println(key + " - " + categoryMap.get(key));
        }
    }
}
