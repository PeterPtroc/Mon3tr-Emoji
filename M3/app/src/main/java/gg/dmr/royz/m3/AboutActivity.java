package gg.dmr.royz.m3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // 设置版本信息
        setupVersionInfo();

        // 设置点击事件
        setupClickListeners();
    }

    private void setupVersionInfo() {
        TextView versionText = findViewById(R.id.version_text);
        try {
            String versionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            versionText.setText("版本 " + versionName);
        } catch (Exception e) {
            versionText.setText("版本 1.0.0");
        }
    }

    private void setupClickListeners() {
        // GitHub贡献者
    MaterialCardView githubCard = findViewById(R.id.github_card);
    githubCard.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://github.com/PeterPtroc/Mon3tr-Emoji.git"));
        startActivity(intent);
    });

        // 开源协议
    MaterialCardView licenseCard = findViewById(R.id.license_card);
    licenseCard.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://github.com/PeterPtroc/Mon3tr-Emoji.git"));
        startActivity(intent);
    });
    }
}
