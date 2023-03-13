package org.example;

public class Main {
    public static void main(String[] args) {

        // создаем экземпляры продуктов

        Product apple = new Product("Яблоко", 25, "premium");
        Product orange = new Product("Апельсин", 30, "premium");
        Product whiteChocolate = new Product("Белый шоколад", 50, "low");
        Product blackChocolate = new Product("Черный шоколад", 80, "premium");
        Product carrot = new Product("Морковь", 60,"low");
        Product potatoes = new Product("Картофель", 20, "low");

        Product[] fruits = new Product[]{apple, orange};
        Product[] chocolate = new Product[]{whiteChocolate,blackChocolate};
        Product[] vegetables = new Product[]{carrot,potatoes};

        Product[] totalProduct  = new Product[]{apple, orange, whiteChocolate,blackChocolate, carrot,potatoes};


        System.out.println("Общий первоначальный каталог: ");
        for (Product i : totalProduct) {
            System.out.println(i);
        }

        // создаем экземпляры категорий
        Category fruitCategory = new Category("juice",fruits);
        Category chokolateCategory = new Category("chokolate", chocolate);
        Category vegetableCategory = new Category("vagetable", vegetables);



        // создаем экземпляры Basket
        Basket Ivanbasket1 = new Basket(apple.name);
        Basket Ivanbasket2 = new Basket(orange.name);
        Basket[] totalIvanBasket = new Basket[]{Ivanbasket1,Ivanbasket2};

        System.out.println("++++++++++++++++++++");
        System.out.println("В корзине: ");
        for (Basket i: totalIvanBasket){
            System.out.println(i.getBasketName());
        }




        System.out.println("++++++++++++++++++++");
        System.out.println("Актуальный каталог: ");

        for (int i = 0; i < totalProduct.length; i++) {
            int count = 0;
            for (int j = 0; j < totalIvanBasket.length; j++) {
                if (totalProduct[i].name == totalIvanBasket[j].getBasketName()) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(totalProduct[i]);
            }
        }


        // создаем экземпляпы User
        User Ivan = new User("Ivan@mail.ru", "qwerty", totalIvanBasket);
        System.out.println();

    }
}

