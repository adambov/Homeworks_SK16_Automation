package homework_4;

import java.util.Scanner;

public class Task4_revenue_sale {
    public static void main (String[] args){
        Scanner one = new Scanner(System.in);
        System.out.println("Enter unit price in $: ");
        Float price = one.nextFloat();

        Scanner two = new Scanner(System.in);
        System.out.println("Enter unit amount: ");
        int quantity = two.nextInt();

        Float revenue = price * quantity;
        Float discount = null;
        String percentage = "";

        if (quantity < 100) {
            System.out.println("The revenue from sale: " + revenue);
            System.out.println("Discount: 0$");
        } else if (quantity >= 100 || quantity <= 120) {
            discount = (float) (revenue * 0.15);
            revenue = (float) (revenue * 0.85);
            percentage = "(15%)";

        } else {
            discount = (float) (revenue * 0.2);
            revenue = (float) (revenue * 0.8);
            percentage = "(20%)";
        }
        System.out.println("The revenue from sale: " + revenue);
        System.out.println("Discount: " + discount +"$ " + percentage );
    }
}

// юзър въвежда цена - съхранявам в променлива
// юзър въвежда бройка - съхранявам в променлива
// умножавам цената по бройката и съхранява - съхранявам в променлива
// проверявам дали има отстъпка
// ако брой е < 100 - няма отстъпка
// принтирам тогава revenue и че отстъпката е 0$

// в другия случай бройка между 100 и 120 има 15% отстъпка
// отстъпката е revenue * 0.15
// тук в този случай умножавам revenue * 0.85 и това е новото revenue
//
// ако са над 120 бройки имат 20% отстъпка
// отстъпката е revenue * 0.2
// тук в този случай умножавам revenue * 0.8 и това е новото revenue

// принтирам
//Enter unit price: 25
//        • Enter quantity: 110
//        • The revenue from sale: 2337.5$
//• Discount: 412.5 $(15.0%)
