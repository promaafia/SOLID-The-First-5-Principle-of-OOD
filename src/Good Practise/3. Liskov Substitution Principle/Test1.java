public class Test1 {

    public void test1() {
        Test p = new Test();
        assertEquals(2, p.number);
    }


    public void test2() {
        Test p = new Test();
        p.setsf(1600);

        assertEquals(1600, p.sf);
    }
}
