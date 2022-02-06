package com.lzb.pricinple.lsp.v2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 里式替换原则的目的是使用约定的方式，让使用继承后的代码具备良好的扩展性和兼容性<br/>
 *
 * 原则：继承不能破坏父类的功能方法
 *
 * 储蓄卡和信用卡在功能使用上有些许类似，在实际的开发过程中也有很多共同可复用的逻辑。s实现这样的类的最好方式是提取一个抽象类，
 * 由抽象类定义所有卡的共用核心属性、逻辑，把卡的支付和还款等动作抽象成"正向"和"逆向"操作
 *
 * Created on : 2022-02-06 22:37
 *
 * @author lizebin
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("里氏替换前，CashCard类：");
        CashCard bankCard = new CashCard("6214567800989876", "2020-10-01");
        // 提现
        bankCard.withdrawal("100001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("100001", new BigDecimal(100));

        log.info("里氏替换后，CreditCard类，就算替换成子类，不会影响父类的功能：");
        CashCard creditCard = new CreditCard("6214567800989876", "2020-10-01");
        // 提现
        creditCard.withdrawal("100001", new BigDecimal(1000000));
        // 储蓄
        creditCard.recharge("100001", new BigDecimal(100));

        // 对外是扩展方法，实际是沿用父类的方法
        CreditCard creditCard1 = new CreditCard("6214567800989876", "2020-10-01");
        // 支付，贷款（实际是复用父类的方法）
        creditCard1.loan("100001", new BigDecimal(100));
        // 还款
        creditCard1.repayment("100001", new BigDecimal(100));
    }

}
