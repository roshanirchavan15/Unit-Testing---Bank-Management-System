import java.util.ArrayList;
import java.util.Scanner;

public class BankManagementSystem {
    public static Scanner scanner;
    public static ArrayList<AccountData> accountDataArrayList= new ArrayList<>();
    private static int latestAccNo = 369800;
//constructor
    public BankManagementSystem(){
        scanner=new Scanner(System.in);
        initializeAccounts();
    }

    public static int generateAccNo() {
        return ++latestAccNo;
    }

    public void initializeAccounts(){
        if(!accountDataArrayList.isEmpty()) {
           return;
        }
        //if empty then insert data
        AccountData[] accountData=new AccountData[5];
        accountData[0]=new AccountData();
        accountData[0].getAccountDetails("Advait Thakur","12-09-2000","Hadapsar","Milind Thakur","ASDFG3265H","9876543210","321654987321",6000,"Adv1234#");
        int accNo=generateAccNo();
        accountData[0].setAccountNumber(accNo);
        accountData[1]=new AccountData();
        accountData[1].getAccountDetails("Chaitra Patwardhan","05-04-2000","Sinhgad Rd.","Purushottam Patwardhan","ASDFG3265H","9876543210","321654987321",9000,"Adv1234#");
        accNo=generateAccNo();
        accountData[1].setAccountNumber(accNo);
        accountData[2]=new AccountData();
        accountData[2].getAccountDetails("Roshani Chanavn","17-05-2000","Sinhgad Rd.","Mr.Chavan","ASDFG3265H","9876543210","321654987321",7000,"Adv1234#");
        accNo=generateAccNo();
        accountData[2].setAccountNumber(accNo);
        accountData[3]=new AccountData();
        accountData[3].getAccountDetails("Neha Adawadkar","03-10-2000","Pune","Mr.Adawadkar","ASDFG3265H","9876543210","321654987321",8000,"Adv1234#");
        accNo=generateAccNo();
        accountData[3].setAccountNumber(accNo);
        accountData[4]=new AccountData();
        accountData[4].getAccountDetails("Bhavik Ransubhe","14-01-2000","MKTYD","Ransubhe","ASDFG3265H","9876543210","321654987321",5000,"Adv1234#");
        accNo=generateAccNo();
        accountData[4].setAccountNumber(accNo);
        accountDataArrayList.add(accountData[0]);
        accountDataArrayList.add(accountData[1]);
        accountDataArrayList.add(accountData[2]);
        accountDataArrayList.add(accountData[3]);
        accountDataArrayList.add(accountData[4]);
    }

    public String[] openNewAccount(){
        String[] accountDetails=new String[2];
        AccountData accountData=new AccountData();
        accountData.getAccountDetails("Advait Thakur","12-09-2000","Sasanenagar","Milind Thakur","ASDFG3265H","9876543210","321654987321",6000,"Adv1234#");
        int accNo=generateAccNo();
        accountData.setAccountNumber(accNo);
        accountDataArrayList.add(accountData);
        //System.out.print("Account Created ! Account Number : "+"\033[0;31m"+accountData.getAccountNumber()+"\033[0m"+" And Password : "+"\033[0;31m"+accountData.getAccountPassword()+"\033[0m");
        accountDetails[0]=String.valueOf(accountData.getAccountNumber());
        accountDetails[1]=accountData.getAccountPassword();
        return accountDetails;
    }


    public String loginUser(int accNo,String password){
        boolean stat=false;
        int index = 0;
        for (int i = 0; i < accountDataArrayList.size(); i++) {
            if (accountDataArrayList.get(i).getAccountNumber() == accNo) {
                stat = true;
                index = i;
                break;
            }
        }
        if (stat) {
            String pass1 = accountDataArrayList.get(index).getAccountPassword();
            if (pass1.equals(password)) {
                return "Logged In Successful to Account Number:"+accNo;
            } else {
                return  "Login Failed";
            }
        } else {
            return  "Login Failed";
        }
    }



    public double withdrawAmount(int accNo,double amt){
        int index=accNo-369800;
        AccountData loggedInUser=accountDataArrayList.get( index );
        double amount = loggedInUser.getAccountBalance();
        double withdrawAmount;
        withdrawAmount = amt;
        if (withdrawAmount > amount) {
            return 0;
        } else {
            amount -= withdrawAmount;
            loggedInUser.setAccountBalance(amount);
        }
        return amount;
    }


    public double depositedAmount(int accNo,double amt){
        int index=accNo-369800;
        AccountData loggedInUser=accountDataArrayList.get( index );
        double amount = loggedInUser.getAccountBalance();
        double depositAmount;
        depositAmount = amt;
        amount += depositAmount;
        loggedInUser.setAccountBalance(amount);
        return amount;
    }


    public String updateData(int accNo,String field,String updatedValue){
        int index=accNo-369800;
        AccountData loggedInUser=accountDataArrayList.get(index);
        String updatedField="";
        switch (field) {
            case "accountNominee" -> {
                loggedInUser.setAccountNominee(updatedValue);
                return loggedInUser.getAccountNominee();
            }
            case "userPhoneNumber" -> {
                loggedInUser.setUserPhoneNumber(updatedValue);
                return loggedInUser.getUserPhoneNumber();
            }
            case "accountPassword" -> {
                loggedInUser.setAccountPassword(updatedValue);
                return loggedInUser.getAccountPassword();
            }
        }
        return updatedField;
    }

    public double[] transferMoney(int acc1,int acc2,double amt){
        double[] afterTransfer=new double[2];
        int index1=acc1-369800;
        int index2=acc2-369800;
        AccountData loggedInUser1=accountDataArrayList.get(index1);
        AccountData loggedInUser2=accountDataArrayList.get(index2);
        loggedInUser1.setAccountBalance(loggedInUser1.getAccountBalance()-amt);
        loggedInUser2.setAccountBalance(loggedInUser2.getAccountBalance()+amt);
        afterTransfer[0]=loggedInUser1.getAccountBalance();
        afterTransfer[1]=loggedInUser2.getAccountBalance();

        return afterTransfer;
    }

    public String displayAccData(int acc){
        int index=acc-369800;
        AccountData loggedInUser=accountDataArrayList.get(index);
        return loggedInUser.getAccountNumber()+" | "+loggedInUser.getUserName()+" | "+loggedInUser.getUserPhoneNumber()+" | "+
                loggedInUser.getUserAadhaarNumber()+" | "+loggedInUser.getUserPAN()+" | "+loggedInUser.getUserDOB()+" | "+
                loggedInUser.getUserAddress()+" | "+loggedInUser.getAccountNominee();
    }

}
