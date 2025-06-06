interface paymentgateway {
    boolean processpayment(double amount);
    String getTeansactionId(String transactionid);
}
class creditcardpayment implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("Processing payment $" + amount);
        return true;
    }
    public String getTeansactionId(String transactionid) {
        return "Credit Card Transaction ID: " + transactionid;
    }   
}
class UPIpayment implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("Processing UPI payment $" + amount);
        return true;
    }
    public String getTeansactionId(String transactionid) {
        return "UPI Transaction ID: " + transactionid;
    }   
}