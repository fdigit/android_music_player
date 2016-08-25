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

        playerTextView = (TextView) findViewById(R.id.menuPlaylists);
        playlistsTextView = (TextView) findViewById(R.id.menuPlayer);
        albumsTextView = (TextView) findViewById(R.id.menuAlbums);
        settingsTextView = (TextView) findViewById(R.id.menuSettings);

        playerTextView.setOnClickListener(playerTextViewOnClickListener);
        playlistsTextView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsTextView.setOnClickListener(albumsTextViewOnClickListener);
        settingsTextView.setOnClickListener(settingsTextViewOnClickListener);

    }

    final View.OnClickListener playlistsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlaylistsList(playlistsTextView);
        }
    };

    final View.OnClickListener playerTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlayerList(playerTextView);
        }
    };

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openAlbumsList(albumsTextView);
        }
    };

    final View.OnClickListener settingsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openSettingsList(settingsTextView);
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, AlbumsActivity.class);
        startActivity(intent);
    }

    public void openPlayerList(View view) {
        Intent intent = new Intent(this, PlayerActivity.class);
        startActivity(intent);
    }

    public void openPlaylistsList(View view) {
        Intent intent = new Intent(this, PlaylistsActivity.class);
        startActivity(intent);
    }

    public void openSettingsList(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}
