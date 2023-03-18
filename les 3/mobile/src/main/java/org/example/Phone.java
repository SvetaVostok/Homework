package org.example;

public class Phone {
    private String number, model;
    private int weight;

    public Phone(String number, String model, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;;
    }

    public Phone(String number, String model){
        this.model = model;
        this.number = number;
    }
    public Phone(){
    }
    public String receiveCall(String name){
        System.out.println("Звонит " + name);
        return null;
    }
    public String getNumber(){
        return number;
    }

    public String receiveCall(String name, String number){
        System.out.println("Звонит " + name + " " + number);
        return null;
    }

    public String[] sendMessage(){
        String[] Messager = new String[3];
        Messager[0] = "8921921331";
        Messager[1] = "8981893221";
        Messager[2] = "8912913111";
        for (int i = 0; i < Messager.length; i ++){
            System.out.println(Messager[i]);
        }
        return Messager;
    }
    public String toString(){
        String S = this.model + " " + this.number + " " + this.weight;
        return S;
    }

}
