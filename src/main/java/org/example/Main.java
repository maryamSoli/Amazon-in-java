package org.example;

public class Main {
    public static void main(String[] args) {

       /* Admin n = new Admin();
        n.Admin();*/
       /* User u = new User();
        u.User();*/

        AdminOperations a = new AdminOperations();
        a.addAdmin();

        for (Admin i : a.theAdmins){

            System.out.println(i.toString());
        }


    }
}