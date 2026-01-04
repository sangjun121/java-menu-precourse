package menu.view;

import java.util.Arrays;
import java.util.List;
import menu.util.Validator;

public class InputParser {
    private static final String NAME_SEPARATOR = ",";
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;
    private static final int MIN_COACH_COUNT = 2;
    private static final int MAX_COACH_COUNT = 5;


    public List<String> parseCoachName(String input) {
        List<String> names = Arrays.asList(input.split(","));
        validateCoach(names);
        return names;
    }

    private void validateCoach(List<String> names) {
        for (String name : names) {
            validateNameLength(name);
        }

        validateCoachCount(names);
    }

    private void validateNameLength(String name) {
        if(!Validator.isInRange(name.length(), MIN_NAME_LENGTH, MAX_NAME_LENGTH)){
            throw new IllegalArgumentException("[ERROR] 코치의 이름은 최소 2자에서 최대 4자까지 허용됩니다.");
        }
    }

    private void validateCoachCount(List<String> names){
        if (!Validator.isInRange(names.size(), MIN_COACH_COUNT, MAX_COACH_COUNT)) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명에서 최대 5명까지 허용됩니다.");
        }
    }
}
