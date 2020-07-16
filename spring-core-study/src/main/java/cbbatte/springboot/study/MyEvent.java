package cbbatte.springboot.study;

//POJO

public class MyEvent {

    private int data;

    private Object source;

    public MyEvent(Object source, int data) {
        this.data = data;
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }


}
