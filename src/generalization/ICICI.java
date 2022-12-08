package generalization;

public class ICICI implements RBI
{

	@Override
	public void deposite() {
		System.out.println("deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}

	@Override
	public void loan() {
		System.out.println("loan");
		
	}

	@Override
	public void transfer() {
		System.out.println("transfer");
		
	}

}
