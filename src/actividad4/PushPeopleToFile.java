/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

/**
 *
 * @author DavoLarris
 */
class PushPeopleToFile implements Runnable {

    /**
     * * Number of people to insert.
     */
    private int numberOfPeople;

    /**
     * Class constructor.
     *
     * @param numberOfPeople people to insert.
     */
    public PushPeopleToFile(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public void run() {
        System.out.println("Starting to push people to a text file");
        //TODO: Crea los objetos necesarios para escribir a fichero en Java. 
//A continuación, dentro de un bucle con el mismo número de iteraciones
//que personas a insertar, crea una espera 
//de medio segundo, crea la persona y vuélcala a fichero 

        System.out.println("Everyone is already in a text file");
    }
}
