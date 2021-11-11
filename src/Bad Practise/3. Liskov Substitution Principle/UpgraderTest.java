public class UpgraderTest {

    public void test1() {
        Test1 t = new Test1();
        t.ss(1500);
        Test2 x = new Test2();
        x.upgrade(t);

        assertEquals(1540, t.sf);
    }

    @Test
    public void test2() {
        Test1 t = new Test1();
        Test2 x = new Test2();
        x.upgrade(t);

        assertEquals(5, t.number);
    }

    @Test
    public void test3() {
        Test3 tt = new Test3();
        tt.ss(550);
        Test2 x = new Test2();
        x.upgrade(tt);

        assertEquals(590, tt.sf);
    }

    @Test
    public void test4() {
        Test3 tt = new Test3();
        Test2 x = new Test2();
        x.upgrade(tt);

        assertEquals(0, tt.number);
    }
}
