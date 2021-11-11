public class Test {

    public void test1() {
        Test p = new Test(5);
        p.s();
        assertEquals("in the water", p.cl);
    }


    public void test2() {
        Test p = new Test(5);
        p.m();
        assertEquals(1, p.number);
    }
}


