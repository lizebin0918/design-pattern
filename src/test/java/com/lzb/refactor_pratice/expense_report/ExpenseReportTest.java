package com.lzb.refactor_pratice.expense_report;

import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Date;

public class ExpenseReportTest {

    @BeforeEach
    public void before() {
    }

    @Test
    public void empty_report() {

        // System.out 重定向:ExpenseReportTest.empty_report.received，如果输出语句包含了当前时间，每次都会变的
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();

        ExpenseReport report = new ExpenseReport();
        report.printReport(Collections.emptyList(), new Date(0));

        Approvals.verify(output);

    }

}