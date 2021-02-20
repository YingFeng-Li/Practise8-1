package com.bd.zuche;

/**
 * @ClassName Truck
 * @Description: TODO
 * @Author YingFengli
 * @Date 2021/2/19/019
 * @Version V1.0
 **/
public class Truck {
    private String name = "大力士";    //车名
    private int oil     = 20;       //油量
    private int loss    = 0;        //车损度
    private String load = "10吨";    //吨位
    //构造方法，指定车名和品牌
    public Truck(String name,String load){
        this.name = name;
        this.load = load;
    }

    public void show(){
        System.out.println("显示车辆信息：\n车辆名称为：" + this.name + "\t吨位是：" + this.load +
                "\t油量是：" + this.oil + "\t车损度为：" + this.loss);
    }
    //获取车名

    public String getName() {
        return name;
    }
    //获取油量
    public int getOil() {
        return oil;
    }
    //获取车损度
    public int getLoss() {
        return loss;
    }
    //获取吨位
    public String getLoad() {
        return load;
    }
}
