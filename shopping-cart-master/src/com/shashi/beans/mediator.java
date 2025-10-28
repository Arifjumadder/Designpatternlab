import java.util.*;
interface CreateMediator {
 
}

class product implements CreateMediator {

}


class Areaproduct implements CreateMediator {

}


class warehouseinfo implements CreateMediator {

}


abstract class User {


    public abstract void send(String msg);
    public abstract void receive(String msg);
}

class ChatUser extends User {

}


public class MediatorPatternDemo {
    public static void main(String[] args) {
       
    }}