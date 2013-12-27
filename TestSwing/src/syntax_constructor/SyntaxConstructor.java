package syntax_constructor;
import javax.swing.*;
/**
 * Created by deanto on 27.12.13.
 * В этом классе заключена вся функциональность синтаксического конструктора
 */
public class SyntaxConstructor implements IVersion {
    private int _version = 1;
    private String _name = "SyntaxConstructor";
    private int _height = 400,_width=300;
    public int getVersion()
    {
        return _version;
    }

    private JFrame _frame;


    public SyntaxConstructor()
    {
        _frame = new JFrame(_name+"_v"+_version);
        _frame.setBounds(0,0,_width,_height);
    }

    public void setVisible()
    {
        _frame.setVisible(true);
    }
}
