package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class Control 
{

    private Map<Long, Task> tempH = new HashMap<>();
    private Long IDCount = 1L;

   
    @GetMapping
    public List<Task> getAllTasks() 
    {
        return new ArrayList<>(tempH.values());
    }

    @GetMapping("/{id}")
    public Task getTaskById( @PathVariable Long id ) 
    {
        return tempH.get(id);
    }

    
    @PostMapping
    public Task createTask( @RequestBody Task task ) 
    {
        task.setId(IDCount++);
        task.setCreateDate(new Date());
        tempH.put(task.getId(), task);
        return task;
    }

    
    @PutMapping("/{id}")
    public Task updateTask( @RequestBody Task updatedTask, @PathVariable Long id ) 
    {
        Task existingTask = tempH.get(id);

        if (existingTask != null) 
        {
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setCompleted(updatedTask.isCompleted());
           
            if (updatedTask.isCompleted()) 
            {
                existingTask.setCompletedDate(new Date());
            }
            tempH.put(id, existingTask);
        }
        return existingTask;
    }
}
