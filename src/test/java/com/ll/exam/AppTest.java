package com.ll.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트1() {
        int rs = Calculator.run("10 + 20");

        assertEquals(30, rs);
    }
    @Test
    public void 더하기_테스트2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }
    @Test
    public void 더하기_테스트3() {
        int rs = Calculator.run("10 + 10");

        assertEquals(20, rs);
    }
    @Test
    public void 빼기_테스트1() {
        int rs = Calculator.run("10 - 10");

        assertEquals(0, rs);
    }

}
