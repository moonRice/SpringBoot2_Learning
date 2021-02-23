package JavaEE.ioc.ioc_2;

public class WindowsShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "dir";
    }
}
