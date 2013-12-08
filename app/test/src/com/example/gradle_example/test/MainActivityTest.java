package src.com.example.gradle_example.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.example.gradle_example.MainActivity;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	Activity mainActivity = null;
	Button button = null;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mainActivity = getActivity();
	}

	public void testChangeText() {
		//Simple test xD
		assertEquals("1", "1");
	}

}
