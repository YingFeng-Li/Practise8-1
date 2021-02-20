import com.bd.zuche.Car;
import com.bd.zuche.Truck;

import java.util.Scanner;

/**
 * @ClassName TestZuChe
 * @Description: TODO
 * @Author YingFengli
 * @Date 2021/2/20/020
 * @Version V1.0
 **/
public class TestZuChe {
    public static void main(String[] args) {
        String name = null;     //车名
        int Oil     = 20;
        int loss    = 0;
        String brand= null;
        String load = null;
        Scanner input = new Scanner(System.in);
        System.out.println("**欢迎来到蓝桥租车系统***");
        System.out.println("请选择要租车的类型：(1代表轿车，2代表卡车)");
        int select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("请选择轿车品牌：（1代表红旗，2代表长城）");
                select = input.nextInt();
                if (select == 1){
                    brand = "红旗";
                }else {
                    brand = "长城";
                }
                System.out.println("请给所租的车起名：");
                name = input.next();
                Car car = new Car(name,brand);      //使用构造方法初始化车名和品牌
                car.show();     //输出车辆信息
                break;
            case 2:
                System.out.println("请选择卡车吨位：（1代表5吨，2代表10吨）");
                select = input.nextInt();
                if (select == 1){
                    load = "5吨";
                }else {
                    load = "10吨";
                }
                System.out.println("请给所租的车起名：");
                name = input.next();
                Truck truck = new Truck(name,load);     //使用构造方法初始化车名和吨位
                truck.show();   //显示车辆信息
                break;
        }
        Car car = new Car("战神","长城");   //初始化轿车对象car
        car.show();     //输出车辆信息
        car.drive();    //让car行驶1次，油量剩下15升，车损度为10
        car.show();     //输出车辆信息
        car.drive();    //让car再行驶一次，油量剩下10升，车损度为20
        car.drive();    //让car再行驶一次，油量剩下5升，车损度为30
        car.drive();    //让cae再行驶一次，因油量不足10升，不行驶，提示需要加油
        car.addOil();   //让car加油一次，油量增加20升，达到25升
        car.show();     //输出车辆信息
    }
}
