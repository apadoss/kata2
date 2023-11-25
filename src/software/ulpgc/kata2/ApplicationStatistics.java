package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface ApplicationStatistics {
    Map<String, Integer> calculate(List<Application> applications);
}
