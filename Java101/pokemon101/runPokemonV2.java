package pokemon101;
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
//this code is used to test the movement functions without the checks built in so the porgram would compile 

//not working as of now
public class runPokemonV2 {
    

    public static void walkLeft(int steps){
        try{
        Robot walker=new Robot();
        for (int i=0;i<steps;i++){
        walker.keyPress(KeyEvent.VK_LEFT);
        walker.delay(50);
        walker.keyRelease(KeyEvent.VK_LEFT);
        walker.delay(400);
    }}
        catch(AWTException e){
            e.printStackTrace();
        }
    }
    public static void walkRight(int steps){
        try{
        Robot walker=new Robot();
        for (int i=0;i<steps;i++){   
        walker.keyPress(KeyEvent.VK_RIGHT);
        walker.delay(50);
        walker.keyRelease(KeyEvent.VK_RIGHT);
        walker.delay(400);}
    }
        catch(AWTException e){
            e.printStackTrace();
        }
    }
    public static void walkUp(int steps){
        try{
        Robot walker=new Robot();
        for (int i=0;i<steps;i++){
        walker.keyPress(KeyEvent.VK_UP);
        walker.delay(50);
        walker.keyRelease(KeyEvent.VK_UP);
        walker.delay(400);}}
        catch (AWTException e){
            e.printStackTrace();
        }
    }
    public static void walkDown(int steps){
        try{
        Robot walker=new Robot();
        for (int i=0;i<steps;i++){
        walker.keyPress(KeyEvent.VK_DOWN);
        walker.delay(50);
        walker.keyRelease(KeyEvent.VK_DOWN);
        walker.delay(400);}}
        catch(AWTException e) { 
            e.printStackTrace(); 
        } 
    }
    public static void pressA(int times){
        try{for(int i=0;i<times;i++){Robot presser=new Robot();
        presser.keyPress(KeyEvent.VK_Z);
        presser.delay(50);
        presser.keyRelease(KeyEvent.VK_Z);
        presser.delay(400);}
    }
    catch(AWTException e){
        e.printStackTrace();
    }}
    public static void pressB(int times){
        try{for(int i=0;i<times;i++){Robot presser=new Robot();
        presser.keyPress(KeyEvent.VK_X);
        presser.delay(50);
        presser.keyRelease(KeyEvent.VK_X);
        presser.delay(400);}
    }
    catch(AWTException e){
        e.printStackTrace();
    }}
    public static void delayGame(int milliSeconds)
    {
        try{Robot delayer=new Robot();
        delayer.delay(milliSeconds);}
        catch(AWTException e){
            e.printStackTrace();}
        }
    
    public static void momToBattle() {
    // might need to construct robot in different robot class "Public robot() {code code code} "
    //can indicate the exact graphics device screen of gba rom - 
    //can implement robot(Graphics device screen)
    // graphics device screen needs for lo ops, jframe, rectangle pixel bounds
    //throws awtException
    // throws security Exception - if robot is not granted permision
    walkRight(8);
    walkDown(7);
    walkRight(7);
    walkUp(13);
    walkLeft(6);
    walkUp(2);}
  

    
    public static void battleToMom(){

        walkRight(1);
        //ADD IF STATEMENT TO CHECK IF ANOTHER BATTLE STARTED HERE,EXECUTE BATTLE METHOD until it ends then continue home
        walkRight(5);
        walkDown(14);
        walkLeft(6);
        walkUp(1);
        delayGame(1200);
        walkUp(4);
        walkLeft(7);
        walkDown(1);}

    
    public static void deathToBattle(){//test this method for specific steps, and to make sure he is turning then movin

           pressA(5);
           delayGame(400);
           pressA(5);
           delayGame(400);
           pressA(5);
           delayGame(1000);
           walkRight(4);
           walkUp(2);
           delayGame(800);
           walkDown(6);
           delayGame(800);
           walkRight(6);
           walkUp(13);
           walkLeft(6);
           walkUp(2);}




       public static void heal(){
           battleToMom();
           delayGame(7000);
           pressA(7);
           delayGame(500);
           pressA(7);
           delayGame(500);
           pressA(3);
           momToBattle();
       }
       public static void newMove(){
           
       }
       public static void main(String args[]){//testing class
        delayGame(3000);
           battleToMom();
       }
    }
