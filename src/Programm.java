public class Programm {
    public static void main(String[] args) {
        int k = dev (19, 5);
        int d = dis (19, 5);
        System.out.println(k +" dis = " + d);


//                String head = "(º..º)"; // голова
//                String tail = "~"; // хвост
//                String body = "≈"; // тело
//
//                String direction = "left"; //направление движения
//
//                if (direction == "right") {
//                    System.out.print(tail); //если направление – right,
//                    for (int i = 1; i < 10; i = i + 1) {
//                        System.out.print(body);
//                    }
//                    System.out.print(head); // рисуется хвост, тело, голова
//                } else if (direction == "left") {
//                    // если направление – left,
//                    System.out.print(head); // рисуется голова, тело, хвост
//                    for (int i = 1; i < 10; i = i + 1) {
//                        System.out.print(body);
//                    }
//                    System.out.print(tail);
//                } else {
//                    System.out.print("Dont understand"); // сообщение о том, что команда непонятна
//                }
//        ---------------------------
//        int number = 8;
//        for (int i = 5; i >= 1; i = i - 2) {// цикл
//            if (i > 3) {// условное выражение
//                number = number + 3;
//            }
//            number = number - 1;
//        }
//
//        System.out.println(number);
//            }
////      ----------------------------------
////        }
//        int stroka = 0;
//        for (int i = 1; i <= 10; i = i +1)
//        {
//         stroka = stroka + 1;
//            if (stroka == 3 || stroka == 9) {
//                System.out.println("Файна-на");
//            }
//            else if (stroka == 4 || stroka == 10) {
//                System.out.println("Фаина Файна-на");
//            } else System.out.println("Фаина Фаина");
//
//        }
//        System.out.println("Ах люблю тебя, Фаина-Фаина");
//    }
//}
//----------------
//        for (int j = 1; j < 6; j++) {
//            if (j % 2 == 0) {
//                System.out.println ("Круг " + j );
//                for (int i = 1; i <= 5; i++) {
//                    System.out.println("  Приседаем " + i);
//                }
//            } else
//
//
//            {
//                System.out.println ("Круг " + j );
//                     for (int k = 1; k <= 3; k++) {
//                    System.out.println("  Отжимаемся " + k);
//                }
//            }
//
//            for (int l = 1; l <= 7; l++) {
//                System.out.println("  Качаем пресс " + l);
//            }
//            System.out.println("Хороший темп, так держать!");
//        }
//        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
//    }
//}

 /*       int a = 100;
        int b = 10;
        int c = 12;
        int d = 10;

        if (b >=d) {
            System.out.println(" Укладываемся в тариф. " + " Костя потратит за месяц  " + a);
        } else {
            int h = d - b;
            System.out.println(" При стоимости  over тарифа за 1 МБ = " + c + " Костя потратит за месяц  " + (a + h * c));
        }
    }
}
*/

    }
        public static int dev(int a, int b) {
           while (b != 0) {
               int temp = a % b;
               a = b;
               b = temp;

           }
           return a;
        }
        public static int dis (int a, int b) {
        if ( b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        }


    }


 class Yand {
    public static  void main (String[] args) {
        double allMoney = 25000;
        double nextDayMoney = 10;

if (allMoney < 3000) {System.out.println("Eat at home!!!");}
    else if (allMoney < 10000) {
        if (nextDayMoney<10) {System.out.println("go Macccc");}
        else { System.out.println("eat at home");}

}
    else if (allMoney <30000) {
        if (nextDayMoney <10) {System.out.println("buy $");}
        else {System.out.println("goooo MacccD");}
}
    else if (nextDayMoney < 10) {System.out.println("is time for crub");}
    else {System.out.println("BUY $");}






    }
 }
