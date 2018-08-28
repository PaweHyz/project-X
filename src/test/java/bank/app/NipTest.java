package bank.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NipTest {
    @Test(expected = InvalidNipException.class)
    public void nipLengthToShort() {
        new Nip("123456789");
    }

    @Test(expected = InvalidNipException.class)
    public void nipLengthToLong() {
        new Nip("12345678901");
    }

    @Test(expected = InvalidNipException.class)
    public void nipDoNotContainsOnlyLetters() {
        new Nip("123456789a");
    }

    @Test
    public void nipIsCorrect() {
        Nip nip = new Nip("123 456 32 18");
        assertEquals("123-456-32-18", nip.getNip());
    }




}