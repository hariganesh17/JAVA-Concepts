package DesignPatterns;

class User {
    private final String name;   //required
    private final String email; //optional
    private final String mobile;  //optional

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;

    }

    static class Builder {
        private final String name;
        private String email;
        private String mobile;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this; //chain method calls
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString(){
            return "Name:"+name +
                    ", Email:"+ (email != null ? email : "N/A") +
                    ", mobile:"+ (mobile != null ? mobile : "N/A");
    }
}
public class BuilderPattern {
    public static void main(String[] args){
        User user = new User.Builder("Hari")
                .setEmail("asd")
                .setMobile("123")
                .build();

        System.out.println(user);
    }
}
