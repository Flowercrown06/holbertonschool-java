public class PrintJob {
    private int totalPages;
    private int colorPages;
    private boolean isDoubleSided;

    // Costs per page
    private double colorSingleSidedCost;
    private double bwSingleSidedCost;
    private double colorDoubleSidedCost;
    private double bwDoubleSidedCost;

    public PrintJob(int totalPages, int colorPages, boolean isDoubleSided,
                    double colorSingleSidedCost, double bwSingleSidedCost,
                    double colorDoubleSidedCost, double bwDoubleSidedCost) {
        this.totalPages = totalPages;
        this.colorPages = colorPages;
        this.isDoubleSided = isDoubleSided;
        this.colorSingleSidedCost = colorSingleSidedCost;
        this.bwSingleSidedCost = bwSingleSidedCost;
        this.colorDoubleSidedCost = colorDoubleSidedCost;
        this.bwDoubleSidedCost = bwDoubleSidedCost;
    }

    public double calculateTotal() {
        int bwPages = totalPages - colorPages;
        if (isDoubleSided) {
            return colorPages * colorDoubleSidedCost + bwPages * bwDoubleSidedCost;
        } else {
            return colorPages * colorSingleSidedCost + bwPages * bwSingleSidedCost;
        }
    }

    @Override
    public String toString() {
        int bwPages = totalPages - colorPages;
        String side = isDoubleSided ? "double-sided" : "single-sided";
        return String.format("total pages: %d, color pages: %d, black-and-white pages: %d, %s. total: $%.2f",
                totalPages, colorPages, bwPages, side, calculateTotal());
    }
}
