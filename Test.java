package edureka_project1;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss(372, "Salini", "37, Chinatown",
                987652456, 80000 );
        Trainee trainee =new Trainee(465, "Rahul", "24,Janki Avenue",
                97743435, 45000);

        System.out.println("Boss Salary :" + boss);
        System.out.println("Trainee Salary :" + trainee);


    }
}
