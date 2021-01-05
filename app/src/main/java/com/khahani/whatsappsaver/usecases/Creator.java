package com.khahani.whatsappsaver.usecases;

public abstract class Creator {

    private TargetApp targetApp;

    public TargetApp getTargetApp() {
        if (targetApp == null)
            targetApp = factoryMethod();
        return targetApp;
    }

    protected abstract TargetApp factoryMethod();
}
