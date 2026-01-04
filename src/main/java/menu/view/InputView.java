package menu.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;

public class InputView {
    private static final String COACH_NAME_INPUT_GUIDE = "코치의 이름을 입력해 주세요. (, 로 구분)";

    private final InputParser inputParser;

    public InputView(InputParser inputParser) {
        this.inputParser = inputParser;
    }

    public List<String> readCoachNames() {
        System.out.println(COACH_NAME_INPUT_GUIDE);
        String input = readLine();
        return inputParser.parseCoachName(input);
    }
}
