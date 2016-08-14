package text.pdf.com.videoplayer;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;



import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;

/**
 * Created by T on 2016/8/12 0012.
 */
public class SimpleVideoView extends FrameLayout {

    public SimpleVideoView(Context context) {
        super(context);
    }

    public SimpleVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private String videoPath;

    private ImageView ivPreview;
    private ImageButton btnToggle;
    private ProgressBar progressBar;

    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;

    private MediaPlayer mediaPlayer;

    private boolean isPrepared; // 当前视频是否已准备好
    private boolean isPlaying; // 当前视频是否正在播放

    private void init() {
        Vitamio.isInitialized(getContext());
        LayoutInflater.from(getContext()).inflate(R.layout.view_simple_video_player, this, true);
        // surfaceview的初始化
        initSurfaceView();
        // 控制视图的初始化
        initControllerViews();

    }

    // 用来更新播放进度的handler
    private final Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };



    private void initControllerViews() {

    }

    private void initSurfaceView() {

    }

}
