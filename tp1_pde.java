import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class tp1_pde extends PApplet {

public void setup() {
  fill (1);
  
  strokeWeight (0);
  textSize (10);
  
  fill (0);
  text ("ROJO" ,185,45);
  fill (0xffD10B0B);
  triangle(200,170,177,50,223,50); // 1
  
  fill (0);
  text ("ROJO" ,100,55);
  text ("PURPURA" ,77,69);
  fill (0xff9B224D);
  
  fill (0);
  text ("PURPURA" ,35,110);
  triangle(198,171,112,77,153,55); // 2 
  
  fill (0);
  text ("AZUL" ,25,170);
  text ("PURPURA" ,15,185);
  fill (0xff713061);
  triangle(197,173,70,130,93,91); // 3 
  
  fill (0);
  text ("AZUL" ,53,250);
  fill (0xff535386);
  triangle(196,175,65,155,65,197); // 4 
  
  fill (0);
  text ("AZUL" ,110,305);
  text ("VERDE" ,110,320);
  fill (0xff396CB2);
  triangle(197,177,70,221,93,263); // 5 
  
  fill (0);
  text ("VERDE" ,185,325);
  fill (0xff1F697E);
  triangle(198,179,112,280,153,304); // 6

  
  fill (0);
  text ("AZUL" ,53,250);
  fill (0xff45764D);
  triangle(200,180,177,310,223,310); //centro, derech, izq 7
  
    
  fill (0);
  text ("VERDE" ,265,305);
  text ("AMARILLO" ,265,320);
  fill (0xff96AA59);
  triangle(202,179,247,304,287,280); // 8 
  
  fill (0);
  text ("AMARILLO" ,320,250);
  fill (0xffDEE307);
  triangle(204,177,307,263,328,221); // 9 
  
  fill (0);
  text ("AMARILLO" ,340,170);
  text ("NARANJA" ,340,185);
  fill (0xffE8BF38);
  triangle(204,175,333,155,333,197); // 10 
  
    
  fill (0);
  text ("NARANJA" ,320,110);
  fill (0xffF09307);
  triangle(203,173,328,133,307,93); // 11
  
  fill (0);
  text ("ROJO" ,275,55);
  text ("NARANJA" ,275,69);
  fill (0xffD85A0B);
  triangle(202,171,247,55,287,78); // 12
 
} 
  public void settings() {  size (400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "tp1_pde" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
