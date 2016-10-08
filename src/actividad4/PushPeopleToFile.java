/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavoLarris
 */
class PushPeopleToFile implements Runnable {
    /**
     * * Number of people to insert.
     */
    private int numberOfPeople;
    private FileWriter writer;
    private BufferedWriter bufferedWriter;

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
        while (this.numberOfPeople != 0) {
            try {
                writer = new FileWriter("people.txt", true);
                bufferedWriter = new BufferedWriter(writer);
                Person per = new Person();
                bufferedWriter.write(per.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                Thread.sleep(500);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ex) {
                Logger.getLogger(PushPeopleToFile.class.getName()).log(Level.SEVERE, null, ex);
            } 
            this.numberOfPeople--;
        }

        System.out.println("Everyone is already in a text file");
    }
}
