public class BarkingDog {
    public static void main(String[] args) {
        bark(false, 2);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if (barking == true){
            if (hourOfDay < 0 || hourOfDay > 23){
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
