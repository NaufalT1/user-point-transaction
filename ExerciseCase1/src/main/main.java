package main;

import model.person;

public class main {
    public static void main(String[] args) {
        String[] listName = {"Robert","Downey","Chris","Tony"};

        person [] listPerson = new person[listName.length];

        for (int i = 0; i < listName.length; i++) {
            listPerson[i] = new person(listName[i],i,0);
        }

        for (person human: listPerson) {
            System.out.println(human.getName());
        }
    }
}