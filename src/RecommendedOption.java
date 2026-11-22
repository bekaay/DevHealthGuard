public enum RecommendedOption {
    EYE_HEALTH;

    public static RecommendedOption fromChoice(int choice) {
        return switch (choice) {
            case 1 -> RecommendedOption.EYE_HEALTH;
            default -> null;
        };
    }
}
