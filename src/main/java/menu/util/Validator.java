package menu.util;

public final class Validator {
    public static boolean isInRange(int target, int min, int max) {
        return min <= target && target <= max;
    }
}

