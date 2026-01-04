package menu;

import menu.config.AppConfig;
import menu.controller.MenuController;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        MenuController menuController = appConfig.menuController();
        menuController.run();
    }
}
