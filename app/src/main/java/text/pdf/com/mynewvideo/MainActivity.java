package text.pdf.com.mynewvideo;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;

import butterknife.OnClick;
import text.pdf.com.videoplayer.VideoViewActivity;

public class MainActivity extends AppCompatActivity {

    private String testVideo1;
    private Button btnLocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLocal = (Button) findViewById(R.id.btnLocal);
        btnLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Death Knight", Toast.LENGTH_SHORT).show();
                demoPlay();
            }
        });
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        ButterKnife.bind(this);
    }

    public void demoPlay() {
        // 开启VideoViewActivity进行视频播放
        VideoViewActivity.open(this, getTestVideo1());
    }

    public String getTestVideo1() {
        return "http://o9ve1mre2.bkt.clouddn.com/raw_%E6%B8%A9%E7%BD%91%E7%94%B7%E5%8D%95%E5%86%B3%E8%B5%9B.mp4";
    }
    @OnClick(R.id.btnLikes)
    public void click(){
        Toast.makeText(MainActivity.this, "带你带你飞", Toast.LENGTH_SHORT).show();
    }
}
