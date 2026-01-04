package menu.config;

import menu.application.MenuService;
import menu.controller.MenuController;
import menu.view.InputParser;
import menu.view.InputView;
import menu.view.OutputView;

public class AppConfig {
    private static final AppConfig INSTANCE = new AppConfig();

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public InputView inputView(){
        return new InputView(inputParser());
    }

    public InputParser inputParser(){
        return new InputParser();
    }

    public OutputView outputView(){
        return new OutputView();
    }

    public MenuController menuController(){
        return new MenuController(inputView(), outputView());
    }

    public MenuService menuService(){
        return new MenuService();
    }
}
