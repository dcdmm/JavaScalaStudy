package c_oop.Interface;

import org.jetbrains.annotations.NotNull;

/**
 * 接口案例
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Computer com = new Computer();
        Print pr = new Print();
        com.plugin(pr); // 非匿名实现类的非匿名对象
        System.out.println("*******************************************");

        com.plugin(new MP3()); // 非匿名实现类的匿名实现类
        System.out.println("*******************************************");

        com.plugin(new USB() { // 匿名实现类的匿名对象
            @Override
            public void install() {
                System.out.println("安装手机驱动程序");
            }

            @Override
            public void work() {
                System.out.println("手机与电脑进行工作");
            }
        });
    }
}


interface USB { // 操作标准
    void install();

    void work();
}


class Print implements USB {
    @Override
    public void install() {
        System.out.println("安装打印机驱动程序");
    }

    @Override
    public void work() {
        System.out.println("进行文件打印");
    }
}


class MP3 implements USB {
    @Override
    public void install() {
        System.out.println("安装MP3驱动程序");
    }

    @Override
    public void work() {
        System.out.println("进行MP3拷贝");
    }
}


class Computer {
    public void plugin(@NotNull USB usb) { // 多态性
        usb.install();
        usb.work();
    }
}