/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInjection;

/**
 *
 * @author ryota
 */

interface Service{
    public String getName();
}
public class Client implements Service{
    //internal reference to the service used by the client
    private final Service servcie;
    
    Client(Service service){
        //specify a specific implementation in the constructor instead of using in type of dependny injection
        
        this.servcie = service;
        
    }
    
    public String greet(){
        return "Hello" + this.getName();
    }

    @Override
    public String getName() {
        return "ho";
    }
}
