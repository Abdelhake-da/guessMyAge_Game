package sample;

import javafx.scene.image.Image;

public class data {
    static int nuntour;
    static  int  num;
    static String []imageurl={"image/image_a/1y3.png","image/image_a/2y1.png","image/image_a/2y2.png","image/image_a/2y3.png","image/image_a/2y4.png","image/image_a/3y1.png","image/image_a/3y1.png","image/image_a/4y1.png","image/image_a/5y1.png","image/image_a/5y2.png","image/image_a/6y2.png","image/image_a/6y1.png","image/image_a/9y1.png","image/image_a/9y2.png","image/image_a/10y1.png","image/image_a/10y2.png",
            "image/image_a/15y1.png","image/image_a/16y1.png","image/image_a/16y2.png","image/image_a/20y1.png","image/image_a/22y1.png","image/image_a/25y1.png","image/image_a/33y1.png","image/image_a/45y1.png","image/image_a/49y1.png","image/image_a/53y1.png","image/image_a/57y1.png","image/image_a/64y1.png","image/image_a/71y1.png"};
    static int age[]={1,2,2,2,2,3,3
            ,4,5,5,6,6,9,9,10,10,15,16,16,20,22,25,33,45,49,53,56,64,71};
    public static int  getnum(){
        num = (int) (Math.random ( ) * 29) ;
        return num;
    }
}
