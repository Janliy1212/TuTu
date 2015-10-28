import android.content.Context;
import android.media.MediaPlayer;

public class MusicSever {
	 private static MediaPlayer music;
	 //private static SoundPool soundPool;
     
	    	     
	    private static boolean musicSt = true; //音乐开关
	    private static Context context;
	     
	    //private static final int[] musicId = {R.raw.bg,R.raw.bg1,R.raw.bg2,R.raw.bg3};
	    //private static Map<Integer,Integer> soundMap; //音效资源id与加载过后的音源id的映射关系表
	     
	    /**
	     * 初始化方法
	     * @param c
	     */
	    public static void init(Context c)
	    {
	        context = c;
	 
	        initMusic();
	         
	        initSound();
	    }
	     
	    	     
	    //初始化音乐播放器
	    private static void initMusic()
	    {
	        int r = new Random().nextInt(musicId.length);
	        music = MediaPlayer.create(context,musicId[r]);
	        music.setLooping(true);
	    }
	     
	    
	   	 
	    /**
	     * 暂停音乐
	     */
	    public static void pauseMusic()
	    {
	        if(music.isPlaying())
	            music.pause();
	    }
	     
	    /**
	     * 播放音乐
	     */
	    public static void startMusic()
	    {
	        if(musicSt)
	            music.start();
	    }
	     
	    /**
	     * 切换一首音乐并播放
	     */
	    public static void changeAndPlayMusic()
	    {
	        if(music != null)
	            music.release();
	        initMusic();
	        startMusic();
	    }
	     
	    /**
	     * 获得音乐开关状态
	     * @return
	     */
	    public static boolean isMusicSt() {
	        return musicSt;
	    }
	     
	    /**
	     * 设置音乐开关
	     * @param musicSt
	     */
	    public static void setMusicSt(boolean musicSt) {
	        SoundPlayer.musicSt = musicSt;
	        if(musicSt)
	            music.start();
	        else
	            music.stop();
	    }
	 
	    