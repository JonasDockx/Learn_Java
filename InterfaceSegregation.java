public class InterfaceSegregation {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work(); human.eat(); human.sleep();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}

interface Sleeper {
    void sleep();
}

interface Eater {
    void eat();
}

interface Worker {
    void work();
}

class HumanWorker implements Sleeper, Eater, Worker {
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public void work() {
        System.out.println("Working");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Working");
    }
}
