package com.khahani.whatsappsaver.usecases;

public class TargetAppAndroidCreator extends Creator {
    @Override
    protected TargetApp factoryMethod() {
        return new TargetAppAndroidImpl();
    }
}
