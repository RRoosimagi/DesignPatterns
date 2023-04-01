package User;

public class main {
    public static void main(String[] args){
        User user = new UserBuilder()
                .setFirstName("Rauno")
                .setLastName("Roosimagi")
                .setAge(39)
                .setEmail("rroosimagi@gmail.com")
                .setPhone("+37253056107")
                .setAddress("Ketshup 23, Las Ketshup, 44311")
                .build();

    }
}
