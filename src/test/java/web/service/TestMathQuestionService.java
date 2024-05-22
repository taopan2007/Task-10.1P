package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testTrueAdd() {
        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
    }

    @Test
    public void testAddNumber1Empty() {
        Assert.assertNull(MathQuestionService.q1Addition("", "2"));
    }   
    
    @Test
    public void testAddNumber2Empty() {
        Assert.assertNull(MathQuestionService.q1Addition("2", ""));
    }

    @Test
    public void testAddBothEmpty() {
        Assert.assertNull(MathQuestionService.q1Addition("", ""));
    }

    @Test
    public void testTrueSubtraction() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("5", "3"), 2, 0);
    }

    @Test
    public void testSubtractionNumber1Empty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("", "3"));
    }

    @Test
    public void testSubtractionNumber2Empty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("3", ""));
    }

    @Test
    public void testSubtractionBothEmpty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("", ""));
    }

    @Test
    public void testTrueMultiplication() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"), 6, 0);
    }

    @Test
    public void testMultiplicationNumber1Empty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", "3"));
    }

    @Test
    public void testMultiplicationNumber2Empty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("3", ""));
    }

    @Test
    public void testMultiplicationBothEmpty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", ""));
    }
}
