package com.udacity.gradle.builditbigger;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class OpenJokeDisplayActivityTest {

    public static final String EMPTY_STRING = "";

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void clickGetJokeTest() {

        //Checks to verify that the button is clicked in MainActivity
        onView(withId(R.id.joke_button)).perform(click());

        //Checks to verify that new view is loaded
        onView(withId(R.id.joke_display_text)).check(matches(not(withText(EMPTY_STRING))));

    }
}