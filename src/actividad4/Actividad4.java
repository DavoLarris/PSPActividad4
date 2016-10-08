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
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfPeople = 20; 
        //Thread t1 = new Thread(new PushPeopleToFile (numberOfPeople));
        //t1.start(); 
        
        //Thread t2 = new Thread(new PushPeopleToList(numberOfPeople)); 
        //t2.start();
        
        PushPeopleToFile t1 = new PushPeopleToFile (numberOfPeople);
        t1.run(); 
        
        PushPeopleToList t2 = new PushPeopleToList(numberOfPeople); 
        t2.run();
    }
    
}
