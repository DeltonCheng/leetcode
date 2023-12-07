public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        String result = "";
        int currIndex = num.length() - 1;
        int smallestOddIndex = -1;

        for(int i = currIndex; i > -1 ; i--){
            if(num.charAt(currIndex) % 2 == 1 ) {
                smallestOddIndex = currIndex;
                break;
            } else {
                currIndex--;
            }
        }

        if(smallestOddIndex != -1) {
            return num.substring(0, smallestOddIndex + 1);
        }
        return result;
    }
}
