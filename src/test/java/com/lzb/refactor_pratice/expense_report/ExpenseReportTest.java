package com.lzb.refactor_pratice.expense_report;

import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static com.lzb.refactor_pratice.expense_report.ExpenseType.*;

public class ExpenseReportTest {

    @BeforeEach
    public void before() {
    }

    @Test
    public void empty_report() {

        // System.out 重定向:ExpenseReportTest.empty_report.received，如果输出语句包含了当前时间，每次都会变的
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();

        ExpenseReport report = new ExpenseReport();
        report.printReport(new Expenses(Collections.emptyList()), new Date(0));

        Approvals.verify(output);

    }

    /**
     * 需要测试的用例，模拟方法内的逻辑
     * DINNER:5000
     * DINNER:5001
     * BREAKFAST:1000
     * BREAKFAST:1001
     * CAR_RENTAL:50
     * CAR_RENTAL:MAX_VALUE
     */
    @Test
    public void big_report() {

        // System.out 重定向:ExpenseReportTest.empty_report.received，如果输出语句包含了当前时间，每次都会变的
        ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();

        ExpenseReport report = new ExpenseReport();
        Expenses expenses = new Expenses(List.of(
            new Expense(DINNER, 5000),
            new Expense(DINNER, 5001),
            new Expense(BREAKFAST, 1000),
            new Expense(BREAKFAST, 1001),
            new Expense(CAR_RENTAL, 50),
            new Expense(CAR_RENTAL, Integer.MAX_VALUE)
        ));
        report.printReport(expenses, new Date(0));

        Approvals.verify(output);


    }

}