package factory;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/5 15:12
 * @content 图形工厂类
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if ("square".equalsIgnoreCase(shapeType)){
            return new Circle();
        }

        return null;
    }
}
