public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes, remainingKiloBytes;
        if (kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            megaBytes = kiloBytes/1024;
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
