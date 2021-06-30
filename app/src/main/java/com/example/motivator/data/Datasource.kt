package com.example.motivator.data

import com.example.motivator.R
import com.example.motivator.model.Motivator

class Datasource {
    fun loadAffirmations(): List<Motivator> {
        return listOf<Motivator>(
                Motivator(R.string.affirmation1, R.drawable.image1),
                Motivator(R.string.affirmation2, R.drawable.image2),
                Motivator(R.string.affirmation3, R.drawable.image3),
                Motivator(R.string.affirmation4, R.drawable.image4),
                Motivator(R.string.affirmation5, R.drawable.image5),
                Motivator(R.string.affirmation6, R.drawable.image6),
                Motivator(R.string.affirmation7, R.drawable.image7),
                Motivator(R.string.affirmation8, R.drawable.image8),
                Motivator(R.string.affirmation9, R.drawable.image9),
                Motivator(R.string.affirmation10, R.drawable.image10)
        )

    }
}