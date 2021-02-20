package com.bd.zuche;
//轿车类
public class Car extends FatherCar{
    private String name = "子龙";     //车名
    private String brand = "红旗";//品牌
    //构造方法，指定车名和品牌
    public Car(String name,String brand){
        this.name = name;
        this.brand= brand;
    }
    //显示车辆
    public void show(){
        System.out.println("显示车辆信息：\n 车辆名称为：" + this.name + "\t 品牌是：" + this.brand + " \t油量是：" +
                this.oil + "\t 车损度为：" + this.loss);
    }
    //获取车名
    public String getName(){
        return name;
    }
    //获取油量
    public int getOil(){
        return oil;
    }
    //获取车损度
    public int getLoss(){
        return loss;
    }
    //获取品牌
    public String getBrand(){
        return brand;
    }
    //加油

}
