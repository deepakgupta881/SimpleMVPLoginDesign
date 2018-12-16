package com.example.deepak.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    private ILoginPresenter presenter;
    private EditText etName;
    private EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginPresenterImpl(this);
        etName = findViewById(R.id.et_name);
        etPass = findViewById(R.id.et_pass);

    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void loginClick(View view) {
        presenter.attemptLogin(etName.getText().toString(), etPass.getText().toString());

    }

    @Override
    public void showError() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
