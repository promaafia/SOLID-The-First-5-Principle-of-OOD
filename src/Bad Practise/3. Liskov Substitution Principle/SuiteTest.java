public class SuiteTest {

    public void test1() {
        Test1 p = new Test1();
        assertEquals(4, p.number);
    }


    public void test2() {
        Test2 p = new Test2();
        p.setsf(1500);
        assertEquals(1500, p.sf);
    }
}
