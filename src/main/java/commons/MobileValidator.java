package commons;

public interface MobileValidator {
    default boolean checkMobile(String num) {
        /**
         * 010 0000 0000
         * 011 000 0000
         * 016 000 0000
         *
         * 01000000000 / 010 0000 0000 010-0000-0000, 010.0000.0000
         *
         * 000010000000001233
         */
        String mobile = num.replaceAll("\\D", "");
        String pattern = "^01[016]\\d{3,4}\\d{4}$";

        return mobile.matches(pattern);
    }
}