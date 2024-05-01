/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasRama;

/**
 *
 * @author Asus
 */
public class Person {
    protected String name;
    protected String address;
	
    //Default Constructor
    public Person() {
	    System.out.println("Inside Person:Constructor");
	    name="";
	    address="";
    }
	
    //Constructor dengan parameter
    public Person(String name,String address) {
	    this.name = name;
	    this.address = address;
    }
	
    public String getName() {
	    return name;
    }
	
    public String getAddress() {
	    return address;
    }
	
    public void setName(String name) {
	    this.name = name;
    }
	
    public void setAddress(String address) {
	    this.address = address;
    }
	
    public void job(String job) {
	    System.out.println("Pekerjaan "+job);
    }
	
    public void identity() {
	    System.out.println("Nama: "+name);
	    System.out.println("Alamat: "+address);
    }

    public void hobi(String hobi) {
        System.out.println("Hobi: " +hobi);
    }
}


