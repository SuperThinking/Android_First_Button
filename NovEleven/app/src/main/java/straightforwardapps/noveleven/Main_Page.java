package straightforwardapps.noveleven;

import android.print.pdf.PrintedPdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.*;

public class Main_Page extends AppCompatActivity {

    Button btn;
    TextView clk;
    int sw = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main__page);
        btn = (Button) findViewById(R.id.myb);
        clk = (TextView) findViewById(R.id.tclock);
    }

    public void btnClick(View v)
    {
        String a = (String) clk.getText();
        char[] ch = a.toCharArray();
        int a1 = Character.getNumericValue(ch[2]), a2 = Character.getNumericValue(ch[3]);
        int b = 10*a1+a2; //MINUTES

        Toast.makeText(this,"Keep Pressing Me Babe!", Toast.LENGTH_SHORT).show();
        

        if(sw==0) {
            btn.setBackgroundColor(0xFFFF0000);
            clk.setTextColor(0xFF0000FF);
            sw=1;
        }

        else
        {
            btn.setBackgroundColor(0xFF77777);
            clk.setTextColor(0xFF000000);
            sw=0;
        }
    }

}
