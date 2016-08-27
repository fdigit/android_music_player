package eu.laramartin.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlayerActivity extends AppCompatActivity {

    ImageView playerMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        playerMenuView = (ImageView) findViewById(R.id.playerMenuView);
        playerMenuView.setOnClickListener(playerMenuViewOnClickListener);
    }

    final View.OnClickListener playerMenuViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openMenu(playerMenuView);
        }
    };

    public void openMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
