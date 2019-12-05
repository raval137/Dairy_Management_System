/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaydevraval
 */
class Customer {
    String customer_id,first_name,last_name,phone_number,address,gender,email_id,date_of_join;
    
    public Customer(String customer_id,String first_name,String last_name,String phone_number,String address,String gender,String email_id,String date_of_join){
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.address = address;
        this.gender = gender;
        this.email_id = email_id;
        this.date_of_join = date_of_join;
    }
    
    public String getcustomer_id()
    {
        return customer_id;
    }
    public String getfirst_name()
    {
        return first_name;
    }
    public String getlast_name()
    {
        return last_name;
    }
    public String getphone_number()
    {
        return phone_number;
    }
    public String getaddress()
    {
        return address;
    }
    public String getgender()
    {
        return gender;
    }
    public String getemail_id()
    {
        return email_id;
    }
    public String getdate_of_join()
    {
        return date_of_join;
    }
}
