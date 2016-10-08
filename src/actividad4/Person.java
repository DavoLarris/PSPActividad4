/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.Random;

/**
 *
 * @author DavoLarris
 */
class Person {

//TODO: Declare the attributes of a person: age and dni 
    private int age;
    private String dni = "";
    private Random rdn = new Random();
    private final String[] LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
        "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
        "Y", "Z"};

    /**
     * Class constructor.
     */
    public Person() {
//Initialize attributes to random values.The age must be an integer 
//between 0 and 100, and the dni a 8 characters alphanumeric string 
        this.age = rdn.nextInt(100);
        for (int i = 0; i <= 7; i++) {
            this.dni += "" + rdn.nextInt(10);
        }
        
        this.dni += LETTERS[rdn.nextInt(LETTERS.length)];

    }

    @Override
    public String toString() {
//TODO: Return a string with the attributes of a Person to be 
//printed in the file 
        return "DNI: " + this.dni + " - edad: " + this.age;
    }

}
