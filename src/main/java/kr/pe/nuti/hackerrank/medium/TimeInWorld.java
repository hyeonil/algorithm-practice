package kr.pe.nuti.hackerrank.medium;

public class TimeInWorld {
  public String timeInWords(int h, int m) {
    String[] hours = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
    String[] minutes = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};
    String hourString = m <= 30 ? hours[h - 1] : hours[h];
    if (m == 0) return hourString + " o' clock";
    String minuteString = m <= 30 ? minutes[m - 1] : minutes[60 - m - 1];
    minuteString = minuteString + (m % 15 == 0 ? "" : (m == 1 ? " minute" : " minutes"));
    minuteString = minuteString + (m <= 30 ? " past " : " to ");
    return minuteString + hourString;
  }
}
