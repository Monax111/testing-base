public class SimpleLogic {
    boolean isAdult(Integer age) {
        if (age < 18) {
            System.out.println("Несовершеннолетний");
            return false;
        } else {
            System.out.println("Совершеннолетний");
            return true;
        }
    }

    // Так делать не надо!!!!
    public static void main(String[] args) {
        SimpleLogic simpleLogic = new SimpleLogic();
        if (simpleLogic.isAdult(17) != false) {
            throw new RuntimeException();
        }
        if (simpleLogic.isAdult(18) != true) {
            throw new RuntimeException();
        }
    }
}
