public class NumbersToWords {

    public static void main(String[] args) {
        //System.out.println(getDigitCount(5200));;
        System.out.println(reverse(1010));
        //numberToWords(1010);
    }

    public static void numberToWords(int number){
        if (number < 0)
            System.out.println("Invalid Value");

        int reverseNumber = reverse(number);

        while (reverseNumber != 0){
            int lastDigit = reverseNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    reverseNumber /= 10;
                    break;
                case 1:
                    System.out.println("One");
                    reverseNumber /= 10;
                    break;
                case 2:
                    System.out.println("Two");
                    reverseNumber /= 10;
                    break;
                case 3:
                    System.out.println("Three");
                    reverseNumber /= 10;
                    break;
                case 4:
                    System.out.println("Four");
                    reverseNumber /= 10;
                    break;
                case 5:
                    System.out.println("Five");
                    reverseNumber /= 10;
                    break;
                case 6:
                    System.out.println("Six");
                    reverseNumber /= 10;
                    break;
                case 7:
                    System.out.println("Seven");
                    reverseNumber /= 10;
                    break;
                case 8:
                    System.out.println("Eight");
                    reverseNumber /= 10;
                    break;
                case 9:
                    System.out.println("Nine");
                    reverseNumber /= 10;
                    break;
                default:
                    System.out.println("Zero");
                    reverseNumber /= 10;
                    break;
            }
        }

    }

    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0)
            return -1;

        int count = 0;

        if (number == 0)
            return count = 1;


        while (number != 0) {
            int remainder = number % 10;
            number /= 10;
            count++;
        }

        return count;
    }
}
