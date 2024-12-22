package com.womenhealth;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize classes
        CycleTracker cycleTracker = new CycleTracker(28, 1); // Example: 28-day cycle, day 1
        MoodAdvisor moodAdvisor = new MoodAdvisor();
        WeatherOutfit weatherOutfit = new WeatherOutfit();

        // Set data
        moodAdvisor.setMood("happy");
        weatherOutfit.setWeather("cold");

        // Get UI elements
        TextView cyclePhaseText = findViewById(R.id.cyclePhaseText);
        TextView moodAdviceText = findViewById(R.id.moodAdviceText);
        TextView outfitText = findViewById(R.id.outfitText);

        // Set text dynamically based on logic
        cyclePhaseText.setText("Current Phase: " + cycleTracker.getCurrentPhase());
        moodAdviceText.setText("Mood Advice: " + moodAdvisor.getAdvice());
        outfitText.setText("Outfit Suggestion: " + weatherOutfit.suggestOutfit());
    }
}
