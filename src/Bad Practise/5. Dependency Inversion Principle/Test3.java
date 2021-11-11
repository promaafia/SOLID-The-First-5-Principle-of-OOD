public class Test3 {
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void test1() {
        Test t = new Test();
        t.setcc("Hello");

        assertEquals("Hello", t.cc);
    }

    public void test2() {
        Test t = new Test();
        System.setOut(new PrintStream(content));
        t.setcc("Hello");

        assertEquals("It is Hello", content.toString());
    }

    public void test3() {
        Test t = new Test();
        System.setOut(new PrintStream(content));
        t.setcc("Hey");

        assertEquals("It is Hey", content.toString());
    }
}
