/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;


import Model.TaiKhoan;




public class Auth {

    public static TaiKhoan user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isStaff() {
        return Auth.isLogin() && user.getVaiTro().equalsIgnoreCase("Nhân Viên");
    }
}
