package com.example.lofl

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_input_room.*

class input_room : AppCompatActivity() {

    lateinit var runnable: Runnable
    private var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_room)


        val mediaplayer: MediaPlayer = MediaPlayer.create(this, R.raw.music)
        seekbar.progress = 0
        seekbar.max = mediaplayer.duration



        playButton.setOnClickListener{
            if(!mediaplayer.isPlaying){
                mediaplayer.start()
                playButton.setImageResource(R.drawable.baseline_pause_24)
            }
            else{
                mediaplayer.pause()
                playButton.setImageResource(R.drawable.baseline_play_arrow_24)
            }
        }

        seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, pos: Int, changed: Boolean) {
                if(changed){
                    mediaplayer.seekTo(pos)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        runnable = Runnable {
            seekbar.progress = mediaplayer.currentPosition
            handler.postDelayed(runnable,1000)
        }

        handler.postDelayed(runnable,1000)
        mediaplayer.setOnCompletionListener {
            playButton.setImageResource(R.drawable.baseline_play_arrow_24)
            seekbar.progress = 0
        }

    }
}