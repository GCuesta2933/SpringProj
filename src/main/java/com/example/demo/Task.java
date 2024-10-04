package com.example.demo;

import java.util.*;

public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Date createDate;
    private Date completedDate;

    // Constructors: empty and listed

        public Task()
        {
            id = 0;
            title = "";
            description = ""; 
            completed = false; 
            createDate = new Date(0,0,0);
            completedDate = new Date(0,0,0);
        }

        public Task(Long id, String title, String description, boolean completed, Date createDate, Date completedDate) 
        {
            this.id = id;
            this.title = title;
            this.description = description;
            this.completed = completed;
            this.createDate = createDate;
            this.completedDate = completedDate;
        }



     // Getters and Setters for all private variables

            public Long getId() 
            {
                return id;
            }
            public void setId( Long id ) 
            {
                this.id = id;
            }



            public String getTitle() 
            {
                return title;
            }
            public void setTitle( String title ) 
            {
                this.title = title;
            }



            public String getDescription() 
            {
                return description;
            }
            public void setDescription( String description ) 
            {
                this.description = description;
            }



            public boolean isCompleted() 
            {
                return completed;
            }
            public void setCompleted( boolean completed ) 
            {
                this.completed = completed;
            }



            public Date getCreateDate() 
            {
                return createDate;
            }
            public void setCreateDate( Date createDate ) 
            {
                this.createDate = createDate;
            }



            public Date getCompletedDate() 
            {
                return completedDate;
            }
            public void setCompletedDate( Date completedDate ) 
            {
                this.completedDate = completedDate;
            }
}
