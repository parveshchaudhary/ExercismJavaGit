class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int tempNum = numberToCheck;
		int digitSum = 0;
		int numOfDigits = Integer.toString(numberToCheck).length();

		while (tempNum > 0) {
			digitSum = digitSum + (int) Math.pow(tempNum % 10, numOfDigits);
			tempNum = tempNum / 10;
		}

		if (numberToCheck == digitSum) {
			return true;
		} else {
			return false;
		}
	}

}
