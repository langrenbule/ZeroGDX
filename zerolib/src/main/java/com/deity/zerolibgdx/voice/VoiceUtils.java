package com.deity.zerolibgdx.voice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

/**
 * 声音工具集，对声音进行二次额封装
 * Created by Deity on 2016/12/26.
 */

public class VoiceUtils {

    /**加载音乐*/
    public static Music loadMusic(String mFileMusicPath){
        return Gdx.app.getAudio().newMusic(Gdx.files.internal(mFileMusicPath));
    }

    public static Sound loadSound(String mFileSoundPath){
        return Gdx.app.getAudio().newSound(Gdx.files.internal(mFileSoundPath));
    }
}
