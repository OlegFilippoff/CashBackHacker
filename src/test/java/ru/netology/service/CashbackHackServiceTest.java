package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(actual, 100);
    }
    @Test
    public void testRemainAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        assertEquals(actual, 1000);
    }
    @Test
    public void testRemainAmount1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        assertEquals(actual, 999);
    }

    @Test
    public void testRemainAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        assertEquals(actual, 1);
    }

    @Test
    public void testRemainAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(actual, 0);

        //в коде нет проверки, что до текущей границы начисления бонусов больше ничего не нужно докупать
    }

    @Test
    public void testRemainAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        assertEquals(actual, 999);
    }

    @Test
    public void testRemainAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        assertEquals(actual, 500);
    }

    @Test
    public void testRemainAmount2000Negative() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-2000);
        assertEquals(actual, 2000);

        //нет проверки на ввод отрицательных значений
    }

    @Test
    public void testRemainAmount95() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(95);
        assertEquals(actual, 905);

    }

    @Test
    public void testRemainAmount91() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(91);
        assertEquals(actual, 909);

    }

    @Test
    public void testRemainAmount5300() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(5300);
        assertEquals(actual, 700);
    }
}