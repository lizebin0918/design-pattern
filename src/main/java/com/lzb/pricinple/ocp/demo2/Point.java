package com.lzb.pricinple.ocp.demo2;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * <br/>
 * Created on : 2022-05-08 07:16
 *
 * @author lizebin
 */
@Value
@AllArgsConstructor
public class Point {

    int x, y;

    public Point forward(Direction direction) {
        /*switch (direction) {
            case NORTH:
                return add(new Point(0, 1));
            case EAST:
                return add(new Point(1, 0));
            case SOUTH:
                return add(new Point(0, -1));
            case WEST:
                return add(new Point(-1, 0));
            default:
                throw new IllegalArgumentException("参数不合法");
        }*/
        Point vector = direction.getVector();
        return new Point(x + vector.getX(), y + vector.getY());
    }

    public Point backward(Direction direction) {
        switch (direction) {
            case NORTH:
                return getPoint(x, y - 1);
            case EAST:
                return getPoint(x - 1, y);
            case SOUTH:
                return getPoint(x, y + 1);
            case WEST:
                return getPoint(x + 1, y);
            default:
                throw new IllegalArgumentException("参数不合法");
        }
    }

    private Point getPoint(int x, int y) {
        return new Point(x, y);
    }
}
