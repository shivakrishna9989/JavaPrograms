/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_BlackJack;

/**
 *
 * @author Akhilkondra
 */
public class ParentRecord {
    private String firstname;
    private String lastname;
    private int age;
    
   public ParentRecord(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }


    public void setFirstname(String firstname) {
       this.firstname = firstname;
    }

    public String getFirstname() {
       return firstname;
    }
    
    public void setLastname(String lastname) {
       this.lastname = lastname;
    }

    public String getLastname() {
       return lastname;
    }

    
    
    public void setAge(int age) {
       this.age = age;
    }

    public int getAge() {
       return age;
    }
    
    @Override
    public String toString() {
        return "ParentRecord{" + "firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + '}';
    }
    
}
