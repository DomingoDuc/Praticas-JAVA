package UNIDADE14.exemplo1.entities;

public class BussinesAccount extends Account{

    private Double loanLimit;

    public BussinesAccount(){
        super();
    }

    public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if (amount <=loanLimit){
            balance += amount - 10.0;
        }
    }

}
