package com.lzb.command.cook;

/**
 * <br/>
 * Created on : 2021-11-20 09:41
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCooker());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCooker());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);

        // 下单
        xiaoEr.placeOrder();
    }

}
