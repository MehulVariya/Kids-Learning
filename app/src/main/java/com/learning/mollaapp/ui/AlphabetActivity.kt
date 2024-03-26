package com.learning.mollaapp.ui

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.learning.mollaapp.R

class AlphabetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        val hurufTextView: TextView = findViewById(R.id.huruf)
        val huruf_a: ImageButton = findViewById(R.id.image_a)
        val huruf_b: ImageButton = findViewById(R.id.image_b)
        val huruf_c: ImageButton = findViewById(R.id.image_c)
        val huruf_d: ImageButton = findViewById(R.id.image_d)
        val huruf_e: ImageButton = findViewById(R.id.image_e)
        val huruf_f: ImageButton = findViewById(R.id.image_f)
        val huruf_g: ImageButton = findViewById(R.id.image_g)
        val huruf_h: ImageButton = findViewById(R.id.image_h)
        val huruf_i: ImageButton = findViewById(R.id.image_i)
        val huruf_j: ImageButton = findViewById(R.id.image_j)
        val huruf_k: ImageButton = findViewById(R.id.image_k)
        val huruf_l: ImageButton = findViewById(R.id.image_l)
        val huruf_m: ImageButton = findViewById(R.id.image_m)
        val huruf_n: ImageButton = findViewById(R.id.image_n)
        val huruf_o: ImageButton = findViewById(R.id.image_o)
        val huruf_p: ImageButton = findViewById(R.id.image_p)
        val huruf_q: ImageButton = findViewById(R.id.image_q)
        val huruf_r: ImageButton = findViewById(R.id.image_r)
        val huruf_s: ImageButton = findViewById(R.id.image_s)
        val huruf_t: ImageButton = findViewById(R.id.image_t)
        val huruf_u: ImageButton = findViewById(R.id.image_u)
        val huruf_v: ImageButton = findViewById(R.id.image_v)
        val huruf_w: ImageButton = findViewById(R.id.image_w)
        val huruf_x: ImageButton = findViewById(R.id.image_x)
        val huruf_y: ImageButton = findViewById(R.id.image_y)
        val huruf_z: ImageButton = findViewById(R.id.image_z)



        huruf_a.setOnClickListener {
            val teksView = "A - ay"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.alligator)
        }

        huruf_b.setOnClickListener {
            val teksView = "B - bee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.bear)
        }

        huruf_c.setOnClickListener {
            val teksView = "C - see"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.cat)
        }

        huruf_d.setOnClickListener {
            val teksView = "D - dee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.duck)
        }

        huruf_e.setOnClickListener {
            val teksView = "E - ee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.elephent)
        }

        huruf_f.setOnClickListener {
            val teksView = "F - ef"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.frog)
        }

        huruf_g.setOnClickListener {
            val teksView = "G - jee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.girrafe)
        }

        huruf_h.setOnClickListener {
            val teksView = "H - eich"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.hippo)
        }

        huruf_i.setOnClickListener {
            val teksView = "I - ai"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.iguana)
        }

        huruf_j.setOnClickListener {
            val teksView = "J - jay"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.jellyfish)
        }

        huruf_k.setOnClickListener {
            val teksView = "K - kay"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.koala)
        }

        huruf_l.setOnClickListener {
            val teksView = "L - el"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.monkey)
        }

        huruf_m.setOnClickListener {
            val teksView = "M - em"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.narwal)
        }

        huruf_n.setOnClickListener {
            val teksView = "N - en"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.lion)
        }

        huruf_o.setOnClickListener {
            val teksView = "O - ow"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.octopus)
        }

        huruf_p.setOnClickListener {
            val teksView = "P - pee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.pig)
        }

        huruf_q.setOnClickListener {
            val teksView = "Q - kyu"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.quertzal)
        }

        huruf_r.setOnClickListener {
            val teksView = "R - ar"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.rabbit)
        }

        huruf_s.setOnClickListener {
            val teksView = "S - es"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.snake)
        }

        huruf_t.setOnClickListener {
            val teksView = "T - tea"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.tiger)
        }

        huruf_u.setOnClickListener {
            val teksView = "U - yu"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.unicorn)
        }

        huruf_v.setOnClickListener {
            val teksView = "V - vee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.vampir)
        }

        huruf_w.setOnClickListener {
            val teksView = "W - double-yu"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.whale)
        }

        huruf_x.setOnClickListener {
            val teksView = "X - eks"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.xrayfish)
        }

        huruf_y.setOnClickListener {
            val teksView = "Y - wai"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.yat)
        }

        huruf_z.setOnClickListener {
            val teksView = "Z - zee"
            hurufTextView.text = teksView
            val gambar: ImageView = findViewById(R.id.gambar)
            gambar.setImageResource(R.drawable.zebra)
        }

    }

    }
