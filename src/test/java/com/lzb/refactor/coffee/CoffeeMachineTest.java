package com.lzb.refactor.coffee;

import com.lzb.SystemOutUtils;
import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;

@RunWith(MockitoJUnitRunner.class)
class CoffeeMachineTest {

    @Test
    void test_one() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("1");
        CoffeeMachineMock.run("2");
        CoffeeMachineMock.run("3");
        CoffeeMachineMock.run("4");
        CoffeeMachineMock.run("5");
        CoffeeMachineMock.run("6");
        Approvals.verify(SystemOutUtils.convert(output));
    }

    /*@Test
    void test_two() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("2");
        Approvals.verify(SystemOutUtils.convert(output));
    }*/

}