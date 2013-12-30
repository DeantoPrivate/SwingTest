package code.Net;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by deanto on 30.12.13.
 */
public class ObjectFabric {

    /**
     * Tokens related
     */
    private static ArrayList<Token> _tokens;

    public static Token getNewToken(){
        Token newone = new Token(_tokens.size());
        AddToToken(newone);
        _tokens.add(newone);
        return newone;
    }

    // добавляем некоторые значения чтоб можно было ими пользоваться сразу
    private static void AddToToken(Token one){

    }




    /**
     * States related
     */
    private static ArrayList<State> _states;
    public static State getNewState(){
        State newone = new State(_states.size());
        AddToState(newone);
        _states.add(newone);
        return newone;
    }

    private static void AddToState(State one){

    }





    /**
     * Transitions related
     */

    private static ArrayList<Transition> _transition;
    public static Transition getNewTransition(){
        Transition newone = new Transition( _transition.size());
        AddToTransition(newone);
        _transition.add(newone);
        return newone;
    }

    private static void AddToTransition(Transition one){

    }

    /**
     * All related
     */
    public ObjectFabric(){
        _tokens = new ArrayList<Token>();
    }
}
