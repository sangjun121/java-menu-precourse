package menu.view;

public class OutputView {
    private static final String APPLICATION_INIT_GUIDE = "점심 메뉴 추천을 시작합니다.\n";

    public void printApplicationInitGuide() {
        System.out.println(APPLICATION_INIT_GUIDE);
    }

    public void printErrorMessage(String message) {
        System.out.println(message + "\n");
    }
}
