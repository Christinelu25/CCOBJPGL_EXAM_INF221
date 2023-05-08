package Tourists;


import Locations.*;

public class Lu implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("Enjoying my travel");
    }

    public void visit(Boracay boracay) {
        System.out.println("My budget is " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Let's go to boracay" );
            budget -= boracay.airFare;

        }else{
            System.out.println("Awts wala na pala me pera");
        }

      checkBudget();

    }

    public void visit(Batanes batanes) {

        if(budget >batanes.airFare){
            System.out.println("Forda g sa batanes");
            budget -= batanes.airFare;
        }else{
            System.out.println("omg wala na me pera");
        }

        checkBudget();
    }
    public void visit(Ilocos ilocos) {
        if(budget >ilocos.airFare){
            System.out.println("next g naman Ilocos!");
            budget -= ilocos.airFare;
        }else{
            System.out.println("Ouch I have no budget na pala");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Here I come palawan!");
            budget -= palawan.airFare;
        }else{
            System.out.println("luh wala na ako pera");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("I think this is it for siargao!");
            budget -= siargao.airFare;
        }else{
            System.out.println("Ekis wala na me pera");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("Gere I come Vigan! ");
            budget -= vigan.airFare;
        }else{
            System.out.println("Ekis wala na natirang pera");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}