package workshop_2;

import Helpers.Helpers;
import Models.Response;
import Models.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskManagement {
    private Map<Integer, Task> taskMap = new HashMap<>();
    private Helpers helpers = new Helpers();

    public Response<String, Object> addTask(Task newTask) {
        Response<String, Object> response = new Response<>();
        int newId;

        do {
            newId = helpers.generateId();
        } while (taskMap.containsKey(newId));

        newTask.setId(newId);

        if (newTask.getTitle() == null || newTask.getTitle().isEmpty() ||
                newTask.getDescription() == null || newTask.getDescription().isEmpty()) {
            response.setOk(false);
            response.setMessage("All fields are required");
            response.setData(null);
        } else {
            taskMap.put(newId, newTask);
            response.setOk(true);
            response.setMessage("Task added correctly");
            response.setData(newTask);
        }

        return response;
    }

    public Response<String, Object> taskDone(int id) {
        Response<String, Object> response = new Response<>();
        Task task = taskMap.get(id);

        if (task != null) {
            task.setStatus(true);
            response.setOk(true);
            response.setMessage("Task done!");
            response.setData(task);
        } else {
            response.setOk(false);
            response.setMessage("Task not found");
            response.setData(null);
        }

        return response;
    }

    public Response<String, Object> getPendingTasks() {
        Response<String, Object> response = new Response<>();
        ArrayList<Task> pendingTasks = new ArrayList<>();

        for (Task task : taskMap.values()) {
            if (!task.isStatus()) {
                pendingTasks.add(task);
            }
        }

        if (pendingTasks.isEmpty()) {
            response.setOk(true);
            response.setMessage("Don't have tasks pending");
            response.setData(null);
        } else {
            response.setOk(true);
            response.setMessage("Tasks pending");
            response.setData(pendingTasks);
        }

        return response;
    }

    public String exit() {
        return "\nThank you, come back soon!\n";
    }
}
