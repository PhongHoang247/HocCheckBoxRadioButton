package com.phong.hoccheckboxradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAndroid, chkSwift, chkC;
    Button btnXacNhanSoThich;
    TextView txtSoThich;

    RadioButton radDoNamTrung, radTapCanBinh, radHCM;
    TextView txtKetQuaBinhChon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        chkAndroid=(CheckBox) findViewById(R.id.chkAndroid);
        chkSwift=(CheckBox) findViewById(R.id.chkSwift);
        chkC=(CheckBox) findViewById(R.id.chkC);
        txtSoThich=(TextView) findViewById(R.id.txtSoThich);
        btnXacNhanSoThich=(Button) findViewById(R.id.btnXacNhan);

        radDoNamTrung=(RadioButton) findViewById(R.id.radDoNamTrung);
        radTapCanBinh=(RadioButton) findViewById(R.id.radTapCanBinh);
        radHCM=(RadioButton) findViewById(R.id.radHCM);
        txtKetQuaBinhChon=(TextView) findViewById(R.id.txtKetQuaBinhChon);
    }

    public void XuLyXacNhanSoThich(View view) {
        String msg="";
        if(chkAndroid.isChecked()==true)
        {
            msg=msg+chkAndroid.getText().toString()+"\n";
        }
        if(chkSwift.isChecked())
        {
            msg+=chkSwift.getText().toString()+"\n";
        }
        if(chkC.isChecked())
        {
            msg+=chkC.getText().toString()+"\n";
        }
        txtSoThich.setText(msg);
    }

    public void XuLyBinhChon(View view) {
        /*if(radDoNamTrung.isChecked())
        {
            txtKetQuaBinhChon.setText(radDoNamTrung.getText());
        }
        else if (radTapCanBinh.isChecked())
        {
            txtKetQuaBinhChon.setText(radTapCanBinh.getText());
        }
        else if (radHCM.isChecked())
        {
            txtKetQuaBinhChon.setText(radHCM.getText());
        }*/
        RadioGroup group=(RadioGroup) findViewById(R.id.group);
        //Tìm RadioButton trong trong group mà đang đc Checked:
        int id = group.getCheckedRadioButtonId();
        if (id>0)
        {
            RadioButton radioButton=(RadioButton) findViewById(id);
            txtKetQuaBinhChon.setText(radioButton.getText());
        }
    }
}
