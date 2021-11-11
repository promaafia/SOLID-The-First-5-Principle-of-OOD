public class Test1 {

    public void test() {
        Emailer emailer = new Emailer();
        assertEquals("Hello", emailer.generateWeatherAlert("Hi"));
    }
}
