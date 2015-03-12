package com.example.joshheinrichs.robotiumsetup;

import android.test.ActivityInstrumentationTestCase2;

import com.example.joshheinrichs.jenkinssetup.MainActivity;
import com.robotium.solo.Solo;

import junit.framework.Assert;

public class MainActivityIT extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityIT()
    {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testFailure() {
        Assert.assertTrue(true);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}