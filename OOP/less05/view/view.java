package OOP.less05.view;

import java.util.Scanner;

import OOP.less05.models.Contact;

public class view {

    public int getInfo(){
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        return result;
    }

    public void showMessege(String mess){
        System.out.println(mess);
    }
    public int getID(){
        int result = 0;
        showMessege("Введите ID контакта: ");
        Scanner in = new Scanner(System.in);
        result = in.nextInt();
        
        return result;
    }
    public String getFirstName(){
        String result = "";
        showMessege("Введите имя контакта: ");
        Scanner in = new Scanner(System.in);
        result = in.nextLine();
        
        return result;
    }

    public String getLastName(){
        String result = "";
        Scanner in = new Scanner(System.in);
        showMessege("Введите фамилию контакта: ");
        result = in.nextLine();
        // in.close();
        return result;
        }
    
    public String getPhonenumber(){
        String result = "";
        Scanner in = new Scanner(System.in);
        showMessege("Введите телефон контакта: ");
        result = in.nextLine();
        // in.close();
        return result;
        }
    
    public String getRelative(){
        String result = "";
        Scanner in = new Scanner(System.in);
        showMessege("Введите тип родственника контакта: ");
        result = in.nextLine();
        // in.close();
        return result;
        }
    
    public String getOrganization(){
        String result = "";
        Scanner in = new Scanner(System.in);
        showMessege("Введите название организации: ");
        result = in.nextLine();
        // in.close();
        return result;
        }
    
    public String getPossition(){
        String result = "";
        Scanner in = new Scanner(System.in);
        showMessege("Введите должность контакта: ");
        result = in.nextLine();
        // in.close();
        return result;
        }
    
}
