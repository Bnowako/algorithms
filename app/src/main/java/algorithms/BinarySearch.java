package algorithms;

class BinarySearch {

    public static int rank(int[] sortedArray, int key) {
        int arrayLength = sortedArray.length;
        int currentIndex = arrayLength / 2;
        int prevIndex = currentIndex;
        int guess;
        while (true) {
            guess = sortedArray[currentIndex];
            int tempCopy = currentIndex;
            if (guess == key) return currentIndex;
            else if (currentIndex == 0 || currentIndex == arrayLength - 1) return -1;
            else if (key < guess) currentIndex = currentIndex / 2;
            else if (key > guess) {
                if(prevIndex != currentIndex) {
                    currentIndex = currentIndex + Math.abs((prevIndex - currentIndex) / 2);
                } else {
                    currentIndex = currentIndex + Math.abs((arrayLength - currentIndex) / 2);
                }
            }
            prevIndex = tempCopy;
        }
    }
}
