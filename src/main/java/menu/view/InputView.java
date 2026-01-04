package menu.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputView {
    private static final String COACH_NAME_INPUT_GUIDE = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String NOT_EAT_MEMU_INPUT_GUIDE = "%s(이)가 못 먹는 메뉴를 입력해 주세요.";

    private final InputParser inputParser;

    public InputView(InputParser inputParser) {
        this.inputParser = inputParser;
    }

    public List<String> readCoachNames() {
        System.out.println(COACH_NAME_INPUT_GUIDE);
        String input = readLine();
        return inputParser.parseCoachName(input);
    }

    public Map<String, List<String>> readNotEatMenu(List<String> coachNames) {
        Map<String, List<String>> notEatMenus = new HashMap<>();

        for (String name : coachNames) {
            System.out.printf(NOT_EAT_MEMU_INPUT_GUIDE, name);
            System.out.print("\n");
            String input = readLine();
            List<String> menus = inputParser.parseNotEatMenu(input);
            notEatMenus.put(name, menus);
        }

        return notEatMenus;
    }
}
