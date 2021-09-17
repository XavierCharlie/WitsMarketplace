package com.example.witsmarketplace;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

import android.app.Instrumentation;
import android.widget.EditText;

import androidx.test.rule.ActivityTestRule;

import com.example.witsmarketplace.Login.RegistrationActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class RegistrationActivityTest {
    @Rule
    public ActivityTestRule<RegistrationActivity> rActivityTestRule = new ActivityTestRule<>(RegistrationActivity.class);
    private RegistrationActivity mActivity = null;
    public String wrongDetails = "you have already registered , Please Login";
    public String correctDetails = "Registered successfully";
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(LandingPageActivity.class.getName(),null,false);

    @Test
    public void FirstnameCheck(){
        EditText firstname = mActivity.findViewById(R.id.Firstname);
        assertNotNull(firstname);
    }
    @Test
    public void LastnameCheck(){
        EditText lastname = mActivity.findViewById(R.id.Lastname);
        assertNotNull(lastname);
    }
    @Test
    public void Emailcheck(){
        EditText Email = mActivity.findViewById(R.id.email);
        assertNotNull(Email);
    }
    @Test
    public void Password(){
        EditText Password = mActivity.findViewById(R.id.Password);
        assertNotNull(Password);
    }
    @Test
    public void ConPassword(){
        EditText ConnPassowrd = mActivity.findViewById(R.id.ConfirmPassword);
        assertNotNull(ConnPassowrd);
    }

    @Before
    public void setUp() throws Exception {
        mActivity = rActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null ;
    }
}