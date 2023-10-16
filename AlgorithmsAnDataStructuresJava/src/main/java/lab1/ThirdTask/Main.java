package lab1.ThirdTask;

public class Main {
    public static void main(String[] args) {
        FileQueue fileQueue = new FileQueue();
        FileGenerator generator = new FileGenerator(fileQueue);
        FileProcessor processor = new FileProcessor(fileQueue);

        new Thread(generator).start();
        new Thread(processor).start();
    }
}
