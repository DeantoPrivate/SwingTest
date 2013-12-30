package code.Net;

import java.util.*;

/**
 * Created by deanto on 27.12.13.
 */
public class Token extends NetObj {

    public Token(int id)
    {
       super(id);
        _stringValues=new Hashtable<String, String>();
        _integerValues = new Hashtable<String, Integer>();
    }

    private Hashtable<String,String> _stringValues;
    private Hashtable<String,Integer> _integerValues;

    public Hashtable<String,String> getStringValues(){return _stringValues;}
    public Hashtable<String,Integer> getIntegerValues(){return _integerValues;}

}

