package com.example.safetymanager;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJsa,btnBsafe,btnDrill,btnPtw,btnMsd,btnChk,btnAudit,btnCrewBoat,btnHh,btnInspect,btnEvent,btnWorkRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setTitle("JOB SAFETY MANAGER");

        btnJsa = (Button)findViewById(R.id.btn_jsa);
        btnBsafe = (Button)findViewById(R.id.btn_bsafe);
        btnDrill = (Button)findViewById(R.id.btn_drill);
        btnInspect = (Button)findViewById(R.id.btn_inspect);
        btnPtw = (Button)findViewById(R.id.btn_ptw);
        btnChk = (Button)findViewById(R.id.btn_chk);
        btnAudit = (Button)findViewById(R.id.btn_audit);
        btnCrewBoat = (Button)findViewById(R.id.btn_crewboat);
        btnHh = (Button)findViewById(R.id.btn_hh);
        btnMsd = (Button)findViewById(R.id.btn_msd);
        btnEvent = (Button)findViewById(R.id.btn_event);
        btnWorkRest = (Button)findViewById(R.id.btn_work);


        btnJsa.setOnClickListener(this);
        btnBsafe.setOnClickListener(this);
        btnDrill.setOnClickListener(this);
        btnPtw.setOnClickListener(this);
        btnInspect.setOnClickListener(this);
        btnChk.setOnClickListener(this);
        btnAudit.setOnClickListener(this);
        btnCrewBoat.setOnClickListener(this);
        btnHh.setOnClickListener(this);
        btnMsd.setOnClickListener(this);
        btnEvent.setOnClickListener(this);
        btnWorkRest.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_event:
                runActivity("com.example.eventrecord", "com.example.eventrecord.SplashActivity");
                break;

            case R.id.btn_work:
                runActivity("com.example.workhours", "com.example.workhours.LoadingActivity");
                break;

            case R.id.btn_bsafe:
                runActivity("com.example.geka.bsafedemo", "com.example.geka.bsafedemo.SplashActivity");
                break;

            case R.id.btn_jsa:
                runActivity("com.kuzi.noutuser.jsademo", "com.kuzi.noutuser.jsademo.SplashActivity");
                break;

            case R.id.btn_ptw:
                runActivity("com.example.geka.permittowork", "com.example.geka.permittowork.StartActivity");
                break;


            case R.id.btn_chk:
                runActivity("com.example.geka.checklists", "com.example.geka.checklists.StartActivity");
                break;


            case R.id.btn_audit:
                runActivity("com.example.geka.audit", "com.example.geka.audit.SplashActivity");
                break;


            case R.id.btn_drill:
                runActivity("com.example.geka.drillreport", "com.example.geka.drillreport.StartActivity");
                break;


            case R.id.btn_hh:
                runActivity("com.example.geka.hazardshunt", "com.example.geka.hazardshunt.SplashActivity");
                break;


            case R.id.btn_crewboat:
                runActivity("com.example.surfer", "com.example.surfer.LaunchActivity");
                break;


            case R.id.btn_msd:
                runActivity("com.example.geka.msd", "com.example.geka.msd.SplashActivity");
                break;


            case R.id.btn_inspect:
                runActivity("com.example.geka.hygieneinspection", "com.example.geka.hygieneinspection.StartActivity");
                break;

        }
    }


    //==============================================================================================
    //::::::::::::::::::::::::::::: runActivity ::::::::::::::::::::::::::::::::::::::::::::::::::::
    //==============================================================================================
    public  void runActivity(String pkgName,String className){

        finish();
        try {
            Intent Intent = new Intent(android.content.Intent.ACTION_MAIN);
            Intent.setComponent(new ComponentName(pkgName, className));
            startActivity(Intent);
        }catch (Exception ex){
            Toast.makeText(MainActivity.this,"Application is not installed or damaged",Toast.LENGTH_SHORT).show();
        }

    }


}
