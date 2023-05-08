import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Bohol = new Batanes();
        Locations Boracay = new Boracay();
        Locations Cebu = new Ilocos();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Vigan = new Vigan();

        Tourist Lu = new Lu();

        Boracay.accept(Lu);
        Bohol.accept(Lu);
        Cebu.accept(Lu);
        Palawan.accept(Lu);
        Siargao.accept(Lu);
        Vigan.accept(Lu);



    }
}