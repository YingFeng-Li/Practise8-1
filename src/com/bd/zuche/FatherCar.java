package com.bd.zuche;

/**
 * @ClassName FatherCar
 * @Description: TODO
 * @Author YingFengli
 * @Date 2021/2/20/020
 * @Version V1.0
 **/
public class FatherCar {
    int oil = 20;       //油量
    int loss= 0;        //车损度
    //加油
    public void addOil(){   //如果加油20升则超过油箱容量，则加到 60升即可
        if(oil > 40){
            oil = 60;
            System.out.println("油箱已加满！");
        }else {
            oil = oil + 20;
        }
        System.out.println("加油完成！");
    }
    //行驶
    public void drive(){
        if (oil < 10){
            System.out.println("油量不足10升，需要加油！");
        }else {
            System.out.println("正在行驶！");
            oil = oil - 5;
            loss = loss + 10;
        }
    }
}
