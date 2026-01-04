package menu.controller;

import java.util.List;
import java.util.Map;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    private final InputView inputView;
    private final OutputView outputView;

    public MenuController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printApplicationInitGuide();
        List<String> coachNames = readCoachNames();
        Map<String, List<String>> notEatMenus = readNotEatMenu(coachNames);
    }

    private List<String> readCoachNames() {
        try {
            return inputView.readCoachNames();
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e.getMessage());
            return readCoachNames();
        }
    }

    private Map<String, List<String>> readNotEatMenu(List<String> coachNames) {
        try {
            return inputView.readNotEatMenu(coachNames);
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e.getMessage());
            return readNotEatMenu(coachNames);
        }
    }
}
