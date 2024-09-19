package week1.homeassignment;

public class Browser {

	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}
	public void loadUrl(){
		System.out.println("Application URL loaded Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Browser browser = new Browser();
browser.launchBrowser("Browser launched successfully");
browser.loadUrl();
	}

}
