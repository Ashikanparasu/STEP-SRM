class FindProfit{
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.printf("""Cost Price: INR %.2fSelling Price: INR %.2fProfit: INR %.2fProfit Percentage: %.2f%%""", costPrice, sellingPrice, profit, profitPercentage);
}
}
