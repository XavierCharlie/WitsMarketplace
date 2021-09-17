package com.example.witsmarketplace;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import android.app.Instrumentation;
import android.widget.EditText;
import android.widget.TextView;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import com.example.witsmarketplace.Login.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity mActivity = null;
    public String wrongDetails = "Incorrect email, make sure you have registered before you can login.";
    public String correctDetails = "Login successful. Thank you for shopping with us!";
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(LandingPageActivity.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void checkUsernameField()
    {
        EditText etUsername = mActivity.findViewById(R.id.etUsername);
        assertNotNull(etUsername); // this checks that the username field is not empty (has hint)

    }

    @Test
    public void checkPasswordField(){
        EditText etPassword = mActivity.findViewById(R.id.etPassword);
        assertNotNull(etPassword);
    }

    @Test
    public void checkTextView(){
        TextView tvWits = mActivity.findViewById(R.id.text_view_id);
        String sWits = tvWits.getText().toString().trim();
        assertEquals("Welcome to Wits MarketPlace",sWits);
    }



    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}