package by.kitty.fastnotes.Model;

import java.util.Date;

public class Note extends DatabaseObject{
    private String description;
    private String stage;
    private Date reminderDatetime;
    private Integer priority;
    private String folderId;
    private String customizationId;

    public Note(String id) {
        super(id);
    }

    public Note(String id, String name) {
        super(id, name);
    }

    public Note(String id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    public Note(String id, String name, String description, String stage) {
        this(id, name, description);
        this.stage = stage;
    }

    public Note(String id, String name, String description, String stage, Integer priority) {
        this(id, name, description, stage);
        this.priority = priority;
    }

    public Note(String id, String name, String description, String stage, Integer priority, Date remainder) {
        this(id, name, description, stage, priority);
        this.reminderDatetime = remainder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Date getReminderDatetime() {
        return reminderDatetime;
    }

    public void setReminderDatetime(Date reminderDatetime) {
        this.reminderDatetime = reminderDatetime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getCustomizationId() {
        return customizationId;
    }

    public void setCustomizationId(String customizationId) {
        this.customizationId = customizationId;
    }
}
