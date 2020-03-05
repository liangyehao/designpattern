package factory;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/5 15:15
 * @content 测试类
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        // 1.获取圆形
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        // 2.获取长方形
        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
        // 1.获取正方形
        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
