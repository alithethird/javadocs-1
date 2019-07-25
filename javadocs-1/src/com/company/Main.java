package com.company;

interface parfume {
    void use_bottle(int a);
    void how_much_left();
}
interface coke {
    void pour_a_glass();
    void how_much_left();
}
class tutaste_parfume implements parfume{

    int fiss_left = 100;

    public void use_bottle(int times){
        fiss_left -= times;
    }
    public void how_much_left(){
        System.out.println("The amount of fiss left is: " + fiss_left);
    }
    public void use_ten(){
        fiss_left -= 10;
    }
}

class pepsi_coke implements coke{

    int liquid_left = 1000;

    public void pour_a_glass(){
        liquid_left -= 100;
    }

    public void how_much_left(){
        System.out.println("The amount of glass left is: " + liquid_left/100);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        tutaste_parfume  bottle1 = new tutaste_parfume();
        pepsi_coke bottle2 = new pepsi_coke();
        bottle1.use_bottle(2);
        bottle2.pour_a_glass();

        bottle1.how_much_left();
        bottle2.how_much_left();
        bottle1.use_ten();
        bottle1.how_much_left();
    }
}
