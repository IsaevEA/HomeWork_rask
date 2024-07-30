public class SimpleTask extends AbstractTask{
    public SimpleTask() {
    }

    public SimpleTask(String title, String description, String priority, boolean status) {
        super(title, description, priority, status);
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean assignmentOfStatus() {
        if (status){
            status = false;
        } else {
            status = true;
        }
        return status;
    }



}
