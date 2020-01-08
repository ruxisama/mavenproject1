package stringurile;

import java.util.ArrayList; // java.util.ArrayList.* pt tot pachetul java.util

public class Colectii {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add("value");
        arrayList.add(13.13);
        arrayList.add('A');
        
        // arrayList.clear(); //sterge elementele din colectie

        System.out.println(arrayList.get(0)); //afiseaza elem de la index 0
        
        arrayList.remove(1); //sterge elementul cu indexul 1- si ii ia locul urmatorul

        System.out.println(arrayList.contains(13.13)); // afla daca contine variabila true/false
        
        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i)); //afiseaza toate elementele colectiei
        }

    }

}
