public class SumOddRange {

    public static void main(String[] args) {

    }

    public static boolean isOdd(int number){
        if (number <= 0 || number % 2 == 0){
            return false;
        }

        return true;
    }

    public static int sumOdd(int start, int end){
        if ((end < start) || (start <= 0) || (end <= 0)){
            return -1;
        }

        int count = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i) == true){
                count = count + i;
            }
        }

        return count;
    }
}
