public class Hello {

    public void test1() {
        Hello h = new Hello();
        assertEquals("Hello.", h.greet());
    }

    public void test2() {
        Hello h = new Hello();
        h.setFormality("test2");
        assertEquals("hey! what's up?", h.greet());
    }

    public void test3() {
        Hello h = new Hello();
        h.setFormality("test3");
        assertEquals("cool", h.greet());
    }

    public void test4() {
        Hello h = new Hello();
        h.setFormality("test4");
        assertEquals("Superb", h.greet());
    }
}
