package a_principle.e_ocp;

public class Ocp {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());

    }
}
// 一个绘图类
class GraphicEditor{
    public void drawShape(Shape s){
        if (s.m_type == 1){
            drawRectangle(s);
        }
        if (s.m_type == 2){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }
    public void drawCircle(Shape c){
        System.out.println("圆形");
    }
}

class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}

//1)优点是比较好理解，简单易操作。
//2)缺点是违反了设计模式的ocp原则，即对扩展开放(提供方)，对修改关闭(使用方)。
//即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
//3)比如我们这时要新增加一个图形种类，我们需要做如下修改，修改的地方较多
//4)代码演示