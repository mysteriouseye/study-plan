public class App {
    public static void main(String[] args) throws Exception {
        Bungalow commonHouse = new Bungalow();

        HouseDirector houseDirector = new HouseDirector(commonHouse);
        
        House house = houseDirector.constructHouse();

        System.out.println("--------------------------------");

        Villa villa = new Villa();

        houseDirector.setHousBuilder(villa);

        houseDirector.constructHouse();
    }
}
