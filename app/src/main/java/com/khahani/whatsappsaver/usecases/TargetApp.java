package com.khahani.whatsappsaver.usecases;

public abstract class TargetApp {
    public static final boolean INSTALLED = true;

    public abstract boolean installed(String appId);

    public static class AppNotExists extends RuntimeException {
    }
}
