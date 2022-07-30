package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(100, actual);
    }
    @Test
    public void testRemainAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        assertEquals(1000, actual);
    }
    @Test
    public void testRemainAmount1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        assertEquals(999, actual);
    }

    @Test
    public void testRemainAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        assertEquals(1, actual);
    }

    @Test
    public void testRemainAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(0, actual);

        //в коде нет проверки, что до текущей границы начисления бонусов больше ничего не нужно докупать
    }

    @Test
    public void testRemainAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        assertEquals(999, actual);
    }

    @Test
    public void testRemainAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        assertEquals(500, actual);
    }

    @Test
    public void testRemainAmount2000Negative() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-2000);
        assertEquals(2000, actual);

        //нет проверки на ввод отрицательных значений
    }

    @Test
    public void testRemainAmount95() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(95);
        assertEquals(905, actual);

    }

    @Test
    public void testRemainAmount91() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(91);
        assertEquals(909, actual);

    }

    @Test
    public void testRemainAmount5300() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(5300);
        assertEquals(700, actual);
    }
}