
public class Main {
    public static void main(String[] args) {
        System.out.println(AbstractTask.countTask());
        SimpleTask simpleTask1 = new SimpleTask("Открытие нового продукта", "вывести партнера на продакшн","Высокий",false);
        ComplexTask complexTask1 = new ComplexTask("Выводим партнера посредством тестирование", "Тестирование проводит кто то там", "высокий",false, simpleTask1);
        ComplexTask complexTask2 = new ComplexTask("пример для проверки", "Тестирование проводит кто то там", "высокий",false, simpleTask1);

        complexTask1.assignmentOfStatus();
        AllTask allTask = new AllTask();
        allTask.addTask(simpleTask1);
        allTask.addTask(complexTask1);
        allTask.addTask(complexTask2);
        allTask.printInfo();
    }
}