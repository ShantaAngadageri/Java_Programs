class Login {

    void login(String email) {
        System.out.println("Login using email");
    }

    void login(String username, String password) {
        System.out.println("Login using username & password");
    }

    void login(long mobile, int otp) {
        System.out.println("Login using mobile & OTP");
    }

    public static void main(String[] args) {
        Login l = new Login();

        l.login("user@gmail.com");
        l.login("admin", "1234");
        l.login(9876543210L, 5678);
    }
}
