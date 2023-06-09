/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagement;

/**
 *
 * @author Lashadya
 */
import java.sql.SQLException;
import java.util.ArrayList;

public class electronics {
    String No;
    String type;
    String name;
    String price;
    String color;
    String ISP;
    String brand;
    String PrinterType;
    String[] cols = {"no","type","name","price","color","ISP","brand","printertype"};


    public static class Movable extends electronics{


        public void Laptop(String No,String name,String price, String color) {
            this.No=No;
            this.type="Unmovable";
            this.name=name;
            this.price=price;
            this.color=color;
            this.ISP="---";
            this.brand="---";
            this.PrinterType="---";
        }

        public void Router(String No,String name,String price, String ISP) {
            this.No=No;
            this.type="Unmovable";
            this.name=name;
            this.price=price;
            this.color="---";
            this.ISP=ISP;
            this.brand="---";
            this.PrinterType="---";
        }

        public void Tablet(String No,String name,String price, String brand) {
            this.No=No;
            this.type="Unmovable";
            this.name=name;
            this.price=price;
            this.color="---";
            this.ISP="---";
            this.brand=brand;
            this.PrinterType="---";
        }
    }

    public static class Unmovable extends electronics{

        public void Fan(String No,String name,String price, String brand) {
            this.No=No;
            this.type="Movable";
            this.name=name;
            this.price=price;
            this.color="---";
            this.ISP="---";
            this.brand=brand;
            this.PrinterType="---";
        }

        public void Printer(String No,String name,String price, String PrinterType) {
            this.No=No;
            this.type="Movable";
            this.name=name;
            this.price=price;
            this.color="---";
            this.ISP="---";
            this.brand="---";
            this.PrinterType=PrinterType;
        }

        public void AC(String No,String name,String price, String brand) {
            this.No=No;
            this.type="Movable";
            this.name=name;
            this.price=price;
            this.color="---";
            this.ISP="---";
            this.brand=brand;
            this.PrinterType="---";
        }
    }

    public String getNo() {
        return No;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getISP() {
        return ISP;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrinterType() {
        return PrinterType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        No = no;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPrinterType(String printerType) {
        PrinterType = printerType;
    }

    public void display(String TempUserInput) throws SQLException {
        String ItemName;
        String sql;
        ArrayList<String> list=null;
        if (TempUserInput.equals("0")){
            ItemName="ALL";
        }
        else {
            ItemName = TempUserInput;
        }
        DBUtils data = new DBUtils();
        list = DBUtils.view("s",ItemName,cols);
        System.out.println(list);
    }

    public ArrayList<String> DisplayForView(String ItemCode){
        ArrayList<String> Temp = DBUtils.view("s", ItemCode, cols);
        return Temp;
    }
}
    