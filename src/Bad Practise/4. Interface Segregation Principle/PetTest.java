public class PetTest {

    public void test1() {
        Pet e = new Pet(5);
        e.f();
        assertEquals("in the air", e.cl);
    }


    public void test2() {
        Pet e = new Pet(5);
        e.m();
        assertEquals(4, e.number);
    }
}
