package generalization;

public class GenetalizationStudy {

	public static void main(String[] args) {
	SBI sbi=new SBI();
	ICICI icici=new ICICI();
	HDFC hdfc=new HDFC();
	System.out.println(RBI.zeroBalance);
	sbi.loan();
	sbi.deposite();
	sbi.transfer();
	sbi.withdraw();
	System.out.println("========================================================");
	icici.loan();
	icici.transfer();
	System.out.println("=================================================");
	hdfc.transfer();
	hdfc.withdraw();

	}

}
