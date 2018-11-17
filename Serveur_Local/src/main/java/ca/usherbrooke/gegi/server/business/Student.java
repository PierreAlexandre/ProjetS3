
package ca.usherbrooke.gegi.server.business;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String cip;
    private String user_name;
    private String e_mail;
    private String phone;
    private  List<Integer> my_annonces_List = new ArrayList<Integer>();

    public void setMy_annonces_List(int id_annonce) {
        this.my_annonces_List.add(id_annonce);
    }

//public int delete_annonce(Annonce_book annonce_book){}

    public String getCip() {
        return cip;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cip='" + cip + '\'' +
                ", user_name='" + user_name + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
