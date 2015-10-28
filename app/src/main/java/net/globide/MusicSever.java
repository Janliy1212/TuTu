import android.content.Context;
import android.media.MediaPlayer;

public class MusicSever {
	 private static MediaPlayer music;
	 //private static SoundPool soundPool;
     
	    	     
	    private static boolean musicSt = true; //���ֿ���
	    private static Context context;
	     
	    //private static final int[] musicId = {R.raw.bg,R.raw.bg1,R.raw.bg2,R.raw.bg3};
	    //private static Map<Integer,Integer> soundMap; //��Ч��Դid����ع������Դid��ӳ���ϵ��
	     
	    /**
	     * ��ʼ������
	     * @param c
	     */
	    public static void init(Context c)
	    {
	        context = c;
	 
	        initMusic();
	         
	        initSound();
	    }
	     
	    	     
	    //��ʼ�����ֲ�����
	    private static void initMusic()
	    {
	        int r = new Random().nextInt(musicId.length);
	        music = MediaPlayer.create(context,musicId[r]);
	        music.setLooping(true);
	    }
	     
	    
	   	 
	    /**
	     * ��ͣ����
	     */
	    public static void pauseMusic()
	    {
	        if(music.isPlaying())
	            music.pause();
	    }
	     
	    /**
	     * ��������
	     */
	    public static void startMusic()
	    {
	        if(musicSt)
	            music.start();
	    }
	     
	    /**
	     * �л�һ�����ֲ�����
	     */
	    public static void changeAndPlayMusic()
	    {
	        if(music != null)
	            music.release();
	        initMusic();
	        startMusic();
	    }
	     
	    /**
	     * ������ֿ���״̬
	     * @return
	     */
	    public static boolean isMusicSt() {
	        return musicSt;
	    }
	     
	    /**
	     * �������ֿ���
	     * @param musicSt
	     */
	    public static void setMusicSt(boolean musicSt) {
	        SoundPlayer.musicSt = musicSt;
	        if(musicSt)
	            music.start();
	        else
	            music.stop();
	    }
	 
	    