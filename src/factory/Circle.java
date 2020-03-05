package factory;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/5 15:02
 * @content 圆
 */
public class Circle implements Shape {
    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
