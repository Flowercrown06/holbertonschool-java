public class PrintJobFactory {

    public static PrintJob createPrintJob(PrintSize size, int totalPages, int colorPages, boolean isDoubleSided) {
        double colorSingle = 0, bwSingle = 0, colorDouble = 0, bwDouble = 0;

        switch (size) {
            case A2:
                bwSingle = 0.22;
                colorSingle = 0.32;
                bwDouble = 0.18;
                colorDouble = 0.28;
                break;
            case A3:
                bwSingle = 0.20;
                colorSingle = 0.30;
                bwDouble = 0.15;
                colorDouble = 0.25;
                break;
            case A4:
                bwSingle = 0.15;
                colorSingle = 0.25;
                bwDouble = 0.10;
                colorDouble = 0.20;
                break;
        }

        return new PrintJob(totalPages, colorPages, isDoubleSided,
                colorSingle, bwSingle, colorDouble, bwDouble);
    }
}
