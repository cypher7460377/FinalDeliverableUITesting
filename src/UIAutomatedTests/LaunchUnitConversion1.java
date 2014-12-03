package UIAutomatedTests;

import android.os.RemoteException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LaunchUnitConversion1 extends UiAutomatorTestCase {
	
	public void testLaunchUnitConversion() throws UiObjectNotFoundException {   
	      
	      // Simulate a short press on the HOME button.
	      getUiDevice().pressHome();
	      try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // We’re now in the home screen. Next, we want to simulate 
	      // a user bringing up the All Apps screen.
	      // If you use the uiautomatorviewer tool to capture a snapshot 
	      // of the Home screen, notice that the All Apps button’s 
	      // content-description property has the value “Apps”.  We can 
	      // use this property to create a UiSelector to find the button. 
	      UiObject allAppsButton = new UiObject(new UiSelector()
	         .description("Apps"));
	      
	      // Simulate a click to bring up the All Apps screen.
	      allAppsButton.clickAndWaitForNewWindow();
	      
	      // In the All Apps screen, the Settings app is located in 
	      // the Apps tab. To simulate the user bringing up the Apps tab,
	      // we create a UiSelector to find a tab with the text 
	      // label “Apps”.
	      UiObject appsTab = new UiObject(new UiSelector()
	         .text("Apps"));
	      
	      // Simulate a click to enter the Apps tab.
	      appsTab.click();

	      // Next, in the apps tabs, we can simulate a user swiping until
	      // they come to the Settings app icon.  Since the container view 
	      // is scrollable, we can use a UiScrollable object.
	      UiScrollable appViews = new UiScrollable(new UiSelector()
	         .scrollable(true));
	      
	      // Set the swiping mode to horizontal (the default is vertical)
	      appViews.setAsHorizontalList();
	      
	      // Create a UiSelector to find the Settings app and simulate      
	      // a user click to launch the app. 
	      UiObject unitsApp = appViews.getChildByText(new UiSelector()
	         .className(android.widget.TextView.class.getName()), 
	         "UnitConversion");
	      unitsApp.clickAndWaitForNewWindow();
	      
	      // Validate that the package name is the expected one
	      UiObject settingsValidation = new UiObject(new UiSelector()
	         .packageName("com.example.unitconversion1"));
	      assertTrue("Unable to detect Settings", 
	         settingsValidation.exists());     
	}
	
	public void testAndroidHintsNotSame() throws UiObjectNotFoundException {
		// Simulate a short press on the HOME button.
		getUiDevice().pressHome();
		try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// We’re now in the home screen. Next, we want to simulate 
		// a user bringing up the All Apps screen.
		// If you use the uiautomatorviewer tool to capture a snapshot 
		// of the Home screen, notice that the All Apps button’s 
		// content-description property has the value “Apps”.  We can 
		// use this property to create a UiSelector to find the button. 
		UiObject allAppsButton = new UiObject(new UiSelector()
		.description("Apps"));

		// Simulate a click to bring up the All Apps screen.
		allAppsButton.clickAndWaitForNewWindow();

		// In the All Apps screen, the Settings app is located in 
		// the Apps tab. To simulate the user bringing up the Apps tab,
		// we create a UiSelector to find a tab with the text 
		// label “Apps”.
		UiObject appsTab = new UiObject(new UiSelector()
		.text("Apps"));

		// Simulate a click to enter the Apps tab.
		appsTab.click();

		// Next, in the apps tabs, we can simulate a user swiping until
		// they come to the Settings app icon.  Since the container view 
		// is scrollable, we can use a UiScrollable object.
		UiScrollable appViews = new UiScrollable(new UiSelector()
		.scrollable(true));

		// Set the swiping mode to horizontal (the default is vertical)
		appViews.setAsHorizontalList();

		// Create a UiSelector to find the Settings app and simulate      
		// a user click to launch the app. 
		UiObject unitsApp = appViews.getChildByText(new UiSelector()
		.className(android.widget.TextView.class.getName()), 
		"UnitConversion");
		unitsApp.clickAndWaitForNewWindow();
		
		UiSelector editText1 = new UiSelector().description("First temperature");
		UiObject input1 = new UiObject(editText1);
		input1.clearTextField();

		UiSelector editText2 = new UiSelector().description("Second temperature");
		UiObject input2 = new UiObject(editText2);
		input2.clearTextField();
		
		assertFalse("Android hints are the same! Change them!", input1.getText().equals(input2.getText()));
	}
	
	public void testHorizontalLayoutWontDeleteData() throws UiObjectNotFoundException {
		// Simulate a short press on the HOME button.
		getUiDevice().pressHome();
		try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// We’re now in the home screen. Next, we want to simulate 
		// a user bringing up the All Apps screen.
		// If you use the uiautomatorviewer tool to capture a snapshot 
		// of the Home screen, notice that the All Apps button’s 
		// content-description property has the value “Apps”.  We can 
		// use this property to create a UiSelector to find the button. 
		UiObject allAppsButton = new UiObject(new UiSelector()
		.description("Apps"));

		// Simulate a click to bring up the All Apps screen.
		allAppsButton.clickAndWaitForNewWindow();

		// In the All Apps screen, the Settings app is located in 
		// the Apps tab. To simulate the user bringing up the Apps tab,
		// we create a UiSelector to find a tab with the text 
		// label “Apps”.
		UiObject appsTab = new UiObject(new UiSelector()
		.text("Apps"));

		// Simulate a click to enter the Apps tab.
		appsTab.click();

		// Next, in the apps tabs, we can simulate a user swiping until
		// they come to the Settings app icon.  Since the container view 
		// is scrollable, we can use a UiScrollable object.
		UiScrollable appViews = new UiScrollable(new UiSelector()
		.scrollable(true));

		// Set the swiping mode to horizontal (the default is vertical)
		appViews.setAsHorizontalList();

		// Create a UiSelector to find the Settings app and simulate      
		// a user click to launch the app. 
		UiObject unitsApp = appViews.getChildByText(new UiSelector()
		.className(android.widget.TextView.class.getName()), 
		"UnitConversion");
		unitsApp.clickAndWaitForNewWindow();
		UiSelector editText1 = new UiSelector().description("First temperature");
		UiObject input1 = new UiObject(editText1);
		input1.setText("32");

		try {
			getUiDevice().setOrientationLeft();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("32", input1.getText());
	}
	
	public void testHomeWontDeleteData() throws UiObjectNotFoundException {
		 // Simulate a short press on the HOME button.
	      getUiDevice().pressHome();
	      try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // We’re now in the home screen. Next, we want to simulate 
	      // a user bringing up the All Apps screen.
	      // If you use the uiautomatorviewer tool to capture a snapshot 
	      // of the Home screen, notice that the All Apps button’s 
	      // content-description property has the value “Apps”.  We can 
	      // use this property to create a UiSelector to find the button. 
	      UiObject allAppsButton = new UiObject(new UiSelector()
	         .description("Apps"));
	      
	      // Simulate a click to bring up the All Apps screen.
	      allAppsButton.clickAndWaitForNewWindow();
	      
	      // In the All Apps screen, the Settings app is located in 
	      // the Apps tab. To simulate the user bringing up the Apps tab,
	      // we create a UiSelector to find a tab with the text 
	      // label “Apps”.
	      UiObject appsTab = new UiObject(new UiSelector()
	         .text("Apps"));
	      
	      // Simulate a click to enter the Apps tab.
	      appsTab.click();

	      // Next, in the apps tabs, we can simulate a user swiping until
	      // they come to the Settings app icon.  Since the container view 
	      // is scrollable, we can use a UiScrollable object.
	      UiScrollable appViews = new UiScrollable(new UiSelector()
	         .scrollable(true));
	      
	      // Set the swiping mode to horizontal (the default is vertical)
	      appViews.setAsHorizontalList();
	      
	      // Create a UiSelector to find the Settings app and simulate      
	      // a user click to launch the app. 
	      UiObject unitsApp = appViews.getChildByText(new UiSelector()
	         .className(android.widget.TextView.class.getName()), 
	         "UnitConversion");
	      unitsApp.clickAndWaitForNewWindow();

		UiSelector editTextBefore = new UiSelector().description("First temperature");
		UiObject inputBefore = new UiObject(editTextBefore);
		inputBefore.setText("32");

		getUiDevice().pressHome();
     
		// Simulate a click to bring up the All Apps screen.
		allAppsButton.clickAndWaitForNewWindow();

		// Simulate a click to enter the Apps tab.
		appsTab.click();

		// Set the swiping mode to horizontal (the default is vertical)
		appViews.setAsHorizontalList();

		unitsApp.clickAndWaitForNewWindow();
		
		UiSelector editTextAfter = new UiSelector().description("First temperature");
		UiObject inputAfter = new UiObject(editTextAfter);
		assertEquals("32", inputAfter.getText());
	}

}
