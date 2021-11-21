package fr.esgi.cc1;

public class Main {
    public static void main(String[] args){

        User client = new User(1, "Théo", "Gouraud", "gfgfgfg@gmail.com", "test", Type.client, new Address(1, "Courbevoie", 1, "rue de l'église"));

        User Admin = new User(2, "Théo", "Gouraud", "gfgfgfg@gmail.com", "test", Type.admin, new Address(1, "Courbevoie", 1, "rue de l'église"));



        System.out.println(client.getStatePaiement());

        client.updateUserPaiment();


    }
}