package com.khahani.whatsappsaver.usecases;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.khahani.whatsappsaver.usecases.TargetApp.INSTALLED;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class TargetAppInstrumentTest {

    TargetApp targetApp;
    private Context context;

    @Before
    public void setUp() throws Exception {
        context = ApplicationProvider.getApplicationContext();
        targetApp = Main.getCreator().getTargetApp();
        ((TargetAppAndroidImpl) targetApp).setContext(context);
    }

    @Test(expected = TargetApp.AppNotExists.class)
    public void when_an_app_not_found_then_error() throws RuntimeException {
        String appId = "wrong.package.name";
        targetApp.installed(appId);
    }

    @Test
    public void when_an_app_found_then_show_information() throws RuntimeException {
        String appId = "com.whatsapp";
        assertEquals(INSTALLED, targetApp.installed(appId));
    }

}
