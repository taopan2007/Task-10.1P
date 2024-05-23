package web.service;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private static List<String> tasks = new ArrayList<>();

    public static boolean submitTask(String title, String description, String file) {
        if (title == null || title.isEmpty() || description == null || description.isEmpty() || file == null || file.isEmpty()) {
            return false;
        }
        tasks.add(title + ": " + description + " (" + file + ")");
        return true;
    }

    public static List<String> getTasks() {
        return tasks;
    }
}
