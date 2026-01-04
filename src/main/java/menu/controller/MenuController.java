package menu.controller;

import java.util.List;
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
        readCoachNames();
    }

    private List<String> readCoachNames() {
        try {
            return inputView.readCoachNames();
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e.getMessage());
            return readCoachNames();
        }
    }
}
