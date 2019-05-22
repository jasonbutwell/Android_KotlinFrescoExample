package com.example.frescokotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView


class MainActivity : AppCompatActivity() {

    private val imageUrl = "https://raw.githubusercontent.com/facebook/fresco/master/docs/static/logo.png"
    private val imageUrlAnim = "https://media.giphy.com/media/YWf50NNii3r4k/giphy.gif"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up Fresco ready for use
        Fresco.initialize(this)

        setContentView(R.layout.activity_main)

        // Show image from a URL
//
//        findViewById<SimpleDraweeView>(R.id.my_image_viewTop)
//            .setImageURI( imageUrl )


        // Load and animate an animated gif

        findViewById<SimpleDraweeView>(R.id.my_image_viewBottom).controller =
            Fresco.newDraweeControllerBuilder()
                .setUri(imageUrlAnim)
                .setAutoPlayAnimations(true)
                .build();

        // Show image resource Drawable

        findViewById<SimpleDraweeView>(R.id.my_image_viewTop)
            .setActualImageResource( R.drawable.kotlinmeme )

    }

}

