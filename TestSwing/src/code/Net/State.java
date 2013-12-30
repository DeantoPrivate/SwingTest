package code.Net;

import java.util.ArrayList;

/**
 * Created by deanto on 30.12.13.
 * описывает состояние
 */
public class State extends NetObj {

    private ArrayList<Token> _tokens;

    public ArrayList<Token> getTokens(){
        return _tokens;
    }

    private ArrayList<Transition> _inputTransitions;
    private ArrayList<Transition> _outputTransitions;

    public ArrayList<Transition> getInputTransitions(){return _inputTransitions;}
    public ArrayList<Transition> getOutputTransitions(){return _outputTransitions;}

    public State(int id)
    {
        super(id);
    }
}
