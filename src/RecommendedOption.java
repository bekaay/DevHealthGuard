public enum RecommendedOption {
    EYE_HEALTH,
    POSTURE_CHECK,
    BACK_STRETCH,
    ALL;


    public static RecommendedOption fromChoice(int choice) {
        return switch (choice) {
            case 1 -> RecommendedOption.EYE_HEALTH;
            case 2 -> RecommendedOption.POSTURE_CHECK;
            case 3 -> RecommendedOption.BACK_STRETCH;
            case 4 -> RecommendedOption.ALL;
            default -> null;
        };
    }
}
