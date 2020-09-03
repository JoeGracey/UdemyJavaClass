public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = 0;
        int remainderKiloBytes = 0;
        int kiloBytesInMegaBytes = 1024;

        megaBytes = kiloBytes / kiloBytesInMegaBytes;

        remainderKiloBytes = kiloBytes - (megaBytes * kiloBytesInMegaBytes);
        /*
        Example Input/Output:
	        printMegaBytesAndKiloBytes(2500); -> "2500 KB = 2 MB and 452 KB"
	        printMegaBytesAndKiloBytes(-1024); -> "Invalid Value"
	        printMegaBytesAndKiloBytes(5000); -> "5000 KB = 4 MB and 904 KB"
         */

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes +
                " KB");

    }
}
