public class Test1 {
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void test() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(content));
        gmail.alertWeatherConditions("Hello");

        assertEquals("Hi", content.toString());
    }
}
