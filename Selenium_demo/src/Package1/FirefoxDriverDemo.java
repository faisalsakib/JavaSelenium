package Package1;

public class FirefoxDriverDemo  extends BrowserDemo2{

	public static void main(String[] args) {
		Browser_demo obj = new FirefoxDriverDemo();
		obj.openINt();
		((FirefoxDriverDemo) obj).getUrl();
		obj.refreshINIT();
		obj.closeINT();

	}

	@Override // polymorfism
	public void openINt() {
		System.out.println("Open FireFox");
		
	}

	@Override
	public void refreshINIT() {
		System.out.println("Refreash FireFox");
		
	}

	@Override
	public void closeINT() {
		System.out.println("Close FireFox");
		
	}

	@Override
	public void getUrl() {
	System.out.println("Get Url for firefox");
		
	}

}
