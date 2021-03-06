package com.example.iaso.iaso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditMedicineActivity extends AppCompatActivity {

    private Button saveButton;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_medicine);

        saveButton = (Button)findViewById(R.id.save_med_button);
        backButton = (Button)findViewById(R.id.back_no_save);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //save changes, return to medicine detail
                String savedChanges = "Saved changes, back to medicine detail";
                Intent save_go_back = new Intent (EditMedicineActivity.this, MedicineDetailActivity.class);
                save_go_back.putExtra("Success", savedChanges);
                startActivity(save_go_back);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go back to medicine detail, don't save changes.  Replace with hamburger menu navigation
                String noSave = "Going back, no save";
                Intent back_no_save = new Intent (EditMedicineActivity.this, MedicineDetailActivity.class);
                back_no_save.putExtra("Success", noSave);
                startActivity(back_no_save);
            }
        });
    }
}
