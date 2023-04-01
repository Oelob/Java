package OOP.less05.presenter;

import OOP.less05.models.Contact;
import OOP.less05.models.ContactFamily;
import OOP.less05.models.ContactWork;
import OOP.less05.models.Phonebook;
import OOP.less05.view.view;

public class Presenter {

    
    public static void Menu(Phonebook obj){
        view v = new view();
        while(true){
            int num;
            v.showMessege("Выберите действие:\n1. Добавить контакт\n2. Удалить контакт\n3. Показать контакт\n4. Редактировать контакт\n5. Выйти");
            num = v.getInfo();
            if (num == 1){
                v.showMessege("Выберите тип контакта\n1. Семья\n2. Работа\n3. Не определено");
                int temp = v.getInfo();
                if (temp == 1){
                    Contact contfam = new ContactFamily(temp, v.getFirstName(), v.getLastName(), v.getPhonenumber(), v.getRelative());
                    obj.addContact(contfam);
                }
                else if (temp == 2){
                    Contact contwork = new ContactWork(v.getID(),v.getFirstName(), v.getLastName(), v.getPhonenumber(), v.getOrganization(), v.getPossition());
                    obj.addContact(contwork);
                }
                else if (temp == 3){
                    Contact cont = new Contact(temp, v.getFirstName(), v.getLastName(), v.getPhonenumber());
                    obj.addContact(cont);
                }
            }
            else if (num == 2){
                obj.delContact(v.getID());
            }
            else if (num == 3){
              for (Object el : obj) {
                System.out.println(el);
              }
            }
            else if (num == 4){
                v.showMessege("4444");
            }
            else if (num == 5){
                break;
            }
        }
    }

   

    
    
}
