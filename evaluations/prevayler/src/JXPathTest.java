import org.prevayler.demos.jxpath.Main;

public class JXPathTest {
    public static void main(String[] args) {
        String[] args1 = new String[]{"proj", "100", "learn JXPath"};
        String[] args2 = new String[]{"task", "50", "read docs", "09/21/02 2:00 PM", "09/21/02 3:00 PM", "100"};
        String[] args3 = new String[]{"task", "51", "write code", "09/21/02 3:00 PM", "09/21/02 4:00 PM", "100"};
        String[] args4 = new String[]{"task", "52", "veg out", "09/21/02 4:00 PM", "09/21/02 5:00 PM", "100"};
        String[] args5 = new String[]{"list", "projects"};
        String[] args6 = new String[]{"list", "projects/tasks"};
        String[] args7 = new String[]{"list", "projects/tasks[name='read docs']"};
        Main.main(args1);
        Main.main(args2);
        Main.main(args3);
        Main.main(args4);
        Main.main(args5);
        Main.main(args6);
        Main.main(args7);
    }
}
