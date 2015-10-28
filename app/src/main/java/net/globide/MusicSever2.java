import android.content.Context;
import android.media.MediaPlayer;

public class MusicSever2 {
	 private static MediaPlayer music;
	 private static SoundPool soundPool;
     
	    private static boolean soundSt = true; 
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
	         
	       // initSound();
	    }
	     
	    //��ʼ����Ч������
	    private static void initSound()
	    {
	        soundPool = new SoundPool(10,AudioManager.STREAM_MUSIC,100);
	         
	        soundMap = new HashMap<Integer,Integer>();
	        soundMap.put(R.raw.itemboom, soundPool.load(context, R.raw.itemboom, 1));
	        soundMap.put(R.raw.sel, soundPool.load(context, R.raw.sel, 1));
	    }
	     
	    
	     
	    /**
	     * ������Ч
	     * @param resId ��Ч��Դid
	     */
	    public static void playSound(int resId)
	    {
	        if(soundSt == false)
	            return;
	         
	        Integer soundId = soundMap.get(resId);
	        if(soundId != null)
	          soundPool.play(soundId, 1, 1, 1, 0, 1);
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
	     
	    
	    public static void changeAndPlayMusic()
	    {
	        if(music != null)
	            music.release();
	        initMusic();
	        startMusic();
	    }
	     
	    	 
	    /**
	     * �����Ч����״̬
	     * @return
	     */
	    public static boolean isSoundSt() {
	        return soundSt;
	    }
	 
	    /**
	     * ������Ч����
	     * @param soundSt
	     */
	    
	}

}