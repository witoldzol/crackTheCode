package singleton;

public class Logger {
    
    //create instance of the class
    //it has to be static, so we can call it without creating an object instance
    private static Logger logger;
    private String name;

    //we have to block the built in constructor
    private Logger(){
        name = "I'm a singleton";        
    }
    
    //we need to create getter method
    //and make it static so it can be called without object instance
    public static Logger getLogger(){
        
        if( logger == null){
            //on first call
            //create new instance if it doesn't exist
            logger = new Logger();
        }
        return logger;
    }
    //name getter
    public String getName(){
        return name;
    }
    
}