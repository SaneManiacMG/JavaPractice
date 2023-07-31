package com.sane.maniac.mg.enums;

public class BasicEnumUsage {
    public static void main(String[] args) {
        ProcessStatus status = ProcessStatus.RUNNING;
        checkStatus(status);
        status = ProcessStatus.STOPPED;
        checkStatus(status);
        status = ProcessStatus.PAUSED;
        checkStatus(status);
        status = ProcessStatus.UNKNOWN;
        checkStatus(status);
    }

    static void checkStatus(ProcessStatus status) {
        switch (status) {
            case RUNNING:
                System.out.println("Process is running.");
                break;
            case STOPPED:
                System.out.println("Process is stopped.");
                break;
            case PAUSED:
                System.out.println("Process is paused.");
                break;
            default:
                System.out.println("Process status is unknown.");
                break;
        }
    }
}
