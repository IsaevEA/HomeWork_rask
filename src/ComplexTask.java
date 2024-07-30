import java.security.PrivateKey;

public class ComplexTask extends AbstractTask{
        private SimpleTask simpleTask;

    public ComplexTask(SimpleTask simpleTask) {
        this.simpleTask = simpleTask;
    }

    public ComplexTask(String title, String description, String priority, boolean status, SimpleTask simpleTask) {
        super(title, description, priority, status);
        this.simpleTask = simpleTask;
    }

    @Override
    public String toString() {
        return simpleTask.toString() +
                "ComplexTask{" +
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
