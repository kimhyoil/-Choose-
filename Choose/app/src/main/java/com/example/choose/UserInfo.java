package com.example.choose;

public class UserInfo {
    private static int id;
    private static String email;
    private static String password;
    private static boolean isLogin = false;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserInfo.id = id;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UserInfo.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserInfo.password = password;
    }

    public static boolean isIsLogin() {
        return isLogin;
    }

    public static void setIsLogin(boolean isLogin) {
        UserInfo.isLogin = isLogin;
    }
}
