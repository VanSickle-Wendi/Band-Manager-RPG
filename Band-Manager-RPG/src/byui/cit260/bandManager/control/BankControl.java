/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

/**
 *
 * @author shaza
 */
public class BankControl {
  public double calcLoanPayment(double loanBalance, double rate, double extraPrincipal) {
          
    if (loanBalance < 0 || loanBalance > 25625) {
        return -999;
  }
    if (rate != .025) {
        return -999;
  }
 
    if (extraPrincipal < 0 || extraPrincipal > 25000){
        return -999;
  }
 
    double loanPayment = (loanBalance * rate) + extraPrincipal; 
        return loanPayment;
           
          
}
  
}

    
