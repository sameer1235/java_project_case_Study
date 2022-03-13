package GoShopiing;

abstract class ShopFactory{
	public String getNewPrimeAcc (int AccNo,String accNm,float charges,boolean isPrime) {
		return null;
		
	}
	public String getNewNormalAcc (int AccNo,String accNm,float charges,float deliveryCharge) {
		return null;
		
	}
}

public class GSShopFactory extends ShopFactory {
	public String getNewPrimeAcc (int AccNo,String accNm,float charges,boolean isPrime) {
		return "PrimeAcc(Account No: "+ AccNo +" | Account Name : "+accNm+" | Charges: "+charges+" | Is it Prime Account :"+isPrime+")";

		
	}
	public String getNewNormalAcc (int AccNo,String accNm,float charges,float deliveryCharge) {
		//return "hello sam" ;
		return "NormalAcc(Account No: "+ AccNo +" | Account Name : "+accNm+" | Charges: "+charges+" | Delivery charges : "+deliveryCharge+")";

	}

	public static void main(String[] args) {
		
		GSShopFactory gssf = new GSShopFactory();
		//gssf.getNewPrimeAcc(234, "sam", 200, true);
		System.out.println(gssf.getNewNormalAcc(2110812, "sam", 100, 50));
		System.out.println(gssf.getNewPrimeAcc(234, "sam", 200, true));

	}

}
