public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public double getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip =+ cost;
    }

    public double tipAmount(){
        return (int) ((totalBillBeforeTip*(tipPercentage/100.0))*100.0)/100.0;
    }

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip(){
        return (int) ((totalBillBeforeTip/numPeople)*100)/100.0;
    }

    public double perPersonTipAmount(){
        return (int) ((tipAmount()/numPeople)*100)/100.0;
    }

    public double perPersonTotalCost(){
        return  ((totalBill()/numPeople)*100)/100.0;
    }
}
