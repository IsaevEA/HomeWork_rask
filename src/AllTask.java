public class AllTask {
    private AbstractTask [] abstractTasks = new AbstractTask[100];
    private int count = 0;

    public void addTask(AbstractTask abstractTask){
        if (count< abstractTasks.length){
            abstractTasks[count] = abstractTask;
            count++;
        }
    }


    public void updateStatusTrue(){
        for (int i = 0; i < abstractTasks.length; i++) {
            if (abstractTasks[i] != null) {
                if (abstractTasks[i] instanceof ComplexTask) {
                    abstractTasks[i].status = true;
                }
            }
        }
    }

    public void printInfo(){
        for (int i = 0; i < abstractTasks.length; i++) {
            if (abstractTasks[i] != null){
                System.out.println(abstractTasks[i]);
            }
        }
    }


    public void updateStatus(boolean status, AbstractTask abstractTask){
        abstractTask.status = status;
    }

    public boolean infoStatus(AbstractTask abstractTask){
        return abstractTask.status;
    }
    public void updatePriority(String priority, AbstractTask abstractTask){
        abstractTask.priority = priority;
    }
    public void updateDescription(String description, AbstractTask abstractTask){
        abstractTask.description = description;
    }

}
