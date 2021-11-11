public class Number {

    public void test() {
        Test1 p = new Test1();
        Test2 adder = new Test2();
        adder.add(p);

        assertEquals(5, p.number);
    }
}
