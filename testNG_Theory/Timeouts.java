package testNG_Theory;

import org.testng.annotations.Test;

public class Timeouts {

    @Test(timeOut = 500)
    public void timeTestOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Tine test method one");
    }

    @Test(timeOut = 500)
    public void timeTestTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method two");
    }
}