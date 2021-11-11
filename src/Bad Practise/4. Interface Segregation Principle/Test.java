public class Test {

    public ExpectedException exception = ExpectedException.none();

    public void tes1() {
        Test p = new Test(5);
        p.m();
        assertEquals(4, p.number);
    }

    public void test2() {
        Test p = new Test(5);
        exception.expect(UnsupportedOperationException.class);
        p.f();
    }

    public void test3() {
        Test p = new Test(5);
        p.s();
        assertEquals("Hello", p.cl);
    }
}
