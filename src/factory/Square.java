package factory;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/5 15:05
 * @content 正方形
 */
public class Square implements Shape{
    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
