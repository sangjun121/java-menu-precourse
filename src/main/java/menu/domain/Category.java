package menu.domain;

public enum Category {
    JAPAN("일식"),
    KOREA("한식"),
    CHINA("중식"),
    ASIAN("아시안"),
    WESTERN("양식");

    Category(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
