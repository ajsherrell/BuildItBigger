package com.udacity.gradle.builditbigger;


import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsTest {

    @Test
    public void testVerifyNonEmptyResponse() {
        String response = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext());
        try {
            response = endpointsAsyncTask.get();
            Log.d("verifyNonEmptyResponse", "Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(response);
    }
}