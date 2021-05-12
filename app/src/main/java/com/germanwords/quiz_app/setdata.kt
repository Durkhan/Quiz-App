package com.germanwords.quiz_app

import android.content.Context
import com.bumptech.glide.Glide


object setdata {
    const val name:String="name"
    const val score:String="score"

    fun getquestion():ArrayList<Questiondata>{
        var que:ArrayList<Questiondata> = arrayListOf()
        var q1=Questiondata(
         "https://www.backwoodshome.com/bhm/wp-content/uploads/2015/12/blocks-bricks-brickwall-761142.jpg",
            1,
                "die Mauer",
                     "die Sammlung",
                     "die Bücherei",
                     "der Kopftuch",
                     1



        )
        var q2=Questiondata(
"https://im-media.voltron.voanews.com/Drupal/01live-166/styles/sourced/s3/2020-04/ap_paper.jpg?itok=pevRrI3j",
            2,
            "die Haustier",
            "die Hochzeit",
            "die Zeitung",
            "das Notizbuch",
            3



        )
        var q3=Questiondata(
                "https://cdn.nohat.cc/thumb/f/720/5406779559116800.jpg",
            3,
            "die Ausfahrt",
            "der Apfel",
            "der Rat",
            "die Ampel",
            4



        )
        var q4=Questiondata(
                "https://littlespurspedi.com/wp-content/uploads/2016/05/cough.jpg",
            4,
            "der Husten",
            "der Durchfal",
            "der Blutdruck",
            "der Kopf",
            1



        )
        var q5=Questiondata(
            "https://clubsolaris.com/imgs/tips-to-take-care-of-the-beach-during-your-vacations/beach-sea-cancun-sun.png",
            1,
            "der Kunde",
            "der Strand",
            "der Zelt",
            "das Bein",
            2



        )
        var q6=Questiondata(
            "https://cdn-5c84bc36-b681cbc1.mysagestore.com//050a7bb5635ac2c48f7ed1fc51b23f4e/contents/020212-0005X/020212-0150_03.jpg",
            1,
            "das Becher",
            "die Tafel",
            "das Getränk",
            "der Schnee",
            1



        )
        var q7=Questiondata(
            "https://images.newindianexpress.com/uploads/user/imagelibrary/2020/1/12/w900X450/Common-test.jpg",
            1,
            "der Himmel",
            "die Anrede",
            "die Bücherei",
            "die Prüfung",
            4



        )
        var q8=Questiondata(
            "https://m.economictimes.com/thumb/msid-77139423,width-1200,height-900,resizemode-4,imgsize-245256/money-gety-2.jpg",
            1,
            "die Einnahme",
            "das Soll",
            "die Münze",
            "die Miete",
            3



        )
        var q9=Questiondata(
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/heating-radiator-1538476707.jpg",
            1,
            "die Ahnung",
            "die Heizung",
            "der Pfeifton",
            "der Strom",
            2



        )
        var q10=Questiondata(
            "https://www.treehugger.com/thmb/J22P-FvKN_Fv_FBpJol5NM0x7mM=/768x768/smart/filters:no_upscale()/__opt__aboutcom__coeus__resources__content_migration__mnn__images__2016__02__fog-bitterroot-mountains-4807feab43334256aded341517fae38f.jpg",
            1,
            "der Fog",
            "der Donner",
            "der Himmel",
            "der Grad",
            1



        )
        var q11=Questiondata(
            "https://englishhelponline.files.wordpress.com/2010/04/ng.jpg?w=390",
            1,
            "close",
            "klären",
            "heiß",
            "langweilig",
            4



        )
        var q12=Questiondata(
            "https://image.shutterstock.com/image-vector/man-running-jumping-sequence-vector-260nw-749355724.jpg",
            1,
            "die Reihenfolge",
            "die Auskunft",
            "die Leitung",
            "die Bluse",
            1



        )

        var q13=Questiondata(
            "https://res.cloudinary.com/env-imgs/images/f_auto/shopimages/products/1200/B02C5/c5-recycled-fleck-kraft-envelopes.jpg",
            1,
            "das Kuvert",
            "die Sammlung",
            "die Bücherei",
            "der Kopftuch",
            1



        )
        var q14=Questiondata(
            "https://rukminim1.flixcart.com/image/714/857/jiulk7k0/cap/g/r/v/free-hat-peter-india-original-imaf6gzbhh7pydzy.jpeg?q=50",
            1,
            "der Hut",
            "die Sammlung",
            "die Bluse",
            "der Kopftuch",
            1



        )
        var q15=Questiondata(
            "https://caspiannews.com/media/caspian_news/all_original_photos/1553767366_6157067_1553767284_8334658244774068.jpg",
            1,
            "die Wohnunganzeige",
            "die Sammlung",
            "der Zug",
            "der Kopftuch",
            3



        )
        var q16=Questiondata(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/2006-06-22_12-37-59_Seychelles_-_Machabee_%28Sainte_Anne_Island%29.jpg/1200px-2006-06-22_12-37-59_Seychelles_-_Machabee_%28Sainte_Anne_Island%29.jpg",
            1,
            "die Wohnunganzeige",
            "die Insel",
            "der Himmel",
            "der Kopftuch",
            2



        )
        var q17=Questiondata(
            "https://images.obi.de/product/DE/1500x1500/783748_3.jpg",
            1,
            "die Mauer",
            "die Sammlung",
            "die Bücherei",
            "die Ecke",
            4



        )
        var q18=Questiondata(
            "https://images2.minutemediacdn.com/image/upload/c_crop,h_2187,w_3883,x_0,y_395/f_auto,q_auto,w_1100/v1562077101/shape/mentalfloss/30738-gettyimages-845816364.jpg",
            1,
            "die Mülltonne",
            "die Ecke",
            "die Fieber",
            "die Leitung",
            1



        )
        var q19=Questiondata(
                "https://www.zurich.com/-/media/project/zurich/dotcom/industry-knowledge/earthquakes-and-tsunamis/images/stage-preparing-your-business-to-earthquakes.jpg?h=1250&la=it-IT&w=2500&rev=422552702c75474593c4980755685983&hash=E4E28E2FCE7A969104874B137E38B034",
        1,
        "das Erdbeben",
        "die Betonung",
        "das Wetter",
        "das Zelt",
        1



        )
        var q20=Questiondata(
                "data:image/jpeg;base64,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",
        1,
        "die Kasse",
        "die Sammlung",
        "das Stück",
        "der Käse",
        4



        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        que.add(q6)
        que.add(q7)
        que.add(q8)
        que.add(q9)
        que.add(q10)
        que.add(q11)
        que.add(q12)
        que.add(q13)
        que.add(q14)
        que.add(q15)
        que.add(q16)
        que.add(q17)
        que.add(q18)
        que.add(q19)
        que.add(q20)


        return que
    }
}