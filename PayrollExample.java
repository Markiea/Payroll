package com.teamtreehouse;
import javax.swing.JOptionPane;

public class PayrollExample {
    public static void main(String[] args) {

        String Employee_name = JOptionPane.showInputDialog( " State Employee name :");

        String Hours_Worked_String = JOptionPane.showInputDialog("How many hours were worked :");

        double Horus_Worked = Double.parseDouble(Hours_Worked_String);

        String Hourly_pay_String = JOptionPane.showInputDialog("What is the Hourly pay? :");

        double Hously_pay = Double.parseDouble(Hourly_pay_String);

        String Federal_Tax_Withholding_rate_String = JOptionPane.showInputDialog(" What is the Tax Withholding rate? :");

        double Federal_Tax_Witholding_rate = Double.parseDouble(Federal_Tax_Withholding_rate_String);

        String State_Tax_Witholding_rate_String = JOptionPane.showInputDialog("What is the State Tax Withholding rate? :");

        double State_Tax_Witholding_Rate = Double.parseDouble(State_Tax_Witholding_rate_String);

       double Employee_Pay_Gross_Pay = Horus_Worked * Hously_pay;

       double TOtal_Deductions =  ( Federal_Tax_Witholding_rate * Employee_Pay_Gross_Pay) + (State_Tax_Witholding_Rate * Employee_Pay_Gross_Pay);

       String output = " Total Gross pay is" + Employee_Pay_Gross_Pay + " and Total Deductions are" + TOtal_Deductions;
       
       JOptionPane.showMessageDialog(null, output);


    }
}
