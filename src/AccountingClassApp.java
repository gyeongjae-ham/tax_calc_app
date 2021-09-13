class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
    }

    private double getDividend1() {
        return getIncome() * 0.5;
    }
    private double getDividend2() {
        return getIncome() * 0.3;
    }
    private double getDividend3() {
        return getIncome() * 0.2;
    }

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private double getTotal() {
        return valueOfSupply + getVat();
    }

    public double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {

//        Accounting.valueOfSupply = 10000.0;
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        Accounting.print();
        // 회계와 관련없는 메소드들도 섞여있을 경우
        // 프로그램 생산성을 저하할 수 있다

        // instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
    }
}