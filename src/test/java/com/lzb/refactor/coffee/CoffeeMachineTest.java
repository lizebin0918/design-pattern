package com.lzb.refactor.coffee;

import com.lzb.SystemOutUtils;
import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    @Test
    void test_all() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("1");
        CoffeeMachineMock.run("2");
        CoffeeMachineMock.run("3");
        CoffeeMachineMock.run("4");
        CoffeeMachineMock.run("5");
        CoffeeMachineMock.run("6");
        Approvals.verify(SystemOutUtils.convert(output));
    }

    @Test
    void test_one_multiple() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("1");
        CoffeeMachineMock.run("1");
        CoffeeMachineMock.run("1");
        Approvals.verify(SystemOutUtils.convert(output));
    }

    @Test
    void should_refresh() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("r");
        Approvals.verify(SystemOutUtils.convert(output));
    }

    @Test
    void should_quit() {
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
        CoffeeMachineMock.run("q");
        Approvals.verify(SystemOutUtils.convert(output));
    }

}