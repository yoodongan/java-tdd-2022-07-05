package com.ll.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트() {
        int rs = Calculator.add("20 + 20");

        assertEquals(40, rs);
    }
}
