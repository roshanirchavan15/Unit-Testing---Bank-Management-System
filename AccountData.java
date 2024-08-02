public class AccountData {
    private int accountNumber;
    private String userName,userPAN,userAddress,accountNominee,userPhoneNumber, userAadhaarNumber,accountPassword;
    private String userDOB;
    private double accountBalance;
//constructor
    public void getAccountDetails(String userName,String userDOB,String userAddress,String accountNominee,String userPAN,String userPhoneNumber,String userAadharNumber,double accountBalance,String accountPassword){
        this.userName=userName;
        this.userDOB = userDOB;
        this.userAddress=userAddress;
        this.accountNominee = accountNominee;
        this.userPAN = userPAN;
        this.userPhoneNumber = userPhoneNumber;
        this.userAadhaarNumber =userAadharNumber;
        this.accountBalance = accountBalance;
        this.accountPassword = accountPassword;
    }
//getter and setter functions
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPAN() {
        return userPAN;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getAccountNominee() {
        return accountNominee;
    }

    public void setAccountNominee(String accountNominee) {
        this.accountNominee = accountNominee;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserAadhaarNumber() {
        return userAadhaarNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setAccountPassword( String accountPassword ) {
        this.accountPassword = accountPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
