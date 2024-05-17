package Baitap.Automated_Testing_TDD.TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void checkTriangle() {

        String expected = "Tam giác đều";
        String result = GetTriangle.checkTriangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    void checkTriangle1() {
        String expected = "Tam giác cân";
        String result = GetTriangle.checkTriangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    void checkTriangle2() {
        String expected = "Tam giác thường";
        String result = GetTriangle.checkTriangle(3,4,5);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle3() {
        String expected = "Không phải là tam giác";
        String result = GetTriangle.checkTriangle(8,2,3);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle4() {
        String expected = "Không phải là tam giác";
        String result = GetTriangle.checkTriangle(-1,2,1);
        assertEquals(expected, result);
    }
    @Test
    void checkTriangle5() {
        String expected = "Không phải là tam giác";
        String result = GetTriangle.checkTriangle(0,1,1);
        assertEquals(expected, result);
    }

}
