package org.example;

import org.junit.Assert;

import java.nio.channels.AcceptPendingException;
import java.nio.file.AccessDeniedException;

public class Test{

    private MultNumber umn = new MultNumber();

    @org.junit.Test
    public void Test1() throws MultException{

        int result = umn.Calc(4, 6);

        Assert.assertEquals(result, 24);
    }

    @org.junit.Test(expected = MultException.class)
    public void Test2() throws MultException{
        int result = umn.Calc(4, 7);

    }
}

