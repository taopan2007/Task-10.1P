package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestTaskService {

    @Test
    public void testSubmitTask() {
        boolean result = TaskService.submitTask("Title", "Description", "File");
        Assert.assertTrue(result);
    }

    @Test
    public void testSubmitTaskWithEmptyTitle() {
        boolean result = TaskService.submitTask("", "Description", "File");
        Assert.assertFalse(result);
    }

    @Test
    public void testSubmitTaskWithEmptyDescription() {
        boolean result = TaskService.submitTask("Title", "", "File");
        Assert.assertFalse(result);
    }

    @Test
    public void testSubmitTaskWithEmptyFile() {
        boolean result = TaskService.submitTask("Title", "Description", "");
        Assert.assertFalse(result);
    }
}
