package chapter08;

import javax.management.monitor.MonitorSettingException;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("삼성");
        Mouse mouse2 = new Mouse("삼성");
        System.out.println("mouse1 == mouse2 ? " + (mouse2 == mouse1));
        System.out.println("제조사가 같은가 ? " + (mouse1.equals(mouse2)));
    }
}

class Mouse{
    String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "제조사는 " + name + "인 Mouse 입니다";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mouse){
            if(this.name.equalsIgnoreCase(((Mouse) obj).name)){
                return name == obj;
            }
        }
    }
}

class Keyboard{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public String toString() {
        return "제조사는 " + name + "인 Keyboard 입니다";
    }

}