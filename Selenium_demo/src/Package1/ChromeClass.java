package Package1;

public class ChromeClass extends BrowserDemo2 {

	public static void main(String[] args) {
		Browser_demo obj =new ChromeClass();
		//
		obj.openINt();
		((ChromeClass) obj).getUrl();
		obj.refreshINIT();
		obj.closeINT();
	}

	@Override
	public void openINt() {
	 System.out.println("Open Chrome");
		
	}

	@Override
	public void refreshINIT() {
		System.out.println("refresh chrome");
		
	}

	@Override
	public void closeINT() {
		System.out.println("Close chrome");
		
	}



	@Override
	public void getUrl() {
		System.out.println("Get Url for Crome");
		
	}

}
