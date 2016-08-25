package eu.laramartin.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView playerTextView;
    TextView playlistsTextView;
    TextView albumsTextView;
    TextView settingsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        albumsTextView = (TextView) findViewById(R.id.menuAlbums);
        albumsTextView.setOnClickListener(albumsTextViewOnClickListener);

    }

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            Toast.makeText(MainActivity.this, "albums clicked", Toast.LENGTH_SHORT).show();
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, Albums.class);
        startActivity(intent);
    }

}
