import java.util.Scanner;

import javax.xml.transform.Source;

public class Menu {

    public static void menu(Zoo obj){
        while (true){
            int num;
            System.out.println("Выберите пункт:\n1. Добавить новое животное в зоопарк\n2. Удалить животное из зоопарка\n3. Вывести инфо о животном\n4. Вывести инфо о всех животных\n5. Заставить животное издать звук\n6. Заставить всех животныз издать звук\n7. Выход");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num == 1){
                System.out.println("Какое животное добавить?\n1. Собака\n2. Кошка\n3. Тигр\n4. Курица\n5. Страус\n6. Волк");
                int num_animal = in.nextInt();
                if(num_animal == 1){
                    obj.addAnimal(new Dog());
                }else if(num_animal == 2){
                    obj.addAnimal(new Cat());
                }else if(num_animal == 3){
                    obj.addAnimal(new Tiger());
                }else if(num_animal == 4){
                    obj.addAnimal(new Chicken());
                }else if(num_animal == 5){
                    obj.addAnimal(new Stork());
                }else if(num_animal == 6){
                    obj.addAnimal(new Wolf());    
                }else{
                    System.out.println("Такого животного в зоопарке не будет!");
                }
            }else if(num == 2){
                System.out.println("Введите индекс");
                int index = in.nextInt();
                if (obj.hasIndex(index)){
                    obj.deleteAnimal(index);
                }else{
                    System.out.println("Такого животного нет в зоопарке");
                }
            }else if(num == 3){
                System.out.println("Введите индекс животного");
                int indx_info = in.nextInt();
                if (obj.hasIndex(indx_info)){
                    System.out.println(obj.getInfo(indx_info)); 
                }else{
                    System.out.println("Такого животного нет в зоопарке");
                }
            }else if(num == 4){
                System.out.println(obj.getAllInfo());

            }else if(num == 5){
                System.out.println("Введите индекс животного");
                int indx_voice = in.nextInt();
                if (obj.hasIndex(indx_voice)){
                    System.out.println(obj.getVoice(indx_voice));
                }else{
                    System.out.println("Такого животного нет в зоопарке");
                }
            }else if(num == 6){
                System.out.println(obj.getRoar());
            }else if(num == 7){
                break;
            }
        }

    }
    
}
