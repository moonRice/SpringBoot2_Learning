package JavaEE.ioc.ioc_2;

public class LinuxShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "ls";
    }
}
