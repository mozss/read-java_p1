package com.lanhuigu.java.object;

/**
 * 重写equals方法
 *
 * @author yihonglei
 * @date 2019/2/3 11:19
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }
}
