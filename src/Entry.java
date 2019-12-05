/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaydevraval
 */
class Entry {
    String date;
    String amount;
    
    public Entry(String date,String amount){
        this.date = date;
        this.amount = amount;
    }
    
    public String getdate()
    {
        return date;
    }
    public String getamount()
    {
        return amount;
    }
    
}
