package hasARealtionDemo;

public class Test {
    public static void main(String[] args) {
        Country country= new Country();
        State state = new State();
        country.countryName="India";
        country.countryCode="+91";
        state.stateName="telangana";
        country.state=state;
        state.country=country;
        System.out.println(country.state.stateName);


    }
}
