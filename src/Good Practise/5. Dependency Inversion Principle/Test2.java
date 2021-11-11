public class Test2 {
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void test() {
        Test x = new Test();
        System.setOut(new PrintStream(content));
        x.alertWeatherConditions("Hello");

        assertEquals("It is Hello", content.toString());
    }
}
