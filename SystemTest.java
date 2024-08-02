import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SystemTest {

    //object of class
    BankManagementSystem bankManagementSystem;

    @BeforeClass
    //created everytime a test case is initiated
    public static void setUpBeforeClass() {
        System.out.println("before class");
    }

    @Before
    public void setUp() {
        if(null == bankManagementSystem) {
            bankManagementSystem=new BankManagementSystem();
        }
    }

    @Test
    public void loginAccount1(){
        System.out.println("Testing for Login with Correct Credentials\n");
        System.out.println("Expected Output:Logged In Successful to Account Number:369801\n");
        //comparision(testing, checking in database)
        Assert.assertEquals( "Logged In Successful to Account Number:369801",bankManagementSystem.loginUser( 369801,"Adv1234#" ) );
    }

    @Test
    public void loginAccount2(){
        System.out.println("Testing for Login with Wrong Credentials\n");
        System.out.println("Expected Output: Login Failed");
        Assert.assertEquals( "Login Failed",bankManagementSystem.loginUser( 369802,"Tam1234#") );
    }

    @Test
    public void registerAccount(){
        System.out.println("Testing for Registration\n");
        String[] accDetails=bankManagementSystem.openNewAccount();
        String[] expectedOp={"369806","Adv1234#"};
        System.out.println("Expected Output: AccNo:369806 Password: Adv1234#");
        System.out.println("Output: AccNo"+accDetails[0]+" Password: "+accDetails[1]);
        Assert.assertArrayEquals(expectedOp,accDetails);
    }

    @Test
    public void withdrawAmount1(){
        System.out.println("Testing for Withdrawing Amount with Correct Deduction\n");
        System.out.println("Expected Output: Rs.6700");
        Assert.assertEquals( 7700.0,bankManagementSystem.withdrawAmount( 369803,300 ),4 );
    }

    @Test
    public void withdrawAmount2(){
        System.out.println("Testing for Withdrawing Amount with Wrong Deduction\n");
        System.out.println("Expected Output: Rs.6600");
        Assert.assertEquals( 6600.0,bankManagementSystem.withdrawAmount( 369804,400 ),4 );
    }
    @Test
    public void depositAmount1(){
        System.out.println("Testing for Withdrawing Amount with Correct Deposition\n");
        System.out.println("Expected Output: Rs.9600");
        Assert.assertEquals( 9600.0,bankManagementSystem.depositedAmount( 369802,600 ),4 );
    }

    @Test
    public void depositAmount2(){
        System.out.println("Testing for Withdrawing Amount with Correct Deposition\n");
        System.out.println("Expected Output: Rs.5950");
        Assert.assertEquals( 5950.0,bankManagementSystem.depositedAmount( 369804,950 ),4 );
    }

    @Test
    public void updateAccountNominee(){
        System.out.println("Testing for Changing Account Nominee\n");
        System.out.println("Expected Output: Pranav Thakur");
        Assert.assertEquals("Pranav Thakur",bankManagementSystem.updateData( 369800,"accountNominee","Pranav Thakur" )  );
    }

    @Test
    public void updateAccountPhoneNumber(){
        System.out.println("Testing for Changing Account Nominee\n");
        System.out.println("Expected Output: 6395284170");
        Assert.assertEquals("6395284170",bankManagementSystem.updateData( 369804,"userPhoneNumber","6395284170" )  );
    }

    @Test
    public void updateAccountPassword(){
        System.out.println("Testing for Changing Account Nominee\n");
        System.out.println("Expected Output: Zxc3456%");
        Assert.assertEquals("Zxc3456%",bankManagementSystem.updateData( 369805,"accountPassword","Zxc3456%" )  );
    }

    @Test
    public  void transferMoney1(){
        System.out.println("Testing for Transferring Money\n");
        double[] money={5050,6500};
        System.out.println("Expected Output: Acc1: Rs.4500, Acc2: Rs.5500");
        double[] afterTransfer=bankManagementSystem.transferMoney(369804,369805,500);
        System.out.println("Output: Acc1: Rs."+afterTransfer[0]+"Acc2: Rs."+afterTransfer[1]);
        Assert.assertArrayEquals(money,afterTransfer,4);
    }

    @Test
    public  void transferMoney2(){
        System.out.println("Testing for Transferring Money\n");
        double[] money={7114,9486};
        System.out.println("Expected Output: Acc1: Rs.6214, Acc2: Rs.5700");
        double[] afterTransfer=bankManagementSystem.transferMoney(369802,369801,486);
        System.out.println("Output: Acc1: Rs."+afterTransfer[0]+"Acc2: Rs."+afterTransfer[1]);
        Assert.assertArrayEquals(money,afterTransfer,4);
    }

    @Test
    public void displayData(){
        System.out.println("Testing for Displaying Account D3tails:\n");
        String expectedOp="369802 | Chaitra Patwardhan | 9876543210 | 321654987321 | ASDFG3265H | 05-04-2000 | Sinhgad Rd. | Purushottam Patwardhan";
        System.out.println("Expected Output:"+expectedOp);
        Assert.assertEquals(expectedOp, bankManagementSystem.displayAccData(369801));

    }

}
