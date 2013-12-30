package code.Net;

/**
 * Created by deanto on 30.12.13.
 */
public class NetObj {
    protected int _id;
    public int ID(){return _id;}
    protected String _name;
    public String getName(){return _name;}
    public void setName(String name){_name = name;}

    public NetObj(int id){
        _id = id;
    }
}
