public class Test {

    public void test1() {
        Test1 s = new Test1();
        assertEquals(0, s.number);
    }


    public void test2() {
        Test1 s = new Test1();
        s.setsf(550);

        assertEquals(550, s.sf);
    }
}
