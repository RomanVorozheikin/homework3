package ru.roman;

public class Main {
    public static void main(String[] args) {
        int cat=1500000;
        byte dog=100;
        short paper=29990;
        long bird=3500000000000l;
        float goose=10.557585867f;
        double rabbit=555.679028193;
        System.out.println("Значение переменной cat с типом int равно "+cat);
        System.out.println("Значение переменной dog с типом byte равно "+dog);
        System.out.println("Значение переменной paper с типом short равно "+paper);
        System.out.println("Значение переменной bird с типом long равно "+bird);
        System.out.println("Значение переменной goose с типом float равно "+goose);
        System.out.println("Значение переменной rabbit с типом double равно "+rabbit);


        float a=27.12f;
        long b=987678965549l;
        float c=2.786f;
        short d=569;
        short e=-159;
        short i=27897;
        byte g=67;


        byte lydmilaPavlovna=23;
        byte annaSergeevna=27;
        byte ekaterinaAndreevna=30;
        short bumaga=480;
        int listovUchenikuy=bumaga/(lydmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+listovUchenikuy+" листов бумаги");



        byte minuts=20;
        byte bottlesTwoMinuts=16;
        byte timeMinuts=2;
        int bottlesTwentyMinuts=(minuts/timeMinuts)*bottlesTwoMinuts;
        System.out.println("За 20 минут машина произвела "+bottlesTwentyMinuts+ " штук бутылок");

        byte sutki=1;
        byte hoursSutki=24;
        int minutsSutki=hoursSutki*60;
        int bottlesSutki=(minutsSutki/timeMinuts)*bottlesTwoMinuts;
        System.out.println("За сутки машина произвела "+bottlesSutki+ " штук бутылок");

        byte day=3;
        int hoursDay=day*24;
        int minutsDay=hoursDay*60;
        int bottlesDay=(minutsDay/timeMinuts)*bottlesTwoMinuts;
        System.out.println("За 3 дня машина произвела "+bottlesDay+ " штук бутылок");

        int bottlesMonth=bottlesSutki*30;
        System.out.println("За месяц машина произвела "+bottlesMonth+ " штук бутылок");


        byte white=2;
        byte brown=4;
        byte remont=120;
        int paint=white+brown;

        int clas=remont/paint;

        int whiteClas=clas*white;
        int brownClas=clas*brown;
        System.out.println("В школе, где "+clas+ " классов, нужно "+whiteClas+" банок белой краски и "+brownClas+" банок коричневой.");


        byte bananas=5;
        int bananasWeight=bananas*80;
        short milkMl=200;
        int number=milkMl/100;
        int milkGr=number*105;
        byte iceCream=2;
        int iceCreamWeight=iceCream*2;
        byte egg=4;
        int eggWeight=egg*70;
        int breakfastGram=bananasWeight+milkGr+iceCreamWeight+eggWeight;
        System.out.println("Вес завтрака "+breakfastGram+ " грамма");
        float breakfastKilogram=breakfastGram/1000f;
        System.out.println("Вес завтрака "+breakfastKilogram+ " килограмма");


        byte sportsmanWeight=7;
        short firstGramm=250;
        short secondGramm=500;
        int sportsmanGramm=sportsmanWeight*1000;
        int firstSportsmanDay=sportsmanGramm/firstGramm;
        System.out.println("Если спортсмен будет терять по 250гр. в день, то похудеет за "+firstSportsmanDay+" дней");

        int secondSportsmanDay=sportsmanGramm/secondGramm;
        System.out.println("Если спортсмен будет терять по 500гр. в день, то похудеет за "+secondSportsmanDay+" дней");


        int overageDay=(firstSportsmanDay+secondSportsmanDay)/2;
        System.out.println("В среднем понадобится "+overageDay+" день для похудения!");


        int masha=67760;
        int denis=83690;
        int cristina=76230;

        byte procent=10;
        float meaning=procent/100f+1;

        float raisingMasha=masha*meaning;
        float raisingDenis=denis*meaning;
        float raisingCristina=cristina*meaning;


        float annualIncomeMasha=raisingMasha-masha;
        float annualIncomeDenis=raisingDenis-denis;
        float annualIncomeCristina=raisingCristina-cristina;
        System.out.println("Маша теперь получает "+raisingMasha+" рублей. Годовой доход вырос на "+annualIncomeMasha+" рублей");
        System.out.println("Денис теперь получает "+raisingDenis+" рублей. Годовой доход вырос на "+annualIncomeDenis+" рублей");
        System.out.println("Кристина теперь получает "+raisingCristina+" рублей. Годовой доход вырос на "+annualIncomeCristina+" рублей");
    }
}