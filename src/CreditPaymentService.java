public class CreditPaymentService {

    public int calculate(int loanAmount, int loanTerm, double annualPercentage) {
    /*
    loanAmount - сумма кредита
    loanTerm - срок кредита (в годах)
    annualPercentage - годовая процентная ставка по кредиту
     */
        double monthPercentage = annualPercentage / 12 / 100;
    /*
    monthPercentage - месячная процентная ставка по кредиту в долях от единицы
     */

        int result = (int) (loanAmount * monthPercentage * Math.pow((1 + monthPercentage), loanTerm * 12) / (Math.pow((1 + monthPercentage), loanTerm * 12) - 1));
    /*
    формула расчета ежемесячного аннуитетного платежа
     */

        // int result = (int) annuityPayment;
        return result;
    }

}
