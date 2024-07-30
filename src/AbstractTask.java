public abstract class AbstractTask {
     String title;
     String description;
     String priority;
     boolean status;
     static int taskCounter = 0;

    public AbstractTask() {
        taskCounter++;
    }

    public AbstractTask(String title, String description, String priority, boolean status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        taskCounter++;
    }

    public static int countTask (){
        return taskCounter;
    }
    @Override
    public String toString() {
        return "AbstractTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status=" + status +
                '}';
    }

    public abstract boolean assignmentOfStatus();
}
