public class Test {

    public void test1() {
        Test test = new Test();
        assertEquals(0, test.number);
    }

    public void test2() {
        Test test = new Test();
        test.setsf(600);
        assertEquals(600, test.sf);
    }
}
