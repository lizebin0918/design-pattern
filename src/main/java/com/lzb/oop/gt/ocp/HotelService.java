package com.lzb.oop.gt.ocp;

import lombok.Data;

/**
 * 旅馆服务:假如我们正在开发一个酒店预订系统，针对不同的用户，我们需要计算出不同的房价。
 * 比如，普通用户是全价，金卡是 8 折，银卡是 9 折，代码写出来可能是这样的<br/>
 * Created on : 2021-12-06 22:57
 *
 * @author lizebin
 */
public class HotelService {

    /**
     * 获取房间价格
     * @param user
     * @param room
     * @return
     */
    public double getRoomPriceV1(final User user, final Room room) {
        double price = room.getPrice();
        if (user.getLevel() == UserLevel.GOLD) {
            return price * 0.8;
        }
        if (user.getLevel() == UserLevel.SILVER) {
            return price * 0.9;
        }
        if (user.getLevel() == UserLevel.PLATINUM) {
            return price * 0.75;
        }
        return price;
    }


    public double getRoomPriceV2(final User user, final Room room) {
        return user.getRoomPrice(room);
    }

    private enum UserLevel {
        /**
         * 黄金、银、白金
         */
        GOLD(0.8), SILVER(0.9), PLATINUM(0.75);
        private final double discount;
        UserLevel(double price) {
            this.discount = price;
        }

        public double getRoomPrice(final Room room) {
            return discount * room.getPrice();
        }
    }

    @Data
    private static class User {
        private String name;
        private UserLevel level;

        public double getRoomPrice(final Room room) {
            return level.getRoomPrice(room);
        }

    }

    @Data
    private static class Room {
        private double price;
    }


}
