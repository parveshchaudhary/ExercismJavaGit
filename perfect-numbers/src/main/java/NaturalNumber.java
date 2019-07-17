class NaturalNumber {

    int inputNumber;

    public NaturalNumber(int input) {

        if (input <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.inputNumber = input;
    }

    public Classification getClassification() {

        int sum = 0;

        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                sum += i;
            }
        }

        if (sum > inputNumber) {
            return Classification.ABUNDANT;
        } else if (sum == inputNumber) {
            return Classification.PERFECT;
        } else {
            return Classification.DEFICIENT;
        }
    }
}
