class Test implements Hello {
    public String greet() {
        return "Hiiiiiiiiiiiiii";
    }
}

public class Hello {
    public void test() {
        Test test = new Test();
        Hello h = new Hello(test);

        assertEquals("Hiiiiiiiiiiiiii", h.greet());
    }
}
