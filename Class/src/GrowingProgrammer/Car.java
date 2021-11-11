package GrowingProgrammer;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    //为什么是private？就是说其他的class里面不能调用和修改是么？
    //在所有的method外面设置这些变量，是为了在method里面不用设置了是么，这个是统一的是么？

    //这个不是main class,而是Car class，下面也没有main method
    public void setModel(String model) {
        String validModel= model.toLowerCase();
        //上面这行代码的含义应该是把model全部都转换成小写
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        //上面是判定validModel（model转换之后）是不是那两个，如果是就是，不过不是就是未知
        //这个地方不太明白的是，this.model是什么意思？
    }

    public String getModel() {
        return this.model;
        //没有参数进来，为什么就能返回setModel方法里的this.model呢？
    }
}
