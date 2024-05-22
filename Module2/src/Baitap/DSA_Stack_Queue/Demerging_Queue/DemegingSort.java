package Baitap.DSA_Stack_Queue.Demerging_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class DemegingSort {
    public static void Demeging(List<Personnel> input) {

        Queue<Personnel> NU = new LinkedList<>();
        Queue<Personnel> NAM = new LinkedList<>();

        for (Personnel p : input) {
            if (p.getGender() == "Nữ") {
                NU.add(p);
            } else {
                NAM.add(p);
            }
        }
        while (!NU.isEmpty()) {
            Personnel person = NU.poll();
            inPerson(person);
        }
        while (!NAM.isEmpty()) {
            Personnel person = NAM.poll();
            inPerson(person);
        }
    }

    public static void inPerson(Personnel person) {
        System.out.println("Name: " + person.getName() + ", Gender: " + person.getGender() + ", Birth: " + person.getBirth());
    }

    public static void main(String[] args) {

        List<Personnel> input = new ArrayList<>();

        Personnel person = new Personnel("Bảo Kỳ", "Nam", "03-05-1999");
        Personnel person1 = new Personnel("Phong", "Nữ", "03-05-1999");
        Personnel person2 = new Personnel("Quang", "Nữ", "02-09-2002");
        Personnel person3 = new Personnel("Phúc", "Nam", "30-4-2001");
        Personnel person4 = new Personnel("Công", "Nữ", "20-10-2004");

        input.add(person);
        input.add(person1);
        input.add(person2);
        input.add(person3);
        input.add(person4);

        Demeging(input);
    }
}
