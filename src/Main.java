public class Main {
    public static void main(String[] args) {
        int price = 100; // цена билета
        int divider = 20; // кратность начисления бонусных миль
        int bonus = price/divider; // количество начисленных бонусных миль

        System.out.println("За покупку билета будет начислено " +bonus +" бонусных миль");
    }
}
