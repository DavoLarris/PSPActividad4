/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author DavoLarris
 */
class PushPeopleToList implements Runnable {

    /**
     * * Number of people to insert.
     */
    private int numberOfPeople;
    private ArrayList<Person> personas;

    /**
     * * Class constructor.
     *
     * * @param numberOfPeople people to insert.
     */
    public PushPeopleToList(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.personas = new ArrayList<Person>();
    }

    @Override
    public void run() {
        System.out.println("Starting to push people to an ArrayList");

        while (this.numberOfPeople != 0) {
            try {
                Thread.sleep(500);
                personas.add(new Person());
            } catch (InterruptedException ex) {
                Logger.getLogger(PushPeopleToList.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.numberOfPeople--;
        }
        //TODO: Crea un ArrayList. A continuación, dentro de un bucle con el 
        //mismo número de iteraciones que personas a insertar, crea una espera 
        //de medio segundo, crea la persona a insertar e insértala 
        System.out.println("Everyone is already in the ArrayList");
    }

}
