/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package androidx.leanback.leanbackshowcase.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.leanback.leanbackshowcase.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.leanbackshowcase.app.page.PageAndListRowActivity;

/*
 * MainActivity class that loads MainFragment
 */
public class MainActivity extends FragmentActivity {

    EditText username;
    EditText password;
    Button loginButton;
    /**
     * Called when the activity is first created.
     */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    setContentView(R.layout.activity_splash);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // on below line we are
                            // creating a new intent
                            Intent i = new Intent(view.getContext(), PageAndListRowActivity.class);

                            // on below line we are
                            // starting a new activity.
                            startActivity(i);

                            // on the below line we are finishing
                            // our current activity.
                            finish();
                        }
                    }, 2000);

//                    setContentView(R.layout.activity_main);
//                    if (savedInstanceState == null) {
//                        Fragment fragment = new MainFragment();
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment)
//                                .commit();
//                    }
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


