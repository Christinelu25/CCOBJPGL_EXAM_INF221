package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Batanes;
import Locations.Ilocos;
import Locations.Palawan;
import Locations.Siargao;
import Locations.Vigan;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Batanes batanes);

    void visit(Ilocos ilocos);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    void visit(Vigan vigan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}