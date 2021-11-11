class Neww implements Not {
    public void alertWeatherConditions(String weatherDescription) {
        System.out.print("Hello");
    }
}

public class Test {
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void test1() {
        Test t = new Test();
        t.setcc("Hiiiiiiiiiiiiii");

        assertEquals("Hiiiiiiiiiiiiii", t.cc);
    }

    public void test1() {
        Test t = new Test();
        System.setOut(new PrintStream(content));
        t.setcc("Hiiiiiiiiiiiiii");
        New neww = new New();
        t.notify(neww);

        assertEquals("Hello", content.toString());
    }
}
