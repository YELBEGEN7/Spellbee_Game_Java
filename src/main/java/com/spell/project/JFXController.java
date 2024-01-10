package com.spell.project;


import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;

import java.util.ArrayList;
import java.util.Collections;



public class JFXController {

    @FXML
    public Button button0;
    @FXML
    public Button button1;
    @FXML
    public Button button2;
    @FXML
    public Button button3;
    @FXML
    public Button button4;
    @FXML
    public Button button5;
    @FXML
    public Button button6;
    @FXML
    public Button enter;
    @FXML
    public Button refresh;
    @FXML
    public Button delete;

    @FXML
    public Button auto;
    @FXML
    public Label Scorestr;
    @FXML
    public Label Score;
    @FXML
    public TextArea textfield;
    @FXML
    public TextArea textArea;
    @FXML
    public javafx.scene.text.Text error;
    @FXML
    public Button exit;




    Control control=new Control();
    AutoSetup autosetup=new AutoSetup();
    ArrayList<Character> Mixerlist=new ArrayList<>(autosetup.nocenter);

    public void AutoSetupAction(ActionEvent e){
        autosetup.select_word();
        autosetup.select_center();
        Buttons();

    }



    public String Mixer(){
        Collections.shuffle(Mixerlist);
        String str=Mixerlist.get(0).toString().toUpperCase();
        Mixerlist.remove(0);
        return str;
    }
    public void Buttons(){
        button0.setText(autosetup.selectcenter.toUpperCase());
        button1.setText(Mixer());
        button2.setText(Mixer());
        button3.setText(Mixer());
        button4.setText(Mixer());
        button5.setText(Mixer());
        button6.setText(Mixer());
    }
    public void RefreshAction(ActionEvent e){
        Mixerlist.addAll(autosetup.nocenter);
        Buttons();
    }
    public void button0Action(ActionEvent e){textfield.appendText(button0.getText());}
    public void button1Action(ActionEvent e){textfield.appendText(button1.getText());}
    public void button2Action(ActionEvent e){textfield.appendText(button2.getText());}
    public void button3Action(ActionEvent e){textfield.appendText(button3.getText());}
    public void button4Action(ActionEvent e){textfield.appendText(button4.getText());}
    public void button5Action(ActionEvent e){textfield.appendText(button5.getText());}
    public void button6Action(ActionEvent e){textfield.appendText(button6.getText());}
    public void TextFieldAction(InputMethodEvent e){textfield.getText();}
    public void DeleteAction(ActionEvent e){textfield.deletePreviousChar();}
    public void EnterAction(ActionEvent e){
        if(control.equels(autosetup.absentlist,textfield.getText())){

            int temp = Integer.parseInt(Score.getText()) + 1;
            Score.setText(String.valueOf(temp));
            textArea.appendText(textfield.getText());
            error.setText("");
            textArea.appendText("\n");
            textfield.clear();

        }
        else{
            error.setText("Yanlış Kelime");
            textfield.clear();
        }

    }
    public void ScoreAction(InputMethodEvent e){Score.getText();}
    public void errorAction(InputMethodEvent e){error.getText();}
    public void textareaAction(InputMethodEvent e){textArea.getText();}
    public void exitAction(ActionEvent e){Platform.exit();}






}

