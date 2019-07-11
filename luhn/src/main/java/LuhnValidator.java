class LuhnValidator {

    boolean isValid(String candidate) {

        int sum = 0;
        int ctr = 0;

        candidate = candidate.replaceAll("\\s+", "");

        if (candidate.length() < 2) {
            return false;
        }

        for (int i = candidate.length() - 1; i >= 0; i--) {
            if (candidate.charAt(i) >= '0' && candidate.charAt(i) <= '9') {
                if (ctr % 2 != 0) {
                    if (Character.getNumericValue(candidate.charAt(i)) > 4) {
                        sum += Character.getNumericValue(candidate.charAt(i)) * 2 - 9;
                    } else {
                        sum += Character.getNumericValue(candidate.charAt(i)) * 2;
                    }
                } else {
                    sum += Character.getNumericValue(candidate.charAt(i));
                }
                ctr++;
            } else {
                return false;
            }
        }

        if (sum % 10 == 0) {
            return true;
        }
        return false;

    }

}
