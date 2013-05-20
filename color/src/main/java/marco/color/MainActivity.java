package marco.color;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
    Button redButton, blueButton, yellowButton, greenButton, whiteButton;
    View background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = findViewById(R.id.background);

        redButton = (Button)findViewById(R.id.button_red);
        blueButton = (Button)findViewById(R.id.button_blue);
        yellowButton = (Button)findViewById(R.id.button_yellow);
        greenButton = (Button)findViewById(R.id.button_green);
        whiteButton = (Button)findViewById(R.id.button_white);

        redButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        whiteButton.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_red: background.setBackgroundColor(Color.RED); break;
            case R.id.button_blue: background.setBackgroundColor(Color.BLUE); break;
            case R.id.button_yellow: background.setBackgroundColor(Color.YELLOW); break;
            case R.id.button_green: background.setBackgroundColor(Color.GREEN); break;
            case R.id.button_white: background.setBackgroundColor(Color.WHITE); break;
        }
    }
}
