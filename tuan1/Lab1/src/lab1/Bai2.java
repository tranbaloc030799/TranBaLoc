/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static void main(String[] args) {
        Double chieuDai,chieuRong,dienTich,chuVi ;
        Scanner baLoc = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài ");
        chieuDai =baLoc.nextDouble();
        System.out.println("Nhập Chiều Rộng ");
        chieuRong =baLoc.nextDouble();
        dienTich=chieuDai*chieuRong;
        chuVi=(chieuDai+chieuRong)*2;
        System.out.println("Diện Tích Là "+dienTich);
        System.out.println("Chu Vi Là "+chuVi);
        
    }
    
}
