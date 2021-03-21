package com.example.helloworld;


import com.example.helloworld.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView text;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdian,bqingchu;
	Button bjia,bjian,bcheng,bchu,bdengyu;
	String osum="";
	char op;
	double num1=0,num2=0,sum=0;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        key_ting();
    }

private void key_ting(){
	b0=(Button)findViewById(R.id.a0);
	b1=(Button)findViewById(R.id.a1);
	b2=(Button)findViewById(R.id.a2);
	b3=(Button)findViewById(R.id.a3);
	b4=(Button)findViewById(R.id.a4);
	b5=(Button)findViewById(R.id.a5);
	b6=(Button)findViewById(R.id.a6);
	b7=(Button)findViewById(R.id.a7);
	b8=(Button)findViewById(R.id.a8);
	b9=(Button)findViewById(R.id.a9);
	bdian=(Button)findViewById(R.id.dian);
	bqingchu=(Button)findViewById(R.id.qingchu);
	bjia=(Button)findViewById(R.id.jia);
	bjian=(Button)findViewById(R.id.jian);
	bcheng=(Button)findViewById(R.id.cheng);
	bchu=(Button)findViewById(R.id.chu);
	bdengyu=(Button)findViewById(R.id.dengyu);
	text=(TextView)findViewById(R.id.textView1);
	b0.setOnClickListener(this);
	b1.setOnClickListener(this);
	b2.setOnClickListener(this);
	b3.setOnClickListener(this);
	b4.setOnClickListener(this);
	b5.setOnClickListener(this);
	b6.setOnClickListener(this);
	b7.setOnClickListener(this);
	b8.setOnClickListener(this);
	b9.setOnClickListener(this);
	bdian.setOnClickListener(this);
	bqingchu.setOnClickListener(this);
	bjia.setOnClickListener(this);
	bjian.setOnClickListener(this);
	bcheng.setOnClickListener(this);
	bchu.setOnClickListener(this);
	bdengyu.setOnClickListener(this);
	
	
	
	
}
@SuppressWarnings("unused")
private Button findviewById(Class<id> class1){
	return null;
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
		switch (v.getId()){
		case R.id.a0:
			osum+='0';
			text.setText(osum);
			break;
		case R.id.a1:
			osum+='1';
			text.setText(osum);
			break;	
		case R.id.a2:
			osum+='2';
			text.setText(osum);
			break;	
		case R.id.a3:
			osum+='3';
			text.setText(osum);
			break;	
		case R.id.a4:
			osum+='4';
			text.setText(osum);
			break;	
		case R.id.a5:
			osum+='5';
			text.setText(osum);
			break;	
		case R.id.a6:
			osum+='6';
			text.setText(osum);
			break;	
		case R.id.a7:
			osum+='7';
			text.setText(osum);
			break;	
		case R.id.a8:
			osum+='8';
			text.setText(osum);
			break;	
		case R.id.a9:
			osum+='9';
			text.setText(osum);
			break;	
		case R.id.jia:
			osum+='+';
			op='+';
			text.setText(osum);
			break;
		case R.id.jian:
			osum+='-';
			op='-';
			text.setText(osum);
			break;	
		case R.id.cheng:
			osum+='*';
			op='*';
			text.setText(osum);
			break;	
		case R.id.chu:
			osum+='/';
			op='/';
			text.setText(osum);
			break;	
		case R.id.dian:
			osum+='.';
			op='.';
			text.setText(osum);
			break;

		case R.id.qingchu:
			if(osum.length()>=1)
			{osum=osum.substring(0,osum.length()-1);}
			text.setText(osum);
			break;	
		case R.id.dengyu:
			osum=osum+"="+String.valueOf(equals(osum));
			text.setText(osum);
		}

	

}

public double equals(String OperateSum)        
{
    int i=0;
    i=OperateSum.indexOf(op,1);         
    if(OperateSum.length()>=3)
    {
        num1=Double.parseDouble(OperateSum.substring(0, i));  
        num2=Double.parseDouble(OperateSum.substring(i + 1, OperateSum.length()));   
    }
    if(op=='+')
    {
    	sum=num1+num2;
    	
    }
    else if(op=='-')
    { sum=num1-num2;
    }
    else if(op=='*')
    {
    	sum=num1*num2;
    	
    }
    else if(op=='/')
    {sum=num1/num2;
    }
    return sum;       
}
   

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
       
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
}
