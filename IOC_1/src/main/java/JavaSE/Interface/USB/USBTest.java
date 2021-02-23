package JavaSE.Interface.USB;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();

        // 非匿名实现类的非匿名对象
        KingstonUSB kusb = new KingstonUSB();
        PrintUSB pusb = new PrintUSB();
        com.transfoerDate(kusb);
        com.transfoerDate(pusb);

        // 非匿名实现类的匿名对象
        com.transfoerDate(new KingstonUSB());

        // 非匿名实现类的非匿名对象
        USB iPhoneX = new USB(){

            @Override
            public void start() {
                System.out.println("Get Your iPhoneX.");
            }

            @Override
            public void stop() {
                System.out.println("Done.");
            }
        };
        com.transfoerDate(iPhoneX);

        // 匿名实现类的非匿名对象
        USB AndroidX = new USB(){
            @Override
            public void start() {
                System.out.println("Get Your AndroidX.");
            }

            @Override
            public void stop() {
                System.out.println("Done.");
            }
        };
        com.transfoerDate(AndroidX);
    }
}

class Computer{
    public void transfoerDate(USB usb){
        usb.start();
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}
class KingstonUSB implements USB{
    @Override
    public void start() {
        System.out.println("欢迎使用金士顿U盘。");
    }

    @Override
    public void stop() {
        System.out.println("已弹出金士顿U盘。");
    }
}
class PrintUSB implements USB{
    @Override
    public void start() {
        System.out.println("欢迎使用打印机。");
    }

    @Override
    public void stop() {
        System.out.println("已弹出打印机。");
    }
}