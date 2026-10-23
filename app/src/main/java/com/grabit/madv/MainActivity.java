package com.grabit.madv;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import com.grabit.madv.ui.ComposeLauncher;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComposeView composeView = findViewById(R.id.compose_view);
        if (composeView != null) {
            ComposeLauncher.setShoppingScreenContent(composeView);
        }
    }
}
