package code.NetObjectsWrapers;

import code.Net.ObjectFabric;
import code.Net.Token;

import java.rmi.NoSuchObjectException;
import java.util.*;

/**
 * Created by deanto on 30.12.13.
 * оболочка  - через нее работаем с токеном.
 * представляется как надстройка над классом, и так же еще набор статических методов
 */
public class TokenWrap  {

    public static Token NewToken()
    {
        return ObjectFabric.getNewToken();
    }

    // можно заменить Token на объект этого класса и пользоваться следующим функционалом
    private Token _token;
    private boolean _assigned = false;
    public void Assign(Token token){
        _token=token;
        _assigned=true;
        Count();
    }

    private int _count;
    public int Count(){
        _count = _token.getIntegerValues().size()+_token.getStringValues().size();
        return _count;
    }


    public Hashtable<String,String> GetAllProperties(){
        Hashtable<String,String> s = new Hashtable<String, String>();
        s.putAll(_token.getStringValues());
        for (int i=0;i<_token.getIntegerValues().size();i++)
            s.put(_token.getIntegerValues().keys().nextElement(), _token.getIntegerValues().values().iterator().next().toString());

        return s;
    }

    
}
