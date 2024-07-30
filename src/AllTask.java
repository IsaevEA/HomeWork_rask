public class AllTask {
    private AbstractTask [] abstractTasks = new AbstractTask[100];
    private int count = 0;

    public void addTask(AbstractTask abstractTask){
        if (count< abstractTasks.length){
            abstractTasks[count] = abstractTask;
            count++;
        }
    }

    public void printInfo(){
        for (int i = 0; i < abstractTasks.length; i++) {
            if (abstractTasks[i] != null){
                System.out.println(abstractTasks[i]);
            }
        }
    }


}
