class DiceDotCount {
  static int totalAmountVisible(int topNum, int numOfSides) {
    return numOfSides++ * numOfSides / 2 - numOfSides + topNum;
  }
}
